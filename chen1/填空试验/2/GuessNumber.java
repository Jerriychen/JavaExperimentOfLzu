import java.util.*;
public class GuessNumber{
 public static void main(String args[]){
	System.out.println("����һ��1��100������������²�");
	int realnumber=(int)(Math.random()*100)+1;
	int myguess=0;
	int guesscount=1;
	Scanner reader= new Scanner(System.in);
	System.out.println("��������Ĳ²⣺");
	myguess=reader.nextInt();


	while(myguess!=realnumber){
	if(myguess>realnumber){
		System.out.println("��´��ˣ������");
		myguess=reader.nextInt();
	}
	
	
	else if(myguess<realnumber){
		System.out.println("���С�ˣ������");
		myguess=reader.nextInt();
	}
	
	guesscount++;
    }

        if(guesscount<4){
	System.out.println("��̫������");
	}
	else if(guesscount>8){
	System.out.println("ҪŬ��ѧϰŶ���´�Ŭ��");
	}
	else
	 System.out.println("��������");
}
}


