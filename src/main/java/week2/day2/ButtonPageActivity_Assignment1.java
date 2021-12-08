package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ButtonPageActivity_Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Button.html");
		driver.findElementById("home").click();
		if(driver.getTitle().contains("TestLeaf - Selenium Playground"))
			System.out.println("Navigated to Home page");
		else
			System.out.println("Not Navigated to Home page");
		Thread.sleep(3000);
		driver.get("http://leafground.com/pages/Button.html");
		System.out.println(driver.findElementById("position").getLocation());
		System.out.println(driver.findElementById("color").getCssValue("background-color"));
		System.out.println(driver.findElementById("size").getSize());
		Thread.sleep(4000);
		driver.close();
		
	}

}
