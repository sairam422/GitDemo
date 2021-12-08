package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownPageActivity_Assignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Dropdown.html");
		Select dropDown1=new Select(driver.findElementById("dropdown1"));
		dropDown1.selectByIndex(1);
		Select dropDown2 = new Select(driver.findElementByName("dropdown2"));
		dropDown2.selectByVisibleText("Appium");
		Select dropDown3 = new Select(driver.findElementById("dropdown3"));
		dropDown3.selectByValue("3");
		Select dropDown4=new Select(driver.findElementByClassName("dropdown"));
		List<WebElement> options = dropDown4.getOptions();
		System.out.println("Number of dropdown options "+options.size());
		driver.findElementByXPath("//option[contains(text(),'You can also')]/parent::select").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//option[contains(text(),'You')]/following-sibling::option[4]").click();
		Thread.sleep(3000);
		driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[1]").click();
		driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[2]").click();
		driver.findElementByXPath("//option[text()='Select your programs']/following-sibling::option[3]").click();
		Thread.sleep(3000);
		driver.close();
	}

}
