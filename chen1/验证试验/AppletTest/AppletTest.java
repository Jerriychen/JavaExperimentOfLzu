import java.applet.*;
import java.awt.*;
public class AppletTest extends Applet{
public void paint(Graphics g){
	g.drawString("hello world",60,60);
	g.drawOval(100,100,80,80);
	}
}