package threadandsynch;

public class BTCDriver {
	
	public static void main(String[] args) {
		BaseThreadClass btc1 = new BaseThreadClass(2);
		BaseThreadClass btc2 = new BaseThreadClass(11);
		
		btc1.start();
		btc2.start();
		
		
	}

}
