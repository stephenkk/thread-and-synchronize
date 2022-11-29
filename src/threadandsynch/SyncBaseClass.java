package threadandsynch;

public class SyncBaseClass {
	
// Single lock
//	void printTable(int n) {
//		synchronized (this) {
//			System.out.println("Method 1:" + Thread.currentThread().getName());
//			for (int i = 1; i <= 5; i++)
//				System.out.println(n * i);
//		}
//		
//	}
	
	//double lock
	synchronized void printTable(int n) {
		// this is logical pointer reference
		//System.out.println("Before Synch Block:" + Thread.currentThread().getName());
		synchronized (this) {
			//System.out.println("After sync block.:" + Thread.currentThread().getName());
			for (int i = 1; i <= 5; i++)
				System.out.println(n * i + " current thread: " + Thread.currentThread().getName());
		}
	}

	void printMinusTable(int n) {
		//System.out.println("Method 2:" + Thread.currentThread().getName());
		for (int i = 1; i <= 5; i++)
			System.out.println(n - i * 1000 +  " current thread: " + Thread.currentThread().getName());
	}

	

}
