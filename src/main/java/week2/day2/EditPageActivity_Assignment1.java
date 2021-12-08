package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditPageActivity_Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Edit.html");
		driver.findElementById("email").sendKeys("sairam.rain422@gmail.com");
		driver.findElementByXPath("//input[@value='Append ']").sendKeys(Keys.END+"This is my new text appended"+Keys.TAB);
		System.out.println(driver.findElementByXPath("//input[@name='username' and @value='TestLeaf']").getAttribute("value"));
		driver.findElementByXPath("//input[@name='username' and @value='Clear me!!']").clear();
		if(driver.findElementByXPath("//input[@value='Clear me!!']/following::input").isEnabled())
			System.out.println("Edit field is enabled");
		else
			System.out.println("Edit field is disabled");
		
		Thread.sleep(5000);
		driver.close();
		
	}

}
