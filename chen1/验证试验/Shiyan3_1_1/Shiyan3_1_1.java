public class Shiyan3_1_1{
public static void main(String[] args){
	System.out.println("�����Ѿ�֪�������ƽ���뾶Ϊ6370.856km");
	System.out.println("Ҳ֪�����������Ϊ5.98*10^24kg");
	System.out.println("���ǾͿ���ʹ����ѧ��ʽ��������ƽ���ܶ�Ϊ��");
	double radius=6.370856E6;
	double mass=5.98E24;
	double volume=4*Math.PI*Math.pow(radius,3)/3;
	double density=mass/volume;
	System.out.print(density+"ǧ��/������");
	}
}