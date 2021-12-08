package week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioButtonsPageActivityAssignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/radio.html");
		driver.findElementById("yes").click();
		if(driver.findElementByXPath("//label[@for='Checked']/input").isSelected())
			System.out.println(driver.findElementByXPath("//label[@for='Checked']").getText());
		else
			System.out.println(driver.findElementByXPath("//label[@for='Unchecked']").getText());
		if(driver.findElementByXPath("//label[contains(text(),'Select your age')]/following-sibling::input[1]").isSelected())
			System.out.println("Age already selected");
		else
			driver.findElementByXPath("//label[contains(text(),'Select your age')]/following-sibling::input[1]").click();
		
		Thread.sleep(4000);
		
		driver.close();
	}

}
