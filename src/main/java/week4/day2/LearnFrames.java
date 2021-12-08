package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnFrames {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/frame.html");
		
		driver.switchTo().frame(1);
		driver.switchTo().frame(0);
		
		driver.findElementById("Click1").click();
		
		
		/*
		 * driver.switchTo().frame(0); Thread.sleep(3000);
		 * 
		 * driver.findElementById("Click").click();
		 * 
		 * 
		 * driver.switchTo().defaultContent();
		 * 
		 * System.out.println(driver.findElementByClassName("wp-heading").getText());
		 */
		
		

	}

}
