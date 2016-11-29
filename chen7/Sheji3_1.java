package shiyan1_9;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class Sheji3_1 extends Frame implements ActionListener {
	 TextField a;
	 int count = 1;
	 public Sheji3_1() {}
	
	 public void init() {
		setTitle("设计实验3-1");
		Panel p = new Panel();
		Button btn1 = new Button("确认");
		btn1.addActionListener(this);
		Button btn2 = new Button("清除");
		btn2.addActionListener(this);
		p.add(btn1);
		p.add(btn2);
		Panel q = new Panel();
		a = new TextField(40);
		q.add(new Label("姓名"));
		q.add(a);
		
		add(q,BorderLayout.NORTH);
		add(p,BorderLayout.SOUTH);
		addWindowListener(new WindowCloser());
		pack();
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
			if(count==1&&e.getActionCommand().equals("确认")) {
				String s = a.getText();
				a.setText("你好"+s+"!欢迎你使用java编程");
				count++;
			}
			if( e.getActionCommand().equals("清除")) {
				count=1;
				a.setText("");
			}
	}
	
	public static void main(String[] args) {
		new Sheji3_1().init();
	}

}
