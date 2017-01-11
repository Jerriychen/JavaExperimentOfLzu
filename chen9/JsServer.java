package shiyan1_13;
import java.io.*; 
import java.net.*;
public class JsServer{ 
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String args[]) throws Exception{
		ServerSocket server=new ServerSocket(4444);
		ServerThread thread;
		Socket client=null;
		while(true){
//			try{ 
//				server=new ServerSocket(4444);
//			} 
//			catch(IOException e1){ 
//			}
			try{ 
				System.out.println("正在监听");
				client=server.accept(); 
				System.out.println("客户的地址ַ"+client.getInetAddress());     
			} 
			catch(IOException e){ 
				System.out.println("正在等待客户"); 
			} 
			if(client!=null){ 
				new ServerThread(client).start();
			}
			else{ 
				continue;
			}
		}
	}
} 
class ServerThread extends Thread{
	Socket socket; 
	DataOutputStream out=null;
	DataInputStream in=null;
	String s=null; 
	ServerThread(Socket t){
		socket=t;
		try{ 
			in=new DataInputStream(socket.getInputStream());
			out=new DataOutputStream(socket.getOutputStream());
		} 
		catch(IOException e){}
	} 
	public void run(){
		while(true){ 
			double a=0,b=0,c=0,area=0;
			try{ 
				a=in.readDouble();
				b=in.readDouble();
				c=in.readDouble();
				double p=(a+b+c)/2.0; 
				area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
				out.writeDouble(area);
			}  catch(IOException e){ 
				System.out.println("客户离开");
				break;
			}
		}
	}
}
