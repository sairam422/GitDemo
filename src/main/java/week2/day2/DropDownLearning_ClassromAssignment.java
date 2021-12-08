package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownLearning_ClassromAssignment {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
		Select source=new Select(driver.findElementById("createLeadForm_dataSourceId"));
		List<WebElement> options = source.getOptions();
		options.get((options.size())-2).click();
		
		Select marketingCampaign = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		/*
		 * List<WebElement> campaignOptions = marketingCampaign.getOptions();
		 * campaignOptions.get(2).click();
		 */
		marketingCampaign.selectByIndex(2);
		
		
		Thread.sleep(4000);
		driver.close();
		
		
	}
		

}
