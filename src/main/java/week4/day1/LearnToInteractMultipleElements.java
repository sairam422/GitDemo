package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnToInteractMultipleElements {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		List<WebElement> inputs = driver.findElementsByTagName("input");

		System.out.println(inputs.size());
		
		for (int i = 0; i < inputs.size(); i++) {
			System.out.println(inputs.get(i).getAttribute("name"));
		}
		
		
	}

}
