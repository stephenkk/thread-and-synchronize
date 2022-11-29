package threadandsynch;

public class BTC2Driver {
	public static void main(String[] args) {
		BaseThreadClass2 btc21 = new BaseThreadClass2(2);
		BaseThreadClass2 btc22 = new BaseThreadClass2(11);
		
//		Thread t1 = new Thread(btc21);
//		Thread t2 = new Thread(btc22);
//		
//		t1.start();
//		t2.start();
		
		btc21.printSomething();
		btc22.printSomething();
	}

}
