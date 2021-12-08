package week4.day1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DroppableActions {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://jqueryui.com/droppable/");
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		js.executeScript("window.scrollBy(300,200)");
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElementById("draggable");
		
		WebElement drop = driver.findElementById("droppable");
		
		Actions dragAndDrop = new Actions(driver);
		
		dragAndDrop.dragAndDrop(drag, drop).perform();
		
		
		
		
		

	}

}
