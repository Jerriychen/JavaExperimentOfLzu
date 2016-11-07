import java.awt.Color;
import java.lang.Math;
public class PointTest {

public static void main(String[] args) {
Point a=new Point();
Point b=new Point(50,60);
Point c=new Point(100,200,Color.red);
System.out.println("B:("+b.getX()+","+b.getY()+")"+" color:"+b.getColor());
a.setX(100);
a.setY(200);
a.setColor(Color.red);
System.out.println("a==c? "+a.equals(c));
System.out.println("a->b "+a.distance(b));
System.out.println("a: "+a);
System.out.println("b: "+b);
System.out.println("c: "+c);
   }
}




class Point {

private int x,y;
Color color;

public Point(){}
public Point(int a,int b) { x=a;y=b;}
public Point(int a,int b,Color c) {x=a;y=b;color=c;}

public void setX(int a){ x=a;}
public void setY(int b){ y=b;}
public void setColor(Color c){color=c;}

public int getX() {return x;}
public int getY() {return y;}
public Color getColor() {return color;}

public String toString() {
return "("+x+","+y+")"+" ["+color+"]";
}

public double distance(Point b){
double a1=Math.pow(((double)this.x-(double)b.getX()),2);
double b1=Math.pow(((double)this.y-(double)b.getY()),2);
return Math.sqrt(a1+b1);
}

public boolean equals(Point b) {
if(this.x==b.getX()&&this.y==b.getY()){
	if(this.color.equals(b.getColor()))
		return true;
	else
		return false;
}
	return false;
}

}


