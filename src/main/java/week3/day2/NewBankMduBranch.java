package week3.day2;

public class NewBankMduBranch extends NewBank{
	
	
	public void minBalance() {
		System.out.println("1500");
		
	}

	public void studentsLoan() {
		System.out.println("Students Loan");
		
	}
	
	
	public static void main(String[] args) {
		NewBankMduBranch nbmb = new NewBankMduBranch();
		nbmb.maxLoanAmount();
		nbmb.minBalance();
		nbmb.studentsLoan();
		
	}



	
	
	

}
