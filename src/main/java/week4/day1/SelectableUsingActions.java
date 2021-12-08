package week4.day1;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectableUsingActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://jqueryui.com/selectable/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("javascript:window.scrollBy(200,300)");

		driver.switchTo().frame(0);

		Actions select = new Actions(driver);

		select.keyDown(Keys.CONTROL);

		for (int i = 1; i <= 5; i += 2) {

			select.click(driver.findElementByXPath("//li[text()='Item " + i + "']"));
		}

		select.keyUp(Keys.CONTROL).perform();

		Thread.sleep(5000);

		driver.close();

	}

}
