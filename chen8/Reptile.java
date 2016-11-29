package shiyan1_11;

public class Reptile extends Thread {
	public void run() {
		for(int a = 0;a<50;a++) {
			System.out.println(currentThread().getName()+" :I am crawing "+ a + " step!");
			try{
				sleep(100);
			}catch (InterruptedException e ){
				throw new RuntimeException();
			}
		}
	}
	public static void main(String[] args) {
		Reptile reptile1 = new Reptile();
		reptile1.setName("reptile1");
		
		Reptile reptile2 = new Reptile();
		reptile2.setName("reptile2");
		
		reptile1.start();
		reptile2.start();
		
	}

}
