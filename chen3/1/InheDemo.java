abstract class Employee {
String EmpName;
char sex;
double EmpSal;
Employee(String en,char s,double es){
EmpName=en;sex=s;EmpSal=es;
}
public String getName(){
return EmpName;
}
public char getSex(){
return sex;
}
public abstract double getSal();

public void setSal(int basSal){
EmpSal=basSal;
}
}

class Worker extends Employee {
char category;
boolean dressAllowance;
Worker(String en,char s,double es,char c,boolean d){
super(en,s,es);
category=c;
dressAllowance=d;
}

public char getCategory(){
return category;
}

public boolean getDressAll(){
return dressAllowance;
}

public double getSal(){
return EmpSal;
}
}


class Superior extends Employee {
int experience;
boolean vehicle;
double medicalAllowance;
Superior(String en,char s,double es,int e,boolean v,double ma){
super(en,s,es);
experience=e;
medicalAllowance=ma;
}
public int getExp(){
return experience;
}
public boolean getVehile(){
return vehicle;
}
public double getMedicalAll(){
return medicalAllowance;
}
public double getSal(){
return EmpSal*4+1000+medicalAllowance;
}
}






class Officer extends Superior {
double travelAllowance;
Officer(String en,char s,double es,int e,boolean v,double ma,double ta){
super(en,s,es,e,v,ma);
travelAllowance=ta;
}
public double getTravelAll(){
return travelAllowance;
}
public double getSal(){
return EmpSal*2+200+travelAllowance+medicalAllowance;
}
}




class Manager extends Superior{
double clubAllowance;
Manager(String en,char s,double es,int e,boolean v,double ma,double ca){
super(en,s,es,e,v,ma);
clubAllowance=ca;
}

public double getClubAll(){
return clubAllowance;
}
public double getSal(){
return EmpSal*5+2000+medicalAllowance+clubAllowance;
}
}


class InheDemo{
public static void main(String[] args){
Worker w=new Worker("M.John",'M',1200.50,'B',true);
System.out.println("������Ϣ��");
System.out.println("����"+w.getName());
System.out.println("�Ա�"+w.getSex());
System.out.println("н��"+w.getSal());
System.out.println("���"+w.getCategory());
if(w.getDressAll()) System.out.println("�ṩ��װ����");
else System.out.println("δ�ṩ��װ����");


Officer o=new Officer("S.David",'F',2500.70,15,true,345.60,200);
System.out.println("\n������Ϣ��");
System.out.println("������"+o.getName());
System.out.println("�Ա�"+o.getSex());
System.out.println("н�ʣ�"+o.getSal());
System.out.println("�������飺"+o.getExp()+"��");
if(o.getVehile()) System.out.println("�ṩ��ͨ����");
else System.out.println("δ�ṩ��ͨ����");
System.out.println("ҽ�ƽ�����"+o.getMedicalAll());
System.out.println("���������"+o.getTravelAll());


Manager m=new Manager("Arnoldshwaz",'M',4500.70,15,true,345.60,300);
System.out.println("\n������Ϣ��");
System.out.println("������"+m.getName());
System.out.println("�Ա�"+m.getSex());
System.out.println("н�ʣ�"+m.getSal());
System.out.println("�������飺"+m.getExp()+"��");
if(m.getVehile()) System.out.println("�ṩ��ͨ����");
else System.out.println("δ�ṩ��ͨ����");
System.out.println("ҽ�ƽ�����"+m.getMedicalAll());
System.out.println("��Ա������"+m.getClubAll());

}
}






































