package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementVerificationLearnings {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://www.leafground.com/pages/Button.html");
		
		System.out.println(driver.findElementById("color").isDisplayed());
		
		driver.get("http://www.leafground.com/pages/Edit.html");
		System.out.println(driver.findElementByName("username").isEnabled());
		System.out.println(driver.findElementByXPath("//*[@id='contentblock']/section/div[5]/div/div/input").isEnabled());
		
		driver.get("http://www.leafground.com/pages/checkbox.html");
		System.out.println(driver.findElementByXPath("//*[@id='contentblock']/section/div[1]/div[1]/input").isSelected());
		System.out.println(driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/div/input").isSelected());
		
		Thread.sleep(6000);
		
		driver.close();
		
	}

}
