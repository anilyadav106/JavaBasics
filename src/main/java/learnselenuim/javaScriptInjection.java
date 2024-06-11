package learnselenuim;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javaScriptInjection {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();

		WebDriver driver = new EdgeDriver();
		driver.get("https://w3schools.com/jsref/tryit.asp?filename=tryjsref_submit_get");
		driver.switchTo().frame("iframeResult");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("myFunction()"); // thats a function added in document
											// by JS developer
		js.executeScript("arguments[0].style.border='3px solid red'", driver.findElement(By.id("mySubmit")));
		driver.close();
	}

}
