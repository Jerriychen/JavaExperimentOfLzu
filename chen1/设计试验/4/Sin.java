import java.applet.*;
import java.awt.*;

public class Sin extends Applet {

public void paint(Graphics g) {

for(int i=30;i<=60;i++) {

g.drawString("sin("+i+")="+Math.sin(i*Math.PI/180),20,20+(i-30)*20);

}
}
}
