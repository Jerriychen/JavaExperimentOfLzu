package shiyanTest;

import java.io.*;
import java.util.*;

public class ObjectSaver {

	public static void main(String[] args) throws Exception {
		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("objectFile.obj"));
		String obj1 = "hello";
		Date obj2 = new Date();
		Student obj3 = new Student("张三",20);
		out.writeObject(obj1);
		out.writeObject(obj2);
		out.writeObject(obj3);
		out.close();
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("objectFile.obj"));
		String obj11 = (String)in.readObject();
		System.out.println("obj11:"+obj11);
		System.out.println("obj11==obj2:"+(obj11==obj1));
		System.out.println("obj11.equlas(obj1):"+obj11.equals(obj1));
		Date obj22 = (Date)in.readObject();
		System.out.println("obj22:"+obj22);
		System.out.println("obj22==obj2:"+(obj22==obj2));
		System.out.println("obj22.equals(obj2):"+obj22.equals(obj2));
		Student obj33 = (Student)in.readObject();
		System.out.println("obj33:"+obj33);
		System.out.println("obj33==obj3:"+(obj33==obj3));
		System.out.println("obj33.equals(obj3):"+obj33.equals(obj3));
		in.close();
	}

}
