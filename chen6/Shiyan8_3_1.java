package shiyan1_8;
import java.io.*;
import java.util.*;
class CardClass {
    private String name;
    private String appellation;
    private String department;
    private String phone;
    private String mobile;
    private String email;
    public CardClass(){}
    public CardClass(String n,String a,String d,String p,String m,String e){
        name=n;
        appellation=a;
        department=d;
        phone=p;
        mobile=m;
        email=e;
    }
    public String getName(){return name;}
    public String getAppellation(){return appellation;}
    public String getDepartment(){return department;}
    public String getPhone(){return phone;}
    public String getMobile(){return mobile;}
    public String getEmail(){return email;}
    public String toString(){
        StringBuilder str=new StringBuilder("*************************************************\n");
        str.append("   "+department+"\n");
        str.append("            "+name+"    "+appellation+"\n");
        str.append("            �绰:"+phone+"\n");
        str.append("            �ֻ�:"+mobile+"\n");
        str.append("            ����:"+email+"\n");
        str.append("*************************************************\n");
        return str.toString();
    }
    public void writeToFile(){
        FileWriter fout=null;
        try {
            fout=new FileWriter(""+name+".txt");
            String mystr=toString();
            fout.write(mystr,0,mystr.length());
            fout.flush();
            fout.close();
        }catch(IOException e1){e1.printStackTrace();}
    }
    @SuppressWarnings("resource")
	public void inputData(){
        System.out.println("��������Ƭ��Ϣ��");
        Scanner keyin=new Scanner(System.in);
        System.out.print("������λ:");
        department=keyin.nextLine();
        System.out.print("����:");
        name=keyin.nextLine();
        System.out.print("�ƺ�:");
        appellation=keyin.nextLine();
        System.out.print("�绰:");
        phone=keyin.nextLine();
        System.out.print("�ֻ�:");
        mobile=keyin.nextLine();
        System.out.print("����:");
        email=keyin.nextLine();
    }
    public void display(){
        System.out.println(toString());
    }
}
class CardClassTest{
    public static void main(String[] args){
        CardClass card=new CardClass();
        card.inputData();
        card.display();
        card.writeToFile();
    }
}