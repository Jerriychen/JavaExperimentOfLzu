public class Person {
private int age=0;
private char sex='M';
private String name="noname";
public Person(){}

public Person(String n,int a,char s) {

name=n;
if(a>=0&&a<140) 
	age=a;
else 
	age=0;

if(s=='M')
	sex=s;
else
	sex='F';

}

public void introduceme() {

System.out.print("my name is:"+name+"\tmy age is: "+age);

if(sex=='M')System.out.println("\tI am man!");

else System.out.println("\tI am women!");

}

public String getName() {return name;}

public void setName(String n) {name=n;}

public int getAge() {return age;}

public void setAge(int a) {
if(a>=0&&a<140) age=a;
else age=0;
}


public void setSex(char s){

if(s=='M') sex=s;
else sex='F';

}
public char getSex(){return sex;}


public boolean equals(Person a) {
if(this.name.equals(a.name)&&this.age==a.age&&this.sex==a.sex)
	return true;
else
	return false;
}

public String toString(){

return name+","+sex+","+age;

}
}

class PersonTest {

public static void main(String[] args) {

Person p1,p2;
p1=new Person("ÕÅÈý",28,'M');
p2=new Person();
p2.setName("³Âºì");
p2.setAge(38);
p2.setSex('F');
p1.introduceme();
p2.introduceme();
}
}






