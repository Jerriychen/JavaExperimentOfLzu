import java.util.*;
public class InputDouble {

	public static void main(String[] args) {
		double a,b,c;
		Scanner reader= new Scanner(System.in);
		System.out.println("�Ӽ�������һ����");
		a=reader.nextDouble();
		b=a*a;
		c=a*a*a;
		System.out.println("b="+b);
		System.out.println("c="+c);
	}

}