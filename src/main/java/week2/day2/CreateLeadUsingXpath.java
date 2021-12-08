package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadUsingXpath {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementByXPath("//input[@id='username']").sendKeys("demosalesmanager");
		driver.findElementByXPath("//input[@id='password']").sendKeys("crmsfa");
		driver.findElementByXPath("//input[@type='submit']").click();
		driver.findElementByXPath("//a[contains(text(),'CRM')]").click();
		driver.findElementByXPath("//a[text()='Leads']").click();
		driver.findElementByXPath("//a[contains(text(),'Create')]").click();
		driver.findElementByXPath("//input[@class='inputBox' and @name='companyName']").sendKeys("Cognizant Technology Solutions");
		driver.findElementByXPath("//input[@name='firstName' and @class='inputBox']").sendKeys("Sai Ram");
		driver.findElementByXPath("//input[@name='lastName' and @class='inputBox']").sendKeys("Gubbala");
		
		driver.findElementByXPath("//select[@name='dataSourceId']").click();
		driver.findElementByXPath("//option[@value='LEAD_EMPLOYEE']").click();
		
		driver.findElementByXPath("//select[contains(@name,'marketing')]").click();
		driver.findElementByXPath("//option[@value='9001']").click();
		
		driver.findElementByXPath("//select[contains(@name,'ownership')]").click();
		driver.findElementByXPath("//option[contains(@value,'OWN_C')]").click();
		
		driver.findElementByXPath("//select[@name='generalCountryGeoId']").click();
		driver.findElementByXPath("//option[text()='India']").click();
		
		driver.findElementByXPath("//input[@type='submit']").click();
		
		Thread.sleep(6000);
		System.out.println(driver.getTitle());
		
		Thread.sleep(2000);
		driver.close();
		
	}

}
