package shiyan1_13;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
@SuppressWarnings({ "serial", "unused" })
public class ReadFile extends JApplet implements ActionListener,Runnable {
	File file;
	@SuppressWarnings("rawtypes")
	JComboBox choice;
	JTextArea text;
	Thread thread;
	String item = null;
	JButton button;
	URL url;
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public void init() {
		choice = new JComboBox();
		thread = new Thread(this);
		for (int i = 1;  i<= 3; i++) {
			choice.addItem(getParameter(String.valueOf(i)));
		}
		button = new JButton("开始读取");
		
		text = new JTextArea();
		text.setEditable(false);
		JScrollPane messageScrollPane = new JScrollPane(text,
			JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
			JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		messageScrollPane.revalidate();

		setLayout(new BorderLayout());
		button.addActionListener(this);
		Panel jp1 = new Panel(new GridLayout(1, 2));
		jp1.add(choice);
		jp1.add(button);
		add(jp1,BorderLayout.NORTH);
		add(messageScrollPane,BorderLayout.CENTER);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		text.setText(null);
		item = ""+choice.getSelectedItem();
		item = item.trim();
		if(!(thread.isAlive())) {
			thread = new Thread(this);
		}
		try {
			thread.start();
		}catch(Exception exp) {}
	}
	
	
	public void run() {
		try {
			url = new URL(getCodeBase(),item);		//返回当前文件的路径:确切的说是class文件的路径
			String str = null;
			BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
			while((str = reader.readLine()) != null) {
				text.append(str);
				text.append("\n");
			}
		}catch(Exception ee){}
	}
}
