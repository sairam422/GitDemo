package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccountAssignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/login");
		//2. Enter UserName and Password Using Id Locator
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		//* 3. Click on Login Button using Class Locator
		driver.findElementByClassName("decorativeSubmit").click();
		// * 4. Click on CRM/SFA Link
		driver.findElementByPartialLinkText("CRM").click();
		// * 5. Click on Accounts Button
		driver.findElementByLinkText("Accounts").click();
		// * 6. Click on Create Account
		driver.findElementByLinkText("Create Account").click();
		// * 7. Enter AccountName Field Using Xpath Locator value as Debit Limited Account
		driver.findElementByXPath("//input[@id='accountName']").sendKeys("Debit Limited Account");
		// * 8. Enter DEscriptiion as "Selenium Automation Tester"
		driver.findElementByXPath("//textarea[@name='description']").sendKeys("Selenium Automation Tester");
		// * 9. Enter LocalName Field Using Xpath Locator
		driver.findElementById("groupNameLocal").sendKeys("Sai Ram Gubbala");
		// * 10. Enter SiteName Field Using Xpath Locator
		driver.findElementByXPath("//input[@id='officeSiteName']").sendKeys("https://en-gb.facebook.com/");
		// * 11. Enter value for AnnualRevenue Field using Xpath Locator but class as Attribute
		driver.findElementByXPath("(//input[@class='inputBox'])[5]").sendKeys("20000000");
		// * 12. Select Industry as ComputerSoftware
		Select industryDropDown= new Select(driver.findElementByName("industryEnumId"));
		industryDropDown.selectByValue("IND_SOFTWARE");
		// * 13. Select OwnerShip as S-Corporation using SelectByVisibletext
		Select ownershipDropDown= new Select(driver.findElementByName("ownershipEnumId"));
		ownershipDropDown.selectByVisibleText("S-Corporation");
		// * 14. Select Source as Employee using SelectByValue
		Select sourceDropDown=new Select(driver.findElementById("dataSourceId"));
		sourceDropDown.selectByValue("LEAD_EMPLOYEE");
		// * 15. Select Marketing Campaign as eCommerce Site Internal Campaign using SelectbyIndex
		Select marketingCampaignDropDown=new Select(driver.findElementById("marketingCampaignId"));
		marketingCampaignDropDown.selectByIndex(6);
		// * 16. Select State/Province as Texas using SelectByValue 
		Select state_provinceDropDown=new Select(driver.findElementByXPath("//select[@id='generalStateProvinceGeoId']"));
		state_provinceDropDown.selectByValue("TX");
		// * 17. Click on Create Account using Xpath Locator*/
		driver.findElementByXPath("//input[@class='smallSubmit']").click();
		Thread.sleep(4000);
		driver.close();
		
	}

}
