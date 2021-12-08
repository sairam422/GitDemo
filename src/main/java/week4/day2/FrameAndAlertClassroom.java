package week4.day2;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAndAlertClassroom {

	public static void main(String[] args) {
		String st1="Sai Ram";
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		driver.switchTo().alert().sendKeys(st1);
		driver.switchTo().alert().accept();
		//driver.switchTo().defaultContent()
		String text = driver.findElementById("demo").getText();
		if(text.contains(st1))
			System.out.println(st1+" is present");
		else
			System.out.println(st1+" is not present");
		
		driver.switchTo().defaultContent();
		
	}

}
