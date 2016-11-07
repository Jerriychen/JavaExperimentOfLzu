import java.applet.*;
import java.awt.*;

public class FirstApplet extends Applet{

public void paint(Graphics g){

for(int i=1;i<=20;i++){

	g.drawString("sqrt("+i+")="+Math.sqrt(i),20,20+i*20);
}
}
}