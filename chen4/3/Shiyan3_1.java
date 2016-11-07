package test;

public class Shiyan3_1 {

	public static void main(String[] args) {
		try{
			double result = 0;
			double A=Double.parseDouble(args[0]);
			double B=Double.parseDouble(args[2]);
			char[] C=args[1].toCharArray();
			switch(C[0])
			{
				case '+':	result=A+B;break;
				case '-':	result=A-B;break;
				case '*':	result=A*B;break;
				case '/':	result=A/B;break;
			}
			System.out.println(args[0]+C[0]+args[2]+"="+result);
		}
		catch(ArrayIndexOutOfBoundsException ex){
			System.out.println("数组下标越界");
		}
		catch(ArithmeticException ex) {
			System.out.println("数学类溢出异常");
		}
		catch(NumberFormatException ex) {
			System.out.println("输入参数中有异常字符");
		}
		finally{
			System.out.println("程序执行结束");
		}
	}

}
