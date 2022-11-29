package threadandsynch;

public class SBCThread2 extends Thread{
	
	SyncBaseClass syb;
	
	public SBCThread2(SyncBaseClass syb) {
		this.syb = syb;
		
	}
	@Override
	public void run() {
		syb.printTable(11);
		syb.printMinusTable(11);
	}
}
