package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebElementVerificationLearning {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/Edit.html");
		System.out.println(driver.findElementByName("username").getAttribute("value"));
		
		driver.get("http://www.leafground.com/pages/Link.html");
		System.out.println(driver.findElementByPartialLinkText("Find where am supposed").getAttribute("href"));
		
		driver.get("http://www.leafground.com/pages/Button.html");
		System.out.println(driver.findElementById("color").getCssValue("background-color"));
		
		System.out.println(driver.findElementById("color").getText());

		System.out.println(driver.findElementById("color").getLocation().getX());
		
		System.out.println(driver.findElementById("color").getLocation().getY());
		
		System.out.println(driver.findElementById("color").getLocation());
		
		System.out.println(driver.findElementById("color").getSize().getHeight());
		
		System.out.println(driver.findElementById("color").getSize().getWidth());
		
		System.out.println(driver.findElementById("color").getSize());
		
		System.out.println(driver.findElementById("color").getTagName());
		Thread.sleep(5000);
		driver.close();

	}

}
