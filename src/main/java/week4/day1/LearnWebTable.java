package week4.day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnWebTable {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://www.leafground.com/pages/table.html");

		List<WebElement> rowCount = driver.findElementsByXPath("//table[@id='table_id']//tr");

		for (int i = 2; i <=rowCount.size(); i++) {

			List<WebElement> columnCountForEachRow = driver
					.findElementsByXPath("//table[@id='table_id']//tr[" + i + "]/td");
			for (int j = 1; j <=columnCountForEachRow.size(); j++) {

				String text = driver.findElementByXPath("//table[@id='table_id']//tr[" + i + "]/td[" + j + "]")
						.getText();
				System.out.println(text);
			}
			System.out.println();

		}

		/*
		 * List<WebElement> rowsCount =
		 * driver.findElementsByXPath("//table[@id='table_id']//tr");
		 * 
		 * for (int i = 2; i <= rowsCount.size(); i++) {
		 * 
		 * String text =
		 * driver.findElementByXPath("//table[@id='table_id']//tr["+i+"]/td[1]").getText
		 * (); System.out.println(text); }
		 */

		/*
		 * String text =
		 * driver.findElementByXPath("//table[@id='table_id']//tr[2]/td[1]").getText();
		 * 
		 * System.out.println(text);
		 */

	}

}
