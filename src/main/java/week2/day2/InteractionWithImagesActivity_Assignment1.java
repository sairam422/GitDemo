package week2.day2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractionWithImagesActivity_Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElementByXPath("//label[@for='home']/following-sibling::img").click();
		if(driver.getTitle().contains("TestLeaf - Selenium Playground"))
			System.out.println("Home page loaded");
		else
			System.out.println("Home page not loaded successfully");
		driver.navigate().back();
		String imgLink = driver.findElementByXPath("//label[contains(text(),'Am I Broken Image?')]/following-sibling::img").getAttribute("src");
		System.out.println(imgLink);
		driver.get(imgLink);
		if(driver.getTitle().contains("404"))
			System.out.println("Image is broken");
		else
			System.out.println("Image is not broken");
		driver.get("http://leafground.com/pages/Image.html");
		driver.findElementByXPath("//label[contains(text(),'Click on this')]/following-sibling::img").click();
		Thread.sleep(3000);
		driver.close();
		
	}

}
