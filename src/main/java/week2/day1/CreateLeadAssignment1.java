package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLeadAssignment1 {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant Technology Solutions");
		driver.findElementById("createLeadForm_firstName").sendKeys("Sai Ram");
		driver.findElementById("createLeadForm_lastName").sendKeys("Gubbala");
		Select sourceDropDown = new Select(driver.findElementById("createLeadForm_dataSourceId"));
		sourceDropDown.selectByVisibleText("Employee");
		Select marketCampaignDropDown = new Select(driver.findElementById("createLeadForm_marketingCampaignId"));
		marketCampaignDropDown.selectByValue("9001");
		Select OwnershipDropDown = new Select(driver.findElementById("createLeadForm_ownershipEnumId"));
		OwnershipDropDown.selectByIndex(5);
		Select countryDropDown = new Select(driver.findElementById("createLeadForm_generalCountryGeoId"));
		countryDropDown.selectByVisibleText("India");
		driver.findElementByName("submitButton").click();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		Thread.sleep(15000);
		driver.close();

	}

}
