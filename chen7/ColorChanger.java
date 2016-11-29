package shiyan1_9;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.*;

@SuppressWarnings("serial")
public class ColorChanger extends Frame {
	
	private Color color = Color.RED;
	private int times;
	public ColorChanger(String title) {
		super(title);
		Button button = new Button("change color");
		button.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent event){
					color=(color==Color.RED)?Color.GREEN:Color.RED;
					repaint();
				}
			}
		);
		add(button,BorderLayout.NORTH);
		pack();
//		setSize(300,300);
		setVisible(true);
		addWindowListener(new WindowCloser());
	}
	
	public void update(Graphics g) {
		super.update(g);
		System.out.println("call update "+(++times)+" times");
	}
	
	public void paint(Graphics g) {
		g.setColor(color);
		g.fillRect(0, 0, 300, 300);
	}
	
	public static void main(String[] args) {
		new ColorChanger("hello");
	}

}
