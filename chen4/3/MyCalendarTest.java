package test;

import java.util.Calendar;
import java.util.Scanner;

public class MyCalendarTest {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Calendar d = Calendar.getInstance();
		Scanner input = new Scanner(System.in);
		System.out.println("输入年份");
		int year = input.nextInt();
		d.set(Calendar.YEAR, year);
		MyMonth[] month = new MyMonth[12];
		for(int i=0;i<12;i++){
			d.set(Calendar.MONTH,i);
			d.set(Calendar.DAY_OF_MONTH,1);
			month[i]=new MyMonth(i,d.get(Calendar.DAY_OF_WEEK),d.getActualMaximum(Calendar.DAY_OF_MONTH));
		}
		for(int i=0;i<=Calendar.DECEMBER;i+=2){
			displayTwoMonth(month[i],month[i+1]);
		}
	}
	
	public static void displayTwoMonth(MyMonth m1,MyMonth m2){
		System.out.print("\t\t\t\t"+m1.getMonth()+"月");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+m2.getMonth()+"月");
		System.out.print("=============================================");
		System.out.println("    ===============================================");
		String[][] d1=m1.getData();
		String[][] d2=m2.getData();
		for(int i=0;i<7;i++){
			for(int j=1;j<8;j++){
				if(i==0) {System.out.print(d1[i][j]+"     ");continue;}
				if(d1[i][j]==null) System.out.print(" \t\t");
				else System.out.print(d1[i][j]+"\t\t");
			}
			for(int j=1;j<8;j++){
				if(i==0) {System.out.print(d2[i][j]+"     ");continue;}
				if(d2[i][j]==null) System.out.print(" \t\t");
				else System.out.print(d2[i][j]+"\t\t");
			}
			System.out.println();
		}
		System.out.print("=============================================");
		System.out.println("    ===============================================");
		System.out.println();
	}

}
