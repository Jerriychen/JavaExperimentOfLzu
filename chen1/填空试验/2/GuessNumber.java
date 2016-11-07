import java.util.*;
public class GuessNumber{
 public static void main(String args[]){
	System.out.println("给你一个1到100的整数，请你猜测");
	int realnumber=(int)(Math.random()*100)+1;
	int myguess=0;
	int guesscount=1;
	Scanner reader= new Scanner(System.in);
	System.out.println("请输入你的猜测：");
	myguess=reader.nextInt();


	while(myguess!=realnumber){
	if(myguess>realnumber){
		System.out.println("你猜大了，请继续");
		myguess=reader.nextInt();
	}
	
	
	else if(myguess<realnumber){
		System.out.println("你猜小了，请继续");
		myguess=reader.nextInt();
	}
	
	guesscount++;
    }

        if(guesscount<4){
	System.out.println("你太聪明了");
	}
	else if(guesscount>8){
	System.out.println("要努力学习哦，下次努力");
	}
	else
	 System.out.println("正常智力");
}
}


