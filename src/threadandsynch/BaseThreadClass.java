package threadandsynch;

public class BaseThreadClass extends Thread{
	int n;
	
	BaseThreadClass(int n){
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
	
	

}
