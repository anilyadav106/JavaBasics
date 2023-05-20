/**
 * 
 */
package basicjavaprograms;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * @author anilkumar06
 *
 */
public class getBrokenLinks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
 
			WebDriverManager.edgedriver() .setup();
			WebDriver driver = new EdgeDriver();

			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			
			driver.get("https://test.redington.market/");
			try {

				List<WebElement> links = driver.findElements(By.tagName("a"));

				System.out.println("No of links are ...> : " + links.size());

				for (WebElement s : links) {

					String url = s.getAttribute("href");

					URL link = new URL(url);

					HttpsURLConnection connection = (HttpsURLConnection) link.openConnection();
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

		}
	}

 
