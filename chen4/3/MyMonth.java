package test;

import java.text.DateFormatSymbols;

public class MyMonth {
	private int month;
	private int days_in_month;
	private int start_of_week;
	public static String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
	private String[][] data = new String[7][8];
	public MyMonth(int m,int s,int d){
		month=m;
		start_of_week=s;
		days_in_month=d;
		for(int j=1;j<8;j++){
			data[0][j]=new String(MyMonth.weekdayNames[j]);
		}
		int days=1,day_of_week=start_of_week,r=1;
		do{
			data[r][day_of_week]=String.valueOf(days);
			days++;
			day_of_week++;
			if(day_of_week==8){
				day_of_week=1;
				r++;
			}
		}while(days<=days_in_month);
	}
	
	public void display(){
		System.out.println("\t\t\t"+(month+1)+"月");
		System.out.println("=============================================");
		for(int i=0;i<7;i++){
			for(int j=1;j<8;j++){
				if(i==0) {System.out.print(data[i][j]+"     ");continue;}
				if(data[i][j]==null)	System.out.print(" \t\t");
				else	System.out.print(data[i][j]+"\t\t");
			}
			System.out.println();
		}
		System.out.println("=============================================");
	}
	
	public int getMonth(){
		return month+1;
	}
	public int getDaysInMonth(){
		return days_in_month;
	}
	public String[][] getData(){
		return data;
	}
	public static void main(String[] args){
		MyMonth mm = new MyMonth(4,3,31);
		mm.display();
	}
}
