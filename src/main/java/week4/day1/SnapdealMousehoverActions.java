package week4.day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapdealMousehoverActions {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		ChromeDriver driver = new ChromeDriver(option);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.snapdeal.com/");
		
		WebElement menFashion = driver.findElementByXPath("(//span[contains(text(),'Men')])[2]");
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(menFashion).perform();
		
		driver.findElementByXPath("(//span[contains(text(),'Shirts')])[3]").click();
		
		Thread.sleep(2000);
		
		WebElement shirt = driver.findElementByXPath("(//source[@class='product-image'])[1]");
		
		builder.moveToElement(shirt).perform();
		
		driver.findElementByXPath("(//div[contains(text(),'Quick View')])[1]").click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
				
		/*
		 * WebDriverManager.chromedriver().setup();
		 * 
		 * ChromeOptions option = new ChromeOptions();
		 * option.addArguments("--disable-notifications"); ChromeDriver driver = new
		 * ChromeDriver(option);
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * driver.get("https://www.snapdeal.com/");
		 * 
		 * Thread.sleep(5000);
		 * 
		 * WebElement mensFashion =
		 * driver.findElementByXPath("(//span[contains(text(),'Men')])[2]");
		 * 
		 * Actions build = new Actions(driver);
		 * 
		 * build.moveToElement(mensFashion).perform();
		 * 
		 * driver.findElementByXPath("(//span[text()='Shirts'])[2]").click();
		 * Thread.sleep(2000);
		 * 
		 * WebElement item =
		 * driver.findElementByXPath("(//span[contains(@id,'display-price')])[1]");
		 * 
		 * build.moveToElement(item).perform();
		 * 
		 * driver.findElementByXPath("(//div[contains(text(),'Quick View')])[1]").click(
		 * );
		 */
	}

}
