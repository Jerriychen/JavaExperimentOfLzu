package shiyan1_8;
import java.io.*;
import java.nio.file.*;
public class MoveTest {
    public static void main(String... args){
        Path source=Paths.get("./b_copy.txt");
        Path target=Paths.get("/Users/chenzzh/Desktop/copy.txt");
        try {
            Files.copy(source,target,StandardCopyOption.REPLACE_EXISTING);//修改为copy
        }catch(IOException e){
            e.printStackTrace();
        }
        System.out.println("The file b_copy.txt has moved to /Users/chenzzh/Desktop/copy.txt!");
    }
}
