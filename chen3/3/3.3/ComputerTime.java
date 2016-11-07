import CalTime.vehicle.all.Common;
import java.lang.*;

public class ComputerTime {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("��ͨ���ߣ�"+args[0]);
		System.out.println("����A:"+args[1]);
		System.out.println("����B��"+args[2]);
		System.out.println("����C��"+args[3]);
		double A=Double.parseDouble(args[1]);
		double B=Double.parseDouble(args[2]);
		double C=Double.parseDouble(args[3]);
		double v,t;
		try{
			Common d=(Common)Class.forName("CalTime.vehicle."+args[0]).newInstance();
			v=d.runTimer(A, B, C);
			t=1000/v;
			System.out.println("ƽ���ٶȣ�"+v+"km/h");
			System.out.println("����ʱ�䣺"+t+"Сʱ");
			
		}catch(Exception e){
			System.out.println("class not found");
		}
	}

}
