package shiyanTest;

import java.util.Properties;

public class SystemTest {

	public static void main(String[] args) {
		long starttime=System.currentTimeMillis();
		String path=System.getenv("Path");
		Properties mypro = System.getProperties();
		
		System.out.println("version:"+mypro.getProperty("java.version"));
		System.out.println("java home:"+mypro.getProperty("java.home"));
		System.out.println("path:"+path);
		long endtime=System.currentTimeMillis();
		System.out.println("spend time:"+(endtime-starttime));
	}

}
