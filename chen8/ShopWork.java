package shiyan1_11;

public class ShopWork {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		ShopWorker shop = new ShopWorker();
		shop.zhangsan.start();
		shop.lisi.start();
		shop.boss.start();
	}
}
