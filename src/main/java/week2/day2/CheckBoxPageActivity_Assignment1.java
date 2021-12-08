package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBoxPageActivity_Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/checkbox.html");
		driver.findElementByXPath("//label[contains(text(),'Select the')]/following::div[1]/input").click();
		driver.findElementByXPath("//label[contains(text(),'Select the')]/following::div[3]/input").click();
		driver.findElementByXPath("//label[contains(text(),'Select the')]/following::div[4]/input").click();
		boolean seleniumCheck = driver.findElementByXPath("//label[contains(text(),'Confirm')]/following::div[1]/input")
				.isSelected();
		if (seleniumCheck == true)
			System.out.println("Checkbox selected");
		else
			System.out.println("Checkbox not selected");
		if (driver.findElementByXPath("//label[contains(text(),'De')]/following::div[2]/input").isSelected())
			driver.findElementByXPath("//label[contains(text(),'De')]/following::div[2]/input").click();
		else
			System.out.println("Already unchecked");
		for (int i = 1; i <= driver.findElementsByXPath("//label[contains(text(),'Select all')]/following::input")
				.size(); i++)
			driver.findElementByXPath("//label[contains(text(),'Select all')]/following::input[" + i + "]").click();
		Thread.sleep(4000);
		driver.close();
	}

}
