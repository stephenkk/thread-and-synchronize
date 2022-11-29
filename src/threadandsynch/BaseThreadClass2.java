package threadandsynch;

public class BaseThreadClass2 implements Runnable {

int n;
	
	BaseThreadClass2(int n){
		this.n = n;
	}
	
	@Override
	public void run() {
		
		for (int i = 0; i <=5; i++)
			System.out.println(i*n);
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
		}
		
}
	void printSomething() {
		System.out.println("I'm from n = " + n);
}}
