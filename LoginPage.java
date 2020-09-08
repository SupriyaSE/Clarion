package ClarionPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
		 
        private static WebElement element = null;
 
    public LoginPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
		}

	public static WebElement txtbx_UserName(WebDriver driver){
 
         element = driver.findElement(By.xpath("//input[@name='txtUsername']"));
 
         return element;
 
         }
 
     public static WebElement txtbx_Password(WebDriver driver){
 
         element = driver.findElement(By.xpath("//input[@name='txtPassword']"));
 
         return element;
 
         }
 
     public static WebElement btn_LogIn(WebDriver driver){
 
         element = driver.findElement(By.xpath("//input[@name='submit1']"));
 
         return element;
 
         }


}
