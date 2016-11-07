package shiyan1_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Copy3_1 {

	public static void main(String[] args) {
		try (FileReader in1 = new FileReader("RandomTest.java");BufferedReader in = new BufferedReader(in1);
			FileWriter out1 = new FileWriter("RandomTest.txt");BufferedWriter out = new BufferedWriter(out1)) 
		{
			int count=1;
			String str = "";
			while((str=in.readLine()) != null){
				out.write(count+":"+"\t");
				out.write(str);
				out.write("\n");
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
