package learnselenuim;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testbase {

	protected static Properties config = new Properties();
	private static FileInputStream fis;
	protected static WebDriver driver;

	/*
	 * method to launch the browser basis the value provided from configuration
	 * file
	 */

	public static void launchBrowser() throws IOException {

		try {
			fis = new FileInputStream(".\\src\\test\\resources\\properties\\config.properties");
			config.load(fis);
		} catch (IOException e) {
			System.out.println("unable to read the config properties file");
			e.printStackTrace();
		}

		if (config.getProperty("browser").contains("CHROME")) {

			WebDriverManager.chromedriver().setup();
			ChromeOptions options = new ChromeOptions();
			options.setPageLoadStrategy(PageLoadStrategy.NONE);
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);

		} else if (config.getProperty("browser").contains("FF")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		}

		else if (config.getProperty("browser").contains("IE")) {

			WebDriverManager.iedriver().setup();
			InternetExplorerOptions options = new InternetExplorerOptions();

			options.ignoreZoomSettings();

			options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

			driver = new InternetExplorerDriver(options);
		}

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();

		/* to get page load time ad implicit wait values from config file */

		driver.manage().timeouts().pageLoadTimeout(Long.parseLong(config.getProperty("pageLoadTime")),
				TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Long.parseLong(config.getProperty("implicitWait")), TimeUnit.SECONDS);

	}

}