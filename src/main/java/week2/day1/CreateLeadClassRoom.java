package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadClassRoom {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant Technology Solutions");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sai Ram");
		driver.findElementById("createLeadForm_lastName").sendKeys("Gubbala");
		driver.findElementByName("submitButton").click();
		Thread.sleep(5000);
		driver.close();
	}

}
