package www.horsefly;

public class Trangle {

double sideA,sideB,sideC;
boolean flag;


public Trangle(double a,double b,double c) {
sideA=a;sideB=b;sideC=c;
if(a+b>c&&a+c>b&&b+c>a) {
System.out.println("����һ��������");
flag=true;
} else {
System.out.println("�Ҳ���һ��������");
flag=false;
}
}

public void jsmj() {
if(flag) {
double p=(sideA+sideB+sideC)/2.0;
double area=Math.sqrt(p*(p-sideA)*(p-sideB)*(p-sideB));
System.out.println("��һ�������Σ��ܼ������");
System.out.println("����ǣ�"+area);
} else {
System.out.println("����һ�������Σ����ܼ������");
}
}

public void set(double a,double b,double c) {
sideA=a;sideB=b;sideC=c;
if(a+b>c&&a+c>b&&b+c>a) {
flag=true;
} else {
flag=false;
}
}
}