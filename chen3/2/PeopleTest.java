class People {
protected double weight,height;
public void speakHello() {
System.out.println("who am I?");
}

public void averageHeight() {
height=173;
System.out.println("average height:"+height);
}
public void averageWeight() {
weight=70;
System.out.println("average weight:"+weight);
}
}


class ChinaPeople extends People {
public void speakHello() {
System.out.println("��ඣ������й���!");
}

public void averageHeight() {
height=168.78;
System.out.println("�����й��˵�ƽ����ߣ�"+height+"����");
}

public void averageWeight() {
weight=65;
System.out.println("�����й��˵�ƽ�����أ�"+weight+"����");
}

public void chinaGongfu() {
System.out.println("�����ӣ�վ���ɣ�˯�繭");
}
}



class AmercanPeople extends People {

public void speakHello() {
System.out.println("Hello,I am American!");
}

public void averageHeight() {
height=178;
System.out.println("���������˵�ƽ����ߣ�"+height+"����");
}

public void averageWeight() {
weight=75;
System.out.println("���������˵�ƽ�����أ�"+weight+"����");
}

public void americanBoxing() {
System.out.println("The straight,hook");
}
}




class BeijingPeople extends ChinaPeople {
public void speakHello() {
System.out.println("���ã����Ǳ�����");
}

public void beijingOpera() {
System.out.println("����");
}
}




class PeopleTest {

public static void main(String[] args) {
ChinaPeople chinapeople=new ChinaPeople();
AmercanPeople americanpeople=new AmercanPeople();
BeijingPeople beijingpeople=new BeijingPeople();

chinapeople.speakHello();
americanpeople.speakHello();
beijingpeople.speakHello();

chinapeople.averageHeight();
americanpeople.averageHeight();
beijingpeople.averageHeight();

chinapeople.averageWeight();
americanpeople.averageWeight();
beijingpeople.averageWeight();

chinapeople.chinaGongfu();
americanpeople.americanBoxing();
beijingpeople.beijingOpera();

beijingpeople.chinaGongfu();
}
}

















































