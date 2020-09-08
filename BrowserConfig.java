package ClarionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserConfig {
	private static WebDriver driver = null;


	public void init() throws Exception{
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.get("http://182.74.238.221/clarion_promise_qa/home.php");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
}
