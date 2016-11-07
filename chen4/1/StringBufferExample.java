package shiyanTest;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer str =new StringBuffer("ABCDEFG");
		str.append("123456789");
		System.out.println(str);
		str.setCharAt(1, 'b');
		System.out.println(str);
		str.insert(6, "love");
		System.out.println(str);
		int index=str.indexOf("1");
		str.delete(index, index+4);
		int n=str.length();
		str.replace(n-3, n, "七八九");
		System.out.println(str);
		StringBuffer otherstr=new StringBuffer("we love you");
		int start=0;
		char c='\0';
		while(start!=-1) {
			if(start!=0) {
				start=start+1;
			}
			c=otherstr.charAt(start);
			if(Character.isLowerCase(c)) {
				c=Character.toUpperCase(c);
				otherstr.setCharAt(start, c);
			}
			start=otherstr.indexOf(" ",start);
		}
		
		System.out.println(otherstr);
		StringBuffer yourstr = new StringBuffer("i Love THIS GaME");
		for(int i=0;i<yourstr.length();i++) {
			char c1=yourstr.charAt(i);
			if(Character.isLowerCase(c1)) {
				c1=Character.toUpperCase(c1);
				yourstr.setCharAt(i, c1);
			}
			else if(Character.isUpperCase(c1)) {
				c1=Character.toLowerCase(c1);
				yourstr.setCharAt(i, c1);
			}
		}
		System.out.println(yourstr);
	}

}
