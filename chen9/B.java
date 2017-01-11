package shiyan1_13;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class B extends JFrame implements Runnable,ActionListener{  
	
   JTextField outMessage=new JTextField(12);
   JTextArea inMessage=new JTextArea(12,20); 
   JButton b=new JButton("发送数据");
   BufferedWriter bwin=null;
   BufferedWriter bwout=null;
   
   public B() {
      super("I AM B");
      setSize(320,200);
      JPanel p=new JPanel();
      b.addActionListener(this);
      p.add(outMessage);
      p.add(b);
      add(p,BorderLayout.NORTH);
      add(new JScrollPane(inMessage),BorderLayout.CENTER);
      setVisible(true);
      pack();
      Thread thread=new Thread(this);
      addWindowListener(new WindowDestroyer());
      try { 
          bwin=new BufferedWriter(new FileWriter("B_in_log.txt",true));
          bwout=new BufferedWriter(new FileWriter("B_out_log.txt",true));
      }catch(IOException e){e.printStackTrace();}
      thread.start();
   }
   
   
   @SuppressWarnings("resource")
public void actionPerformed(ActionEvent event){
      String outmsg=outMessage.getText();
      if("".equals(outmsg)) {} 
      else {
    	  byte b[]=outmsg.trim().getBytes();
    	  try {
            InetAddress address=InetAddress.getByName("127.0.0.1");
            DatagramPacket data=new DatagramPacket(b,b.length,address,5678);
            DatagramSocket mail=new DatagramSocket();
            bwout.write("发送:"+address.getHostAddress()+"\t时间:"+(new java.util.Date()));
            bwout.write("\t内容:"+outmsg);
            bwout.newLine();
            bwout.flush();
            mail.send(data);
      }catch(Exception e){} 
      outMessage.setText(null);
      }
   } 
   
   
   @SuppressWarnings("resource")
public void run() {
      DatagramPacket pack=null;
      DatagramSocket mail=null;
      byte b[]=new byte[8192];
      try { 
            pack=new DatagramPacket(b,b.length);
            mail=new DatagramSocket(1234);
      }catch(Exception e){} 
      while(true){   
           try{  
        	   	 mail.receive(pack); 
                 String message=new String(pack.getData(),0,pack.getLength());
                 inMessage.append("收到数据来自："+pack.getAddress());
                 inMessage.append("\n收到数据是："+message+"\n");
                 inMessage.setCaretPosition(inMessage.getText().length());
                 bwin.write("收到:"+pack.getAddress()+"\t");
                 bwin.write("时间:"+(new java.util.Date())+"\t");
                 bwin.write("内容:"+message);
                 bwin.newLine();
                 bwin.flush();
           }catch(Exception e){}
       } 
   }
   
   public static void main(String args[]){
       new B();
   }
   
   class WindowDestroyer extends WindowAdapter {
       public void windowClosing(WindowEvent e) {
           try {
               bwin.close();
               bwout.close();
           }catch(IOException e1){}
           System.exit(0);
       }
    }
} 
