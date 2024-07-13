package GoldBharat;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import genericUtility.ExcelFileUtility;
import genericUtility.GoldBharatAdmin_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.GoldBharat_AdminLoginPage;


public class AdminLogin extends GoldBharatAdmin_BaseClass {

	WebDriverUtility wUtility = new WebDriverUtility();
	JavaUtility jUtility = new JavaUtility();
	ExcelFileUtility eUtility = new ExcelFileUtility();
	public PropertyFileUtility pUtility = new PropertyFileUtility();
	

	@Test(priority = 1, groups = "GoldBharatAdminLogin")
	public void login() throws InterruptedException, EncryptedDocumentException, IOException {

		GoldBharat_AdminLoginPage AdminloginPage = new GoldBharat_AdminLoginPage(driver);
		Thread.sleep(1000);
		String AdminUserName = eUtility.readDataFromExcel("GoldBharatAdminPage", 1, 1);
		AdminloginPage.clickOnAdminUserName();
		AdminloginPage.getAdminUserName().sendKeys(AdminUserName);
		Thread.sleep(1000);
		String AdminPwd = eUtility.readDataFromExcel("GoldBharatAdminPage", 2, 1);
		AdminloginPage.clickOnAdminPwd();
		AdminloginPage.getAdminPwd().sendKeys(AdminPwd);
		Thread.sleep(2000);
		AdminloginPage.clickOnAdminLoginBtn();
		Thread.sleep(2000);
		AdminloginPage.clickOnManageLink();
		Thread.sleep(2000);
		AdminloginPage.clickOnActionEdit();
		Thread.sleep(2000);
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 400)");

		Thread.sleep(3000);
		
		 js.executeScript("window.scrollBy(0, -300)");
		 
		 Thread.sleep(2000);
		
		AdminloginPage.clickOnSilverlimit();
		
	
		
		AdminloginPage.getSilverlimit().sendKeys("10000");
		
		
		
		Thread.sleep(2000);
		
		AdminloginPage.clickOnmaxlimit();
		
		AdminloginPage.getmaxlimit().sendKeys("10000");
		Thread.sleep(2000);
		
		
		AdminloginPage.clickOnSubmitBtn();
		
		Thread.sleep(2000);
		
		//SubmitBtn.click();


		 
	/*
	 * @Test(priority = 1, groups = "GoldBharatLogin") public void loginTest() {
	 * 
	 * }
	 */
}
}
