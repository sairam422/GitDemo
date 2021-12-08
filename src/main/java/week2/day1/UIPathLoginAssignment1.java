package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UIPathLoginAssignment1 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://acme-test.uipath.com/login");
		driver.findElementById("email").sendKeys("kumar.testleaf@gmail.com");
		driver.findElementById("password").sendKeys("leaf@12");
		driver.findElementByXPath("//button[@class='btn btn-primary']").click();
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		driver.findElementByLinkText("Log Out").click();
		driver.close();
		
		
		/*
		 * Assignment3: 
		 * =========== 
		 * 1. Load url "https://acme-test.uipath.com/login" 
		 * 2. Enter email as "kumar.testleaf@gmail.com" 
		 * 3. Enter Password as "leaf@12" 
		 * 4. Click login button 
		 * 5. Get the title of the page and print 
		 * 6. Click on Log Out
		 * 7. Close the browser
		 */
		
	}

}
