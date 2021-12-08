package week4.day2;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlertHandling {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Alert.html");
		
		
		
		driver.findElementByXPath("//button[text()='Sweet Alert']").click();
		Thread.sleep(5000);
		
		System.out.println(driver.findElementByXPath("//button[text()='OK']").getText());
		
		driver.findElementByXPath("//button[text()='OK']").click();
		
		
		/*
		 * driver.findElementByXPath("//button[text()='Prompt Box']").click();
		 * 
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * alert.sendKeys("TestLeaf!");
		 * 
		 * System.out.println(alert.getText());
		 * 
		 * alert.dismiss();
		 */
		
		
		
		/*
		 * driver.findElementByXPath("//button[text()='Confirm Box']").click();
		 * 
		 * Alert alert = driver.switchTo().alert(); System.out.println(alert.getText());
		 * 
		 * alert.dismiss();
		 */
		 
		
		
		
		/*
		 * driver.findElementByXPath("//button[text()='Alert Box']").click();
		 * 
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * 
		 * alert.accept();
		 * 
		 * String text=alert.getText(); System.out.println(text);
		 */
		 
		
		
		
		
		
		
		
		
		
		
		

	}

}
