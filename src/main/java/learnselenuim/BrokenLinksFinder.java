package learnselenuim;

import java.net.HttpURLConnection;
import java.net.URL;
import java.sql.DriverManager;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BrokenLinksFinder  { 
	
public void getBrokenLinks() { 

 
	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	driver.get("https://test.redington.market/");
	try {

		List<WebElement> links = driver.findElements(By.tagName("a"));

		System.out.println("No of links are ...> : " + links.size());

		for (WebElement s : links) {

			String url = s.getAttribute("href");

			URL link = new URL(url);

			HttpURLConnection connection = (HttpURLConnection) link.openConnection();
			Thread.sleep(2000);
			connection.connect();
			int resCode = connection.getResponseCode();

			if (resCode >= 400) {

				System.out.println("The url > " + url + " is a broken link");
			}

			else

				System.out.println("The url > " + url + " is a active link");
		}

	} catch (Exception e) {
		System.out.println("Unable to manipulate URLs");
		e.printStackTrace();
	}

}}