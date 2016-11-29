package shiyan1_9;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Frame1 {

	public static void main(String[] args) {
		Frame  myapp = new Frame("GUI窗口标题");
		myapp.setSize(300,300);
		myapp.setVisible(true);
		myapp.addWindowListener(new WindowCloser());
	}
}

class WindowCloser extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}