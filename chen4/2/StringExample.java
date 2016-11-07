package shiyanTest;

public class StringExample {

	public static void main(String[] args) {
		String s1 = new String("you are a student"),
				s2 = new String("how are you");
		if(s1.equals(s2)) {
			System.out.println("s1 equals to s2");
		}
		else {
			System.out.println("no equal");
		}
		
		String s3 = new String("62010232874892134");
		if(s3.startsWith("620102")) {
			System.out.println("甘肃省身份证");
		}
	
		String s4 = new String("你"),
				s5 = new String("我");
		if(s4.compareTo(s5)>0) {
			System.out.println("s4大于s5");
		}
		else {
			System.out.println("s4小于s5");
		}
		
		int position = 0;
		String path = "d:\\shiyan\\src\\shiyan3\\People.java";
		position=path.lastIndexOf("\\");
		System.out.println("d:\\shiyan\\src\\shiyan3\\People.java中最后出现\\的位置："+position);
		String fileName=path.substring(position);
		System.out.println("d:\\shiyan\\src\\shiyan3\\People.java 中含有的文件名为："+fileName);
		String s6 = new String("100");
		String s7 = new String("123.678");
		int n1 = Integer.parseInt(s6);
		double n2 = Double.parseDouble(s7);
		double n = n1+n2;
		System.out.println(n);
		String s8 = new String("ABCDEF");
		char[] a = s8.toCharArray();
		for(int i=a.length-1;i>=0;i--) {
			System.out.printf("%3c",a[i]);
		}
	}

}
