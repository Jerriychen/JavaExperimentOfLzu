package shiyan1_9;

import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
class MPanel  extends Panel {
     int[] x,y;
      int count;
      public MPanel(){
            x=new int[50];y=new int[50];count=0;
            MyMouseAdapter mAction = new MyMouseAdapter();
            addMouseListener(mAction);
      }
      public void paint(Graphics g) {
             for(int i=1;i<=count;i++)
//           g.fillOval(x[i],y[i],5,5);
             g.fillRect(x[i], y[i], 5, 5);
      }
      private class MyMouseAdapter extends MouseAdapter  {
            public void mousePressed(MouseEvent e){
                        count++;
                        x[count] = e.getX();
                        y[count] = e.getY();
                        repaint();
            }
      }
}
public class mousetest1 {
       public static void main(String args[])    {
               Frame myframe=new Frame("鼠标测试");
               MPanel mp=new MPanel();
               myframe.add(mp);
               myframe.setSize(400,400);
               myframe.setVisible(true);
               myframe.addWindowListener(new WindowCloser());
       }
}
