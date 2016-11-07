package shiyan1_7;

import java.io.File;
import java.io.RandomAccessFile;

public class RandomTest {

	public static void main(String[] args) {
		File f = new File("RandomTest.java");
		try{
			RandomAccessFile random = new RandomAccessFile(f,"r");
			long l = random.length();
			char ch;
			for(long i=0;i<l;i++){
				random.seek(i);
				ch = (char)random.read();
				System.out.print(ch);
			}
			random.close();
		}
		catch(Exception e){
			System.out.println("IO Error");
		}
	}

}
