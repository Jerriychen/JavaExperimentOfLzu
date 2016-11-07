package shiyanTest;

import java.util.Arrays;

public class shiyan6_2_5 {

	public static void main(String[] args) {
		int[] a={5,1,3,2,4,8,7,9,10,6};
		System.out.println("排序前：");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		
		Arrays.sort(a);
		System.out.println("\n排序后：");
		for(int i=0;i<a.length;i++) {
			System.out.print(" "+a[i]);
		}
		
		System.out.print("\n \n查找元素值4:");
		int k=Arrays.binarySearch(a, 4);
		if(k<0) {
			System.out.println("\n没有找到");
		}
		else {
			System.out.println("\n 元素4 的下标是："+k);
		}
		System.out.println();
		int[] c = new int[10];
		int[] d = new int[10];
		Arrays.fill(c, 4);
		Arrays.fill(d, 4);
		for(int i=0;i<c.length;i++) {
			System.out.print(" "+c[i]);
		}
		System.out.println();
		System.out.println("equals(a,c)="+Arrays.equals(a, c));
		System.out.println("equals(c,d)="+Arrays.equals(c,d));
		
	}

}
