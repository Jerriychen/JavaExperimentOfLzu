package shiyan1_11;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

@SuppressWarnings("serial")
public class ShejiDonghua extends Canvas implements Runnable
{
	Thread th1,th2;
	int x,y,i,x1,y1,i1;
	Image[] im;
	public ShejiDonghua() {}
	public void init()
	{
	      im=new Image[4];
	      Toolkit tool = this.getToolkit();
	      for(int i=0;i<4;i++)
	    	  im[i] = tool.getImage("/Users/chenzzh/Documents/workspace/JavaExperimentOfLzu/shiyan1_11/b"+i+".gif");
	      x=y=i=0;
	      x1=y1=300;
	      i1=0;
	      th1=new Thread(this);
	      th2 = new Thread(this);
	      th1.start();
	      th2.start();
	 }
	public void paint(Graphics g)
	{
	      g.drawImage(im[i],x,y,this);
	      g.drawImage(im[i1], x1, y1, this);
//	      g.drawLine(0,150,x,150);
//	      g.drawLine(150,0,150,y);
	}
	public void run()
	{
       while(true) {
         if(Thread.currentThread()==th1) {
        	 if(i<3) i++;
			     else i=0;
			  if(x<300) x=x+3;else x=0;
			  if(y<300) y=y+3;else y=0;
			  repaint();
    	      try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
         }
         else if(Thread.currentThread()==th2) {
        	i1=(int)(Math.random()*3);
        	 if(x1 >=0) x1=x1-3;else x1=300;
        	 if(y1 >=0) y1=y1-3;else y1=300;
			repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
         }
       }
	}
   
	public static void main(String[] args) {
	   Frame f = new Frame("动画小程序");
	   ShejiDonghua donghua = new ShejiDonghua();
	   f.add(donghua);
	   f.setSize(300, 300);
	   f.addWindowListener(new WindowCloser());
	   f.setVisible(true);
	   donghua.init();
	}
}

class WindowCloser extends WindowAdapter {
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
}