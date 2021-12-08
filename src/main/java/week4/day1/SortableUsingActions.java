package week4.day1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortableUsingActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/sortable/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(200,300)");
		
		driver.switchTo().frame(0);
		
		Thread.sleep(3000);
		
		WebElement item1 = driver.findElementByXPath("//li[text()='Item 1']");
		
		int x = driver.findElementByXPath("//li[text()='Item 4']").getLocation().getX();
		int y = driver.findElementByXPath("//li[text()='Item 4']").getLocation().getY();
		
		Actions builder = new Actions(driver);
		
		builder.dragAndDropBy(item1, x, y).perform();
		
		
		
		

	}

}
