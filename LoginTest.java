package ClarionTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import ClarionPages.HomePage;
import ClarionPages.LoginPage;
import ClarionPages.PromisePage;

public class LoginTest {
	private static WebDriver driver = null;
	LoginPage loginpage=new LoginPage(driver);
	HomePage homepage=new HomePage(driver);
	PromisePage promisepage = new PromisePage(driver);
	
	@Test
	public void init() throws Exception{
		  System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\test\\driver\\chromedriver.exe");
		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();


			driver.get("http://182.74.238.221/clarion_promise_qa/home.php");
		 loginpage = PageFactory.initElements(driver, LoginPage.class);

		loginpage.txtbx_UserName(driver).sendKeys("sanjeetk@clariontechnologies.co.in");
       loginpage.txtbx_Password(driver).sendKeys("clarion");
       loginpage.btn_LogIn(driver).click();
     System.out.println(" Login Successfully...");
		HomePage.lnk_Log_Promise(driver);
		     System.out.println(" Clicked on  Log_Promise Link.");
		     HomePage.Promise_Form_selection(driver, "Sonali test");
		     HomePage.Enter_Promise_Notes(driver).sendKeys("Given Data is Promisor 123");
		     HomePage.Click_Submit_Button(driver).click();
		     PromisePage.Verify_PromiseAdded(driver);
		     System.out.println("Promise added message is diplayed.");
		     PromisePage.Select_Promisor(driver,"Sonali test");
		     PromisePage.Enter_StartDateFiled(driver,"08-09-2020");
		     PromisePage.Click_Search_Button(driver).click();
		     PromisePage.Verify_PromisorData(driver, "Given Data is Promisor 123 ");
		     HomePage.lnk_LogOut(driver).click();
		
		}
}
