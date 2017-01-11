package shiyan1_13;
import java.net.*;
import java.io.*;
public class Client {
	public static void main(String[] args) throws Exception {
		Socket soc=new Socket("127.0.0.1",4001);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		PrintStream ps=new PrintStream(soc.getOutputStream());
		System.out.println("输入消息至服务器");
		String temp;
		while(!((temp=br.readLine()).equals("quit"))) {
			ps.println(temp);
		}
		ps.close();
		soc.close();
	}
}
