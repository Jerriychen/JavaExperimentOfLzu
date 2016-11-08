package shiyan1_8;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
public class Shiyan8_3_2 {
    public static void getURLs(String str){
        String regex="<a.*?/a>";    
        Pattern pt=Pattern.compile(regex);
        Matcher mt=pt.matcher(str);
        while (mt.find()) {
           String link=mt.group();
           System.out.println(link);
        }
    }
    public static void main(String[] args) throws Exception{
        FileReader fr=new FileReader("test.html");
        BufferedReader br=new BufferedReader(fr);       
        String str=br.readLine();
        while(str!=null){
            getURLs(str);
            str=br.readLine();
        }
        br.close();
        fr.close();
    }
}