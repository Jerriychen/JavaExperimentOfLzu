package shiyan1_13;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.event.*;
@SuppressWarnings("serial")
public class minibrowser extends JFrame implements ActionListener,Runnable {
	JButton button;
	URL url;
	JTextField text;
	JEditorPane editPane;
	byte b[]=new byte[128];
	Thread thread;
	
	public minibrowser() {
		text=new JTextField(20);
		button=new JButton("确定");
		button.addActionListener(this);
		thread=new Thread(this);
		JPanel p=new JPanel();
		p.add(new JLabel("输入网址："));
		p.add(text); p.add(button);
		
		editPane=new JEditorPane();
		editPane.setEditable(false);
		
		Container con=getContentPane();
		con.add(new JScrollPane(editPane),BorderLayout.CENTER);
		con.add(p,BorderLayout.NORTH);
		setBounds(200,100,560,460);
		setVisible(true);
		validate();			//布置组件
		
		
//		add(new JScrollPane(editPane),BorderLayout.CENTER);
//		add(p,BorderLayout.NORTH);
//		setBounds(200,100,560,460);
//		setVisible(true);
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		editPane.addHyperlinkListener(new HyperlinkListener() {
			public void hyperlinkUpdate(HyperlinkEvent e){
				if (e.getEventType()==HyperlinkEvent.EventType.ACTIVATED) {
					try {
						editPane.setPage(e.getURL());
					} catch(IOException e1) {
						editPane.setText(""+e1);
					}
				}
			}
		});
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (!(thread.isAlive())) 
			thread=new Thread(this);
		try {
			thread.start();
		} catch(Exception e1) {
			text.setText("我正在读取"+url);
		}
	}
	@SuppressWarnings("unused")
	public void run() {
		try {
			int n=-1;
			editPane.setText(null);
			editPane.setContentType("text/html");
			url=new URL(text.getText().trim());
			editPane.setPage(url);
		} catch(MalformedURLException e1) {
			text.setText(""+e1);
			return;
		} catch(IOException e2) {
			text.setText(""+e2);
			return;
		}
	}
	
	public static void main(String[] args) {
		new minibrowser();
	}
	
}
