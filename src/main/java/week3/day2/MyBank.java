package week3.day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyBank {

	public static void main(String[] args) {
		
		/*
		 * IOB obj = new IOB(); obj.maxLoanAmount(); obj.minBalance(); obj.AgriLoan();
		 * 
		 * SBI ob = new SBI(); ob.maxLoanAmount(); ob.minBalance(); ob.loanForIT();
		 */
		
		RBI obj= new SBI();
		obj.maxLoanAmount();
		obj.minBalance();
		
		
		/*
		 * ChromeDriver driver = new ChromeDriver();
		 * 
		 * WebDriver driverg = new ChromeDriver();
		 */
		
		
	}

}
