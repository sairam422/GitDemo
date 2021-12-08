package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownLearning {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement sourceDropDown = driver.findElementById("createLeadForm_dataSourceId");
		Select sourceDropDownOptions = new Select(sourceDropDown);
		//sourceDropDownOptions.selectByVisibleText("Direct Mail");
		//sourceDropDownOptions.selectByValue("LEAD_EMPLOYEE");
		sourceDropDownOptions.selectByIndex(1);
		Thread.sleep(6000);
		driver.close();
		
	}

}
