package week4.day1;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class VerifyTrainNamesAreUnique {

	public static void main(String[] args) throws InterruptedException {

		List<String> storeTrainName = new ArrayList<String>();

		WebDriverManager.chromedriver().setup();

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://erail.in/");

		driver.findElementById("txtStationFrom").clear();
		driver.findElementById("txtStationFrom").sendKeys("ms");
		driver.findElementById("txtStationFrom").sendKeys(Keys.TAB);

		driver.findElementById("txtStationTo").clear();
		driver.findElementById("txtStationTo").sendKeys("mdu");
		driver.findElementById("txtStationTo").sendKeys(Keys.TAB);

		driver.findElementById("chkSelectDateOnly").click();

		Thread.sleep(2500);

		List<WebElement> trainRowCount = driver
				.findElementsByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr");

		int trainRowSize = trainRowCount.size();

		for (int i = 1; i < trainRowSize; i++) {

			String text = driver
					.findElementByXPath("//table[@class='DataTable TrainList TrainListHeader']//tr[" + i + "]/td[2]")
					.getText();

			storeTrainName.add(text);

		}

		int TrainNameSize = storeTrainName.size();

		Set<String> storeTrainNameIntoSet = new LinkedHashSet<String>(storeTrainName);

		int TrainNameSetSize = storeTrainNameIntoSet.size();

		if (TrainNameSize == TrainNameSetSize)

			System.out.println("Train Names are Unique");
		else
			System.out.println("Train Names are not Unique");

	}

}
