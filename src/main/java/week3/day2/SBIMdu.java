package week3.day2;

public class SBIMdu extends SBI{

	public void fixedDeposit() {
		System.out.println("SBIMdu Fixed Deposit");
	}
	
	public static void main(String[] args) {
		SBIMdu sm = new SBIMdu();
		sm.loanForIT();
		sm.maxLoanAmount();
		sm.minBalance();
		sm.fixedDeposit();
	}
	
}
