package shiyan1_11;

public class ShopWorker implements Runnable {
	static Thread zhangsan,lisi,boss;
	public ShopWorker() {
		boss  = new Thread(this,"老板");
		zhangsan = new Thread(this,"张三");
		lisi = new Thread(this,"李四");
//		zhangsan.setName("张三");
//		lisi.setName("李四");
//		boss.setName("老板");
	}
	@SuppressWarnings("static-access")
	@Override
	public void run() {
		int i=0;
		if(Thread.currentThread() == zhangsan) {
			while(true) {
				try {
					i++;
					System.out.println(Thread.currentThread().getName()+" 已经搬了"+i+" 箱货物，休息一会儿");
					if(i==3) return;
					zhangsan.sleep(10000);
				}catch(InterruptedException e) {
					System.out.println(boss.getName()+" 让"+Thread.currentThread().getName()+" 继续工作");
				}
			}
		}
		else if(Thread.currentThread()==lisi) {
			while(true) {
				try {
					i++;
					System.out.println(Thread.currentThread().getName()+" 已经搬了"+i+" 箱货物，休息一会儿");
					if(i==3) return;
					zhangsan.sleep(10000);
				}catch(InterruptedException e) {
					System.out.println(boss.getName()+" 让"+Thread.currentThread().getName()+" 继续工作");
				}
			}
		}
		else if(Thread.currentThread()==boss) {
			while(true) {
				zhangsan.interrupt();
				lisi.interrupt();
				if(!(zhangsan.isAlive()||lisi.isAlive())) {
					System.out.println("下班了");
					return;
				}
			}
		}
	}
}
