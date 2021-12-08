package week2.day2;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperlinkPageActivityAssignment1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leafground.com/pages/Link.html");
		driver.findElementByLinkText("Go to Home Page").click();
		if (driver.getTitle().contains("TestLeaf - Selenium Playground"))
			System.out.println("Home page loaded");
		else
			System.out.println("Home page not loaded properly");
		driver.navigate().back();
		System.out.println("you are supposed to land without clicking the link is "
				+ driver.findElementByPartialLinkText("Find where am supposed").getAttribute("href"));
		driver.findElementByLinkText("Verify am I broken?").click();
		if (driver.getTitle().contains("404"))
			System.out.println("Link is broken");
		else
			System.out.println("Link is not broken");
		driver.navigate().back();
		driver.findElementByLinkText("Go to Home Page").click();
		driver.navigate().back();
		List<WebElement> linksCount = driver.findElementsByTagName("a");
		System.out.println("Total Links in the page are " + linksCount.size());
		Thread.sleep(4000);
		driver.close();

	}

}
