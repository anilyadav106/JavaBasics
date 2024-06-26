package learnselenuim;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionAPI {

	public static void main(String[] args) {

     WebDriverManager.chromedriver().setup();
 
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("sdsd")).getCssValue("font-colour"); 
		
		driver.getWindowHandles();	
		if (driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).isDisplayed())
 
		
		{

			driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		}

		WebDriverWait wait = new WebDriverWait(driver, 10);

		WebElement menButton = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()='Men']")));

		Actions act = new Actions(driver);
		act.moveToElement(menButton).perform(); 
	
		
		WebElement tshirtButton = wait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[text()='T-Shirts']")));

		act.click(tshirtButton).perform();

		WebElement sliderPrice = driver.findElement(By.xpath("//div[@class='gl5Kwg']"));
		act.dragAndDropBy(sliderPrice, 30, 0);

		driver.close();
	}
}
