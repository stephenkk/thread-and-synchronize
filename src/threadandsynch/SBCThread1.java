package threadandsynch;

public class SBCThread1 extends Thread{
	
	SyncBaseClass syb;
	
	public SBCThread1(SyncBaseClass syb) {
		this.syb = syb;
		
	}
	@Override
	public void run() {
		syb.printTable(2);
		syb.printMinusTable(2);
	}
}
