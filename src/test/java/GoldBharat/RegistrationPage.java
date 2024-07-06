package GoldBharat;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.GoldBharat_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.DashboardPage;
import objectRepository.GoldBharat_LoginPage;
import objectRepository.GoldBharat_RegistrationPage;
import objectRepository.LoginPage;

public class RegistrationPage extends GoldBharat_BaseClass {

	WebDriverUtility wUtility = new WebDriverUtility();
	JavaUtility jUtility = new JavaUtility();
	ExcelFileUtility eUtility = new ExcelFileUtility();

	public PropertyFileUtility pUtility=new PropertyFileUtility();
	
		@Test(priority = 1, groups = "GoldBharatRegister")
	public void Registration () throws InterruptedException, EncryptedDocumentException, IOException
	{
						
	
		GoldBharat_RegistrationPage RegistrationPage = new GoldBharat_RegistrationPage(driver);
		Thread.sleep(1000);
		
		RegistrationPage.clickOnRegisterBtn();
					Thread.sleep(1000);
				
					String BusinessName = eUtility.readDataFromExcel("GoldBharat", 4, 1);
					RegistrationPage.clickOnBusinessName();
					RegistrationPage.getBusinessName().sendKeys(BusinessName);
					Thread.sleep(1000);
		   
			String PersonName = eUtility.readDataFromExcel("GoldBharat", 5, 1);
			RegistrationPage.clickOnPersonName();
			RegistrationPage.getPersonName().sendKeys(PersonName);
			Thread.sleep(1000);
			
			String Email = eUtility.readDataFromExcel("GoldBharat", 6, 1);
			RegistrationPage.clickOnEmail();
			RegistrationPage.getEmail().sendKeys(Email);
			Thread.sleep(1000);
			
			String PhoneNumber = eUtility.readDataFromExcel("GoldBharat", 1, 1);
			RegistrationPage.clickOnPhoneNumber ();
			RegistrationPage.getPhoneNumber().sendKeys(PhoneNumber);
			Thread.sleep(1000);
			
			String Date = eUtility.readDataFromExcel("GoldBharat", 7, 1);
			RegistrationPage.clickOndate();
			RegistrationPage.getdate().sendKeys(Date);
			Thread.sleep(4000);
			RegistrationPage.getdate().sendKeys(Keys.TAB);
		
			
			String PinCode = eUtility.readDataFromExcel("GoldBharat", 8, 1);
			RegistrationPage.clickOnPinCode();
			RegistrationPage.getPinCode().sendKeys(PinCode);
			Thread.sleep(3000);
			
			RegistrationPage.clickOnRegisterBtn();
				
	}
	/*	@Test(priority = 1, groups = "GoldBharatRegister")
		public void loginTest()
		{
			
		} */

		//private static void clickOnRegisterBtn() {
			// TODO Auto-generated method stub
			
		}

