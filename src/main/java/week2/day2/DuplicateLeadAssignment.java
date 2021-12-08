package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLeadAssignment {

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
		driver.findElementByXPath("//span[text()='Email']").click();
		driver.findElementByXPath("//input[@name='emailAddress']").sendKeys("sairam.rain422@gmail.com");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String leadName = driver.findElementByXPath("(//a[@class='linktext'])[6]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[6]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//a[text()='Duplicate Lead']").click();
		Thread.sleep(1500);
		if (driver.getTitle().contains("Duplicate Lead")) {
			System.out.println("Duplicated Lead page loaded successfully");
			driver.findElementByClassName("smallSubmit").click();
			Thread.sleep(3000);
			String duplicatedLeadName = driver.findElementById("viewLead_firstName_sp").getText();
			if (leadName.equalsIgnoreCase(duplicatedLeadName))
				System.out.println("Lead Duplicated Successfully");
			else
				System.out.println("Lead not Duplicated Successfully");
		} else {
			System.out.println("Duplicate Lead page not loaded");
		}

		Thread.sleep(4000);
		driver.close();

	}

}

/*
 * Assignment 4:
 * 
 * http://leaftaps.com/opentaps/control/main
 * 
 * Duplicate Lead: 1 Launch the browser 2 Enter the username 3 Enter the
 * password 4 Click Login 5 Click crm/sfa link 6 Click Leads link 7 Click Find
 * leads 8 Click on Email 9 Enter Email 10 Click find leads button 11 Capture
 * name of First Resulting lead 12 Click First Resulting lead 13 Click Duplicate
 * Lead 14 Verify the title as 'Duplicate Lead' 15 Click Create Lead 16 Confirm
 * the duplicated lead name is same as captured name 17 Close the browser (Do
 * not log out)
 */

