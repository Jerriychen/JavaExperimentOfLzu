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
System.out.println("哈喽，我是中国人!");
}

public void averageHeight() {
height=168.78;
System.out.println("我们中国人的平均身高："+height+"厘米");
}

public void averageWeight() {
weight=65;
System.out.println("我们中国人的平均体重："+weight+"公斤");
}

public void chinaGongfu() {
System.out.println("坐如钟，站如松，睡如弓");
}
}



class AmercanPeople extends People {

public void speakHello() {
System.out.println("Hello,I am American!");
}

public void averageHeight() {
height=178;
System.out.println("我们美国人的平均身高："+height+"厘米");
}

public void averageWeight() {
weight=75;
System.out.println("我们美国人的平均体重："+weight+"公斤");
}

public void americanBoxing() {
System.out.println("The straight,hook");
}
}




class BeijingPeople extends ChinaPeople {
public void speakHello() {
System.out.println("您好，俺是北京人");
}

public void beijingOpera() {
System.out.println("京剧");
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

















































