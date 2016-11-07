public class MyComplex {

double real;
double virtual;

MyComplex(double a,double b) {
real=a;
virtual=b;
}

public double getReal() {
return real;
}

public double getVirtual() {
return virtual;
}


public static MyComplex add(MyComplex a,MyComplex b) {
double x,y;
x=a.getReal()+b.getReal();
y=a.getVirtual()+b.getVirtual();
return new MyComplex(x,y);
}

public static MyComplex sub(MyComplex a,MyComplex b) {
double x,y;
x=a.getReal()-b.getReal();
y=a.getVirtual()-b.getVirtual();
return new MyComplex(x,y);
}

public static MyComplex mul(MyComplex a,MyComplex b) {
double x,y;
x=a.getReal()*b.getReal()-a.getVirtual()*b.getVirtual();
y=a.getReal()*b.getVirtual()+b.getReal()*a.getVirtual();
return new MyComplex(x,y);
}

public static MyComplex div(MyComplex a,MyComplex b) {
double x,y;
x=(a.getReal()*b.getReal()+a.getVirtual()*b.getVirtual())/(b.getReal()*b.getReal()+b.getVirtual()*b.getVirtual());
y=(b.getReal()*a.getVirtual()-a.getReal()*b.getVirtual())/(b.getReal()*b.getReal()+b.getVirtual()*b.getVirtual());
return new MyComplex(x,y);
}

public String toString() {
    return real+"+"+virtual+"i";
}

public boolean equals(MyComplex a) {
if(this.real==a.getReal()&&this.virtual==a.getVirtual()) {
return true;}
else return false;
}


public static void main(String[] args) {
MyComplex m1=new MyComplex(3.4,8.0);
MyComplex m2=new MyComplex(3.4,8.0);
System.out.println("m1="+m1);
System.out.println("m2="+m2);
System.out.println("m1==m2="+(m1==m2));
System.out.println("m1.equals(m2)="+m1.equals(m2));
MyComplex m3=new MyComplex(4.4,-8.9);
System.out.println("m3="+m3);
MyComplex m4=MyComplex.add(m1,m3);
MyComplex m5=MyComplex.sub(m2,m3);
MyComplex m6=MyComplex.mul(m1,m2);
MyComplex m7=MyComplex.div(m1,m2);
System.out.println("m1+m3="+m4);
System.out.println("m2-m3="+m5);
System.out.println("m1*m2="+m6);
System.out.println("m1/m2="+m7);
}
}
