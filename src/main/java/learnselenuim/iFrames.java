package learnselenuim;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class iFrames extends Testbase {

	public static void main(String[] args) {

		try {
			Testbase.launchBrowser();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.switchTo().frame("iframeResult");   //  by ID or name only- But if no ID or name then use index
		driver.findElement(By.xpath("/html/body/button")).click();

		driver.switchTo().defaultContent();
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		driver.close();

	}

}
