package week2.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApplication {

	public static void main(String[] args) throws InterruptedException {

		// System.setProperty("webdriver.chrome.driver",
		// "D:\\TestLeaf\\chromedriver_win32\\chromedriver.exe");

		WebDriverManager.chromedriver().setup();
		/*
		 * WebDriverManager.firefoxdriver().setup();
		 * WebDriverManager.iedriver().setup(); WebDriverManager.edgedriver().setup();
		 * WebDriverManager.operadriver().setup();
		 */

		// invoke chrome browser
		ChromeDriver driver = new ChromeDriver();
		// to enter application url
		driver.get("http://leaftaps.com/opentaps/control/main");
		// to maximize the browser
		driver.manage().window().maximize();

		/*
		 * FirefoxDriver driver1 = new FirefoxDriver(); InternetExplorerDriver driver2=
		 * new InternetExplorerDriver(); EdgeDriver driver3 = new EdgeDriver();
		 * OperaDriver driver4 = new OperaDriver(); SafariDriver driver5 = new
		 * SafariDriver();
		 */
        // to locate the element using Id locator
		WebElement userName = driver.findElementById("username");
		
		// to type a value in the webelement
		userName.sendKeys("demosalesmanager");
		
		// to type password in the text field using Id locator
		//driver.findElementById("password").sendKeys("crmsfa");
		//locate element using name locator
		driver.findElementByName("PASSWORD").sendKeys("crmsfa");
		
		// to click login button 
		driver.findElementByClassName("decorativeSubmit").click();
		
		// to locate linktext of an element
		//driver.findElementByLinkText("CRM/SFA").click();
		
		driver.findElementByPartialLinkText("CRM").click();
		
		Thread.sleep(5000);

		// to close browser
		driver.close();

		/*
		 * driver1.quit(); driver2.quit(); driver3.quit();
		 */
	}
}
