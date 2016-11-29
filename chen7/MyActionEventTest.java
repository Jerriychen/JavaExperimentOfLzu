package shiyan1_9;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Canvas;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
class Sheji3_2 extends Canvas {
	private int flag;
	public Sheji3_2() {
		flag = 0;
	}
	public int getFlag() {
		return flag;
	}
	
	public void setFlag(int i) {
		flag = i;
	}
	
	public void paint(Graphics g) {
		g.drawLine(1,1,400, 1);
		g.drawLine(1,1,1, 220);
		g.drawLine(1,110,400, 110);
		int x,y;
		switch(flag) {
		case 1:
			for(int i=0;i<400;i++){
				x=i;
				y=110-(int)(100*Math.sin(x*Math.PI/180.0));
				g.drawLine(x, y, x, y);
			}
			break;
		case 2:
			for(int i=0;i<400;i++){
				x=i;
				y=110-(int)(100*Math.cos(x*Math.PI/180.0));
				g.drawLine(x, y, x, y);
			}
			break;
		case 3:
			for(int i=0;i<400;i++){
				x=i;
				y=110-(int)(4*Math.sqrt(x));
				g.drawLine(x, y, x, y);
			}
			break;
		case 4:
			Toolkit tool = this.getToolkit();
	        Image img = tool.getImage("/Users/chenzzh/Desktop/zuoye.png");
			g.drawImage(img,0,0,this);
		default: break;
		}
	}
}


@SuppressWarnings("serial")
public class MyActionEventTest extends Frame {
	Panel p1;
	Button b1,b2,b3,b4;
	Sheji3_2 she;
	public MyActionEventTest() {
		setTitle("画图演示");
		she = new Sheji3_2();
		b1 = new Button("sin");
		b2 = new Button("cos");
		b3 = new Button("sqrt");
		b4 = new Button("image");
		p1 = new Panel();
		p1.add(b1);
		p1.add(b2);
		p1.add(b3);
		p1.add(b4);
		
		myListener m1 = new myListener();
		b1.addActionListener(m1);
		b2.addActionListener(m1);
		b3.addActionListener(m1);
		b4.addActionListener(m1);
		this.add(p1, BorderLayout.NORTH);
		this.add(she, BorderLayout.CENTER);
	}
	
	private class myListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			if(e.getActionCommand().equals("sin")) {
				she.setFlag(1);
				she.repaint();
			}
			else if(e.getActionCommand().equals("cos")) {
				she.setFlag(2);
				she.repaint();
			}
			else if(e.getActionCommand().equals("image")) {
				she.setFlag(4);
				she.repaint();
			}
			else {
				she.setFlag(3);
			    she.repaint();
			}
		}
	}	
	
	public static void main(String[] args) {
		MyActionEventTest myapp = new MyActionEventTest();
		myapp.setSize(400, 300);
		myapp.setVisible(true);
		myapp.addWindowListener(new WindowCloser());
	}
}





