package threadandsynch;

public class SBCDriver {
	
	public static void main(String[] args) {
		 SyncBaseClass sybObj = new SyncBaseClass();
		 
		 SBCThread1 t1 = new SBCThread1(sybObj);
		 SBCThread2 t2 = new SBCThread2(sybObj);
		 
		 t1.start();
		 t2.start();
	}

}
