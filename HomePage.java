package ClarionPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class HomePage {

	  private static WebElement element = null;
	  private static WebDriver driver = null;
	  
	  public HomePage(WebDriver driver) {
			// TODO Auto-generated constructor stub
		}
	  
	  @FindBy(xpath="//form[@name='frmLogPromise']//td[2]//select")
	  public static WebElement dropdownList;
	  
	  @FindBy(xpath="//form[@name='frmLogPromise']")
	  public static WebElement formPage;
	  
	  
	  public static WebElement lnk_Log_Promise(WebDriver driver){
		  
		  WebDriverWait wait =new WebDriverWait(driver,20);		 
	         element = driver.findElement(By.xpath("//table[1]//ul//li//a[text()='Log Promise']"));
		        wait.until(ExpectedConditions.elementToBeClickable(element));
	         JavascriptExecutor executor = (JavascriptExecutor) driver;
				executor.executeScript("arguments[0].click();", element);
	         return element;
	 
	         }
	  
	  
	  
	  public static WebElement Promise_Form_selection(WebDriver driver,String value){       
		  WebDriverWait wait =new WebDriverWait(driver,20);		 
		  
	         element = driver.findElement(By.xpath("//form[@name='frmLogPromise']//td[2]//select"));
	      
	         wait.until(ExpectedConditions.elementToBeClickable(element));
	         
	         JavascriptExecutor executor = (JavascriptExecutor) driver;
			
	         executor.executeScript("arguments[0].click();", element);		  
		  
		  Select formName =new Select(driver.findElement(By.name("cboEmp")));
		  
		  formName.selectByVisibleText(value);
		  
		return element;
	  }
	  
	  public static WebElement Enter_Promise_Notes(WebDriver driver){
		  
		  element = driver.findElement(By.xpath("//form[@name='frmLogPromise']//textarea[@name='txtPromise']"));
		  
	         return element;
	 
		  		  
		  
	  }
	  
	  
	  public static WebElement Click_Submit_Button(WebDriver driver){
		  
		  element = driver.findElement(By.xpath("//form[@name='frmLogPromise']//input[@name='btnSubmit']"));
	  
		  return element;
	  }
	  
	  public static WebElement lnk_LogOut(WebDriver driver){
	  
	     element = driver.findElement(By.xpath("//a[@class='lightgrey']//b[text()='LOGOUT']"));
	  
	  return element;
	  
	     }
	  
}
