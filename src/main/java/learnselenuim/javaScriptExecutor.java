package learnselenuim;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptExecutor {

	/**
	 * @throws InterruptedException
	 */
	@Test
	public void demoTest() throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://yahoo.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//span[text()='Sign in']")).click();

		WebElement email = driver.findElement(By.xpath("//input[@id='login-username']"));

		System.out.println("******* Entering values in text box*******");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].value='preetam@test.com'", email);
		// jse.executeScript("document.getElementById('login-username').value='hunny@text.com'");

		System.out.println("******* Clicking an element*******");
		jse.executeScript("document.getElementById('login-signin').click()");

		System.out.println("******* Getting text value #1 *******");

		String forgotPwd = jse.executeScript("return document.getElementById('mbr-forgot-link').innerHTML").toString();

		System.out.println("Inner text is :" + forgotPwd);

		System.out.println("******* Getting text value #2 *******");

		String forgotPwdArgument = (String) jse.executeScript("return arguments[0].text;", forgotPwd);

		System.out.println("Inner text is :" + forgotPwdArgument);

	}

}
