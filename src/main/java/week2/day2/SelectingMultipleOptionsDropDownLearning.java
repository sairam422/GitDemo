package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectingMultipleOptionsDropDownLearning {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/pages/Dropdown.html");
		Select multiOptionsDropDown = new Select(driver.findElementByXPath("(//select)[6]"));
		multiOptionsDropDown.selectByVisibleText("Selenium");
		multiOptionsDropDown.selectByVisibleText("Appium");
		multiOptionsDropDown.selectByVisibleText("UFT/QTP");
		multiOptionsDropDown.selectByVisibleText("Loadrunner");
		Thread.sleep(5000);
		multiOptionsDropDown.deselectByVisibleText("Appium");
		Thread.sleep(3000);
		multiOptionsDropDown.deselectByVisibleText("UFT/QTP");
		Thread.sleep(3000);
		multiOptionsDropDown.deselectByVisibleText("Loadrunner");
		Thread.sleep(5000);
		driver.close();
	}

}
