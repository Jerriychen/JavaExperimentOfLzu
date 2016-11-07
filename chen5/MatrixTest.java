package shiyan1_7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MatrixTest {

	public static void main(String[] args) {
		try( FileWriter write = new FileWriter("b.txt");BufferedWriter out = new BufferedWriter(write)) 
		{
			Matrix a = read("a.txt");
			Matrix b = read("c.txt");

			out.write("a="+"\n");
			out.write(a.toString());
			
			out.write("b="+"\n");
			out.write(b.toString());
			
			out.write("a+b="+"\n");
			out.write(a.add(b).toString());
			
			out.write("a-b="+"\n");
			out.write(a.sub(b).toString());
			
			out.write("a*b="+"\n");
			out.write(a.mul(b).toString());
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public static Matrix read(String file) {
		Matrix temp=null;
		try(FileReader reader = new FileReader(file);BufferedReader bf = new BufferedReader(reader)) 
		{
			String str = "";
			String[] s;
			int count = 0;
			float[][] x = null;
			while((str=bf.readLine()) != null){
				s = str.split(" ");
				if(count==0){
					x = new float[Integer.parseInt(s[0])][Integer.parseInt(s[1])];
					temp = new Matrix(Integer.parseInt(s[0]),Integer.parseInt(s[1]));
				}else{
					for(int i=0;i<s.length;i++){
						x[count-1][i] = Float.parseFloat(s[i]);
					}
				}
				count++;
			}
			temp.setX(x);
		}catch(IOException e) {
			e.printStackTrace();
		}
		return temp;
	}
}
