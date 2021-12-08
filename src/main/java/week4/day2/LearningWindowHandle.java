package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearningWindowHandle {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Window.html");
		System.out.println(driver.getTitle());
		driver.findElementById("home").click();
		System.out.println(driver.getTitle());

	}

}
