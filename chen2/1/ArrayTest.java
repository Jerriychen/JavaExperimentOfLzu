public class ArrayTest{

public static void main(String[] args) {

int[] a;
Person[] b;
a=new int[10];
b=new Person[3];

for(int i=0;i<10;i++){
	a[i]=(int)(100*Math.random());
}

b[0]=new Person("����",28,'M');
b[1]=new Person("����",20,'M');
b[2]=new Person();

b[2].setName("����");
b[2].setAge(39);
b[2].setSex('F');

for(int i=0;i<10;i++){

	System.out.println("a["+i+"]="+a[i]);

}

System.out.println(b[0]+"\n"+b[1]+"\n"+b[2]);

System.out.println("a��Ԫ�ظ���:"+a.length);

System.out.println("b��Ԫ�ظ���:"+b.length);
}
}