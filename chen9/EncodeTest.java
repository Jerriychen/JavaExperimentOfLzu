package shiyan1_13;

import java.net.*;
public class EncodeTest {
  public static void main(String args[]) throws Exception{
    
	  String str1 = "计算机";
	  String str2 = URLEncoder.encode(str1,"UTF-8");		//转码,将utf-8格式的str1字符串转码成  application／www-form
	  System.out.println(str2);
	  String str3=URLDecoder.decode(str2,"UTF-8");      //解码
	  System.out.println(str3);
  }
}
