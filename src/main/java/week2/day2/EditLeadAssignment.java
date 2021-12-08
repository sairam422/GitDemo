package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLeadAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByXPath("(//*[@name='firstName'])[3]").sendKeys("Sai Ram");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(3000);
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		if(driver.getTitle().contains("View Lead | opentaps"))
			System.out.println("View leads page opened");
		else
			System.out.println("View lead page not opened");
		driver.findElementByLinkText("Edit").click();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").clear();
		driver.findElementByXPath("(//input[@name='companyName'])[2]").sendKeys("Cnetric Enterprise Solutions");
		driver.findElementByXPath("//input[@value='Update']").click();
		String updatedCompanyName = driver.findElementById("viewLead_companyName_sp").getText();
		if(updatedCompanyName.contains("Cnetric Enterprise"))
			System.out.println("Company name updated successfully");
		else
			System.out.println("Company name not updated successfully");
		Thread.sleep(4000);
		driver.close();
		

	}

}


/*
 * Assignment 2:
 * 
 * http://leaftaps.com/opentaps/control/main Credential: demosalesmanager ;
 * crmsfa
 * 
 * Edit Lead: 1 Launch the browser 2 Enter the username 3 Enter the password 4
 * Click Login 5 Click crm/sfa link 6 Click Leads link 7 Click Find leads 8
 * Enter first name 9 Click Find leads button 10 Click on first resulting lead
 * 11 Verify title of the page 12 Click Edit 13 Change the company name 14 Click
 * Update 15 Confirm the changed name appears 16 Close the browser (Do not log
 * out)
 */

