package week4.day1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class InteractionWithWebTable {

	public static void main(String[] args) {

		String getValueForSelLearningDetail = "Learn to interact with Elements";
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("http://leafground.com/pages/table.html");

		// get count of columns
		int columnSize = driver.findElementsByXPath("//table[@id='table_id']//tr[2]/td").size();

		// get count of rows
		int rowSize = driver.findElementsByXPath("//table[@id='table_id']//tr").size();

		System.out.println("No.of Columns " + columnSize);
		System.out.println("No.of rows " + rowSize);

		/*
		 * for (int i = 2; i <= rowSize; i++) {
		 * 
		 * for (int j = 1; j <= columnSize; j++) {
		 * 
		 * String cellText = driver.findElementByXPath("//table[@id='table_id']//tr[" +
		 * i + "]/td[" + j + "]") .getText();
		 * 
		 * if (cellText.equalsIgnoreCase(getValueForSelLearningDetail)) { String value =
		 * driver.findElementByXPath("//table[@id='table_id']//tr[" + i +
		 * "]/td[2]").getText(); System.out.println(value); }
		 * 
		 * }
		 * 
		 * }
		 */

		List<Integer> progress = new ArrayList<Integer>();
		Integer x;

		for (int i = 2; i <= rowSize; i++) {
			String progressValue = driver.findElementByXPath("//table[@id='table_id']//tr[" + i + "]/td[2]").getText();
			String replaceValue = progressValue.replace("%", "");
			x = Integer.valueOf(replaceValue);
			progress.add(x);
		}

		Collections.sort(progress);

		int leastValue = progress.get(0);

		String leastValueStr = String.valueOf(leastValue);
		String concatValue = leastValueStr.concat("%");

		for (int i = 2; i <= rowSize; i++) {
			String progressValue = driver.findElementByXPath("//table[@id='table_id']//tr[" + i + "]/td[2]").getText();
			if (progressValue.contentEquals(concatValue))
				driver.findElementByXPath("//table[@id='table_id']//tr[" + i + "]/td[3]/input").click();

		}

	}

}
