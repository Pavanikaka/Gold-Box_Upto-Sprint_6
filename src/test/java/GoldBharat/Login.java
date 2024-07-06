package GoldBharat;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.GoldBharat_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.GoldBharat_LoginPage;
import objectRepository.LoginPage;

public class Login extends GoldBharat_BaseClass {

	WebDriverUtility wUtility = new WebDriverUtility();
	JavaUtility jUtility = new JavaUtility();
	ExcelFileUtility eUtility = new ExcelFileUtility();
	public PropertyFileUtility pUtility = new PropertyFileUtility();

	@Test(priority = 1, groups = "GoldBharatLogin")
	public void login() throws InterruptedException, EncryptedDocumentException, IOException {

		// WebDriver driver = new ChromeDriver();
		// driver.get("https://goldbharat.com/");
		GoldBharat_LoginPage loginPage = new GoldBharat_LoginPage(driver);
		Thread.sleep(1000);
		loginPage.clickOnLoginBtn();
		Thread.sleep(1000);
		String PhoneNumber = eUtility.readDataFromExcel("GoldBharat", 1, 1);
		loginPage.clickOnPhnNum();
		loginPage.getPhnNum().sendKeys(PhoneNumber);
		Thread.sleep(1000);

		loginPage.clickOnSubmitBtn();

	}
	/*
	 * @Test(priority = 1, groups = "GoldBharatLogin") public void loginTest() {
	 * 
	 * }
	 */
}
