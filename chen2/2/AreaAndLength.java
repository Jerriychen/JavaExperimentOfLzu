class Trangle {

double a,b,c,area,length;

boolean flag;

public Trangle(double a1,double b1,double c1) {
if(a1+b1>c1&&b1+c1>a1&&a1+c1>b1){

a=a1;b=b1;c=c1;flag=true;
}
else flag=false;
}

public double getLength() {
length=a+b+c;
return length;
}

public double getArea() {
if(flag) {
double p=(a+b+c)/2.0;
area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
return area;
}
else {
System.out.println("不是一个三角形，不能计算面积");
return 0;
}
}

public void setABC(double a1,double b1,double c1) {

if(a1+b1>c1&&b1+c1>a1&&a1+c1>b1){
a=a1;b=b1;c=c1;flag=true;
}
else{
a=b=c=0;
flag=false;
}
}
}



class Lader {
double above,botton,height,area;
Lader(double a,double b,double h) {
above=a;botton=b;height=h;
}

public double getArea(){
area=(above+botton)*height/2;
return area;
}
}



class Circle {

double radius,area;

Circle(double r) {
if(r>0) radius=r;
else radius=0;
}

double getArea() {
area=Math.PI*radius*radius;
return area;
}

double getLength() { return 2*Math.PI*radius;}

void setRadius(double newr){
if(newr>0) radius=newr;
}

double getRadius() {
return radius;
}
}




public class AreaAndLength {

public static void main(String[] args) {
double length,area;
Circle circle=null;
Trangle trangle=null;
Lader lader=null;
circle=new Circle(10);
trangle=new Trangle(3,4,5);
lader =new Lader(4,8,5);
length=circle.getLength();
System.out.println("圆的周长："+length);
area=circle.getArea();
System.out.println("圆的面积："+area);

length=trangle.getLength();
System.out.println("三角形的周长："+length);
area=trangle.getArea();
System.out.println("三角形的面积："+area);


area=lader.getArea();
System.out.println("梯形的面积："+area);

trangle=new Trangle(12,34,1);
area=trangle.getArea();
System.out.println("三角形的面积："+area);
length=trangle.getLength();
System.out.println("三角形的周长："+length);
}
}




















































