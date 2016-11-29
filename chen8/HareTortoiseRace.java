package shiyan1_11;

public class HareTortoiseRace {
	public static void main(String[] args) {
		Hare hare = new Hare(200,100);
		Tortoise tortoise = new Tortoise(100,100);
		hare.start();
		tortoise.start();
	}
}

class Tortoise extends Thread {
	int sleeptime=0,targetlength=100;
	Tortoise(int sleeptime,int targetlength) {
		this.sleeptime = sleeptime;
		this.targetlength = targetlength;
		setName("Tortoise");
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		while(true) {
			targetlength = targetlength-1;
			System.out.print("T");
			try {
				Thread.sleep(sleeptime);
			}
			catch (InterruptedException e ){}
			if(targetlength<=0) {
				System.out.println(getName()+" 到达目的地!\n");
				stop();
			}
		}
	}
}



class Hare extends Thread {
	int sleeptime=0,targetlength=100;
	Hare(int sleeptime,int targetlength) {
		this.targetlength = targetlength;
		this.sleeptime=sleeptime;
		setName("Hare");
	}
	
	@SuppressWarnings("deprecation")
	public void run() {
		while(true) {
			targetlength = targetlength -3;
			System.out.print("***");
			try{
				Thread.sleep(sleeptime);
			}
			catch (InterruptedException e) {}
			if(targetlength<=0) {
				System.out.println(getName()+"到达目的地!\n");
				stop();
			}
		}
	}
}




