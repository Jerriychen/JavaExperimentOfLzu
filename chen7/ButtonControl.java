package shiyan1_9;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class ButtonControl extends Frame implements ActionListener {

	Button btnDisplay;
	Label lblMsg;
	public ButtonControl() {
		super("按钮控件演示程序");
		btnDisplay = new Button("显示消息");
		lblMsg = new Label("");
		add(btnDisplay,BorderLayout.NORTH);
		add(lblMsg);
		btnDisplay.addActionListener(this);
		setSize(200,200);
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("显示消息"))  {
			btnDisplay.setLabel("隐藏消息");
			lblMsg.setText("你好，世界");
		}
		else if(e.getActionCommand().equals("隐藏消息")) {
			btnDisplay.setLabel("显示消息");
			lblMsg.setText("");
		}
	}

	public static void main(String[] args) {
		new ButtonControl();
	}

}
