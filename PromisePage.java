package ClarionPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PromisePage {

	private static WebElement element = null;

	public PromisePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//table//td[3][@align='left']")
	public static List<WebElement> PromiseList;

	public static boolean Verify_PromiseAdded(WebDriver driver) {
		try {
			element = driver
					.findElement(By.xpath("//font[text()='Promise added successfully']||//font[@color='#FF0000']"));
			return element.isDisplayed();
		}

		catch (Exception exp) {
			return false;
		}

	}

	public static WebElement Select_Promisor(WebDriver driver, String PromisorName) {

		WebDriverWait wait = new WebDriverWait(driver, 20);

		element = driver.findElement(By.xpath("//table//td[2]//select"));

		wait.until(ExpectedConditions.elementToBeClickable(element));

		JavascriptExecutor executor = (JavascriptExecutor) driver;

		executor.executeScript("arguments[0].click();", element);

		Select Promisor = new Select(driver.findElement(By.name("cboEmp")));

		Promisor.selectByVisibleText(PromisorName);

		return element;
	}

	public static WebElement Enter_StartDateFiled(WebDriver driver, String date) {
		try {
			driver.findElement(By.xpath("//input[@name='txtStartDate']")).sendKeys(date);
			return element;
		}

		catch (Exception exp) {
			return null;
		}

	}

	public static WebElement Click_Search_Button(WebDriver driver) {

		element = driver.findElement(By.xpath("//input[@name='btnSearch']"));

		return element;
	}

	public static String Verify_PromisorData(WebDriver driver, String PromisorNote) {

		for (int i = 0; i < PromiseList.size(); i++) {

			if (PromiseList.get(1).getText().contains(PromisorNote)) {
				System.out.println("Promise Note is added as  " + PromisorNote);
			} else {
				return "fail";
			}
			System.out.println("Promise Note is added as  " + PromisorNote);

		}
		return PromisorNote;

	}

}
