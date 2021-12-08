package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLeadAssignment {

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
		driver.findElementByXPath("//span[text()='Phone']").click();
		driver.findElementByName("phoneNumber").sendKeys("99");
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		String leadID = driver.findElementByXPath("(//a[@class='linktext'])[4]").getText();
		driver.findElementByXPath("(//a[@class='linktext'])[4]").click();
		driver.findElementByLinkText("Delete").click();
		Thread.sleep(2500);
		driver.findElementByXPath("//a[text()='Find Leads']").click();
		driver.findElementByName("id").sendKeys(leadID);
		driver.findElementByXPath("//button[text()='Find Leads']").click();
		Thread.sleep(2000);
		if (driver.findElementByXPath("//div[@class='x-paging-info']").getText().contains("No records to display"))
			System.out.println("Lead deleted successfully");
		else
			System.out.println("Lead not deleted successfully");

		Thread.sleep(3000);
		driver.close();

	}

}

/*
 * Assignment 3:
 * 
 * http://leaftaps.com/opentaps/control/main
 * 
 * Delete Lead: 1 Launch the browser 2 Enter the username 3 Enter the password 4
 * Click Login 5 Click crm/sfa link 6 Click Leads link 7 Click Find leads 8
 * Click on Phone 9 Enter phone number 99 10 Click find leads button 11 Capture
 * lead ID of First Resulting lead 12 Click First Resulting lead 13 Click Delete
 * 14 Click Find leads 15 Enter captured lead ID 16 Click find leads button 17
 * Verify message "No records to display" in the Lead List. This message
 * confirms the successful deletion 18 Close the browser (Do not log out)
 */
