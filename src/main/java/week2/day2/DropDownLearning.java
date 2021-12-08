package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownLearning {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("demosalesmanager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByPartialLinkText("CRM").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select sourceDropDown = new Select(source);
		List<WebElement> options = sourceDropDown.getOptions();
		int size = options.size();
		System.out.println(size);
		
		//System.out.println(options.get(1).getText());
		
		//options.get(size-1).click();
		
		/*
		 * for (int i = 1; i < options.size(); i++) {
		 * 
		 * WebElement eachElement = options.get(i); String text = eachElement.getText();
		 * System.out.println(text); eachElement.click();
		 * 
		 * }
		 */
		
		for (WebElement eachElement : options) {
			
			String text = eachElement.getText();
			System.out.println(text);
			eachElement.click();
			
		}
		
		
		
		Thread.sleep(3000);
		driver.close();
		
	}

}
