package learnselenuim;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webTables {

	/**
	 * @throws InterruptedException
	 * @throws ParseException
	 */

	@Test
	public void demoTest() throws InterruptedException, ParseException {
		double m = 0, r = 0;
		String Max;
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/gainers");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		
		/* go to last table */
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//a[text()='Group Z']")))).click();

		System.out.println(driver.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td[1]")).getText());

		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr"));
		List<WebElement> cols = driver.findElements(By.xpath("//table[@class='dataTable']//tbody//tr[1]//td"));

		System.out.println("no of rows are: " + rows.size());
		System.out.println("no of cols are: " + cols.size());

		System.out.println("         Printing all cell values        ");

		for (int i = 1; i <= rows.size(); i++) {

			for (int j = 1; j <= cols.size(); j++) {

				System.out
						.print(driver.findElement(By.xpath("//table[@class='dataTable']//tr[" + i + "]//td[" + j + "]"))
								.getText() + "  ");
			}
			System.out.println();
		}

		System.out.println("*********Find last row values********");

		int lastRow = rows.size();

		for (int c = 1; c < cols.size(); c++) {
			String str = driver
					.findElement(By.xpath("//table[@class='dataTable']//tbody//tr[" + lastRow + "]//td[" + c + "]"))
					.getText() + " ";
			System.out.print("last row values are:" + str);
			System.out.println();

		}

		System.out.println("*********Find max values of a cell********");

		for (int i = 1; i < rows.size(); i++) {

			int j = 4;

			Max = driver.findElement(By.xpath("//table[@class='dataTable']//tr[" + (i + 1) + "]//td[" + j + "]"))
					.getText();

			NumberFormat f = NumberFormat.getNumberInstance();
			Number num = f.parse(Max);
			Max = num.toString();
			m = Double.parseDouble(Max);
			if (m > r) {

				r = m;
			}
		}
		System.out.println("max current price is :" + r);

		driver.quit();
	}

}
