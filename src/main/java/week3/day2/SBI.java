package week3.day2;

public class SBI implements RBI{

	public void loanForIT() {
		System.out.println("Loan IT");

	}
	
	public void minBalance() {
		System.out.println("10000");
		
	}

	public void maxLoanAmount() {
		System.out.println("200000");
	}
	
	public static void main(String[] args) {
		SBI sbi = new SBI();
		sbi.minBalance();
		sbi.maxLoanAmount();
		sbi.loanForIT();
	}

	public void floodReliefFund() {
		// TODO Auto-generated method stub
		
	}

}
