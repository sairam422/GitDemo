package week4.day1;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAUI {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		//driver.get("https://www.myntra.com/");
		
		//driver.get("http://www.leafground.com/pages/Dropdown.html");
		
		driver.get("http://www.leafground.com/pages/drag.html");
		
		WebElement drag = driver.findElementById("draggable");
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDropBy(drag, 120, 80).perform();
		
				
		
		/*
		 * driver.get("http://www.leafground.com/pages/drop.html");
		 * 
		 * WebElement drag = driver.findElementById("draggable");
		 * 
		 * WebElement drop = driver.findElementById("droppable");
		 * 
		 * Actions builder = new Actions(driver);
		 * 
		 * builder.dragAndDrop(drag, drop).perform();
		 */
		
		
		
		/*
		 * WebElement Selenium = driver.
		 * findElementByXPath("//option[text()='Select your programs']/following-sibling::option[1]"
		 * );
		 * 
		 * WebElement Appium = driver.
		 * findElementByXPath("//option[text()='Select your programs']/following-sibling::option[2]"
		 * );
		 * 
		 * Actions builder = new Actions(driver);
		 * 
		 * builder.keyDown(Keys.CONTROL).click(Selenium).click(Appium).keyUp(Keys.
		 * CONTROL).perform();
		 */
		//WebElement men = driver.findElementByLinkText("Men");

		//WebElement men = driver.findElementByXPath("//a[text()='Men']");
		
		//Actions builder = new Actions(driver);
		
		//mousehover
		//builder.moveToElement(men).perform();
		
		//right click
		//builder.contextClick().perform();
		
		//double click
		//builder.doubleClick().perform();
		
	}

}
