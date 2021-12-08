package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserVerificationsLearning {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.leafground.com/home.html");
		String titlePage= driver.getTitle();
		System.out.println("The Title of the page is : "+titlePage);
		
		if(titlePage.contains("TestLeaf"))
			System.out.println("I confirm the title has testleaf");
		else
			System.out.println("The title does not have the word title");
		
		System.out.println("Current url is : "+driver.getCurrentUrl());
		
		System.out.println("Current Page Source:"+driver.getPageSource());
				
		driver.close();
		
	}

}
