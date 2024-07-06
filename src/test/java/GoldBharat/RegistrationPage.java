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
						
	//	WebDriver driver = new ChromeDriver();
	//	driver.get("https://goldbharat.com/");
		
		
		GoldBharat_RegistrationPage RegistrationPage = new GoldBharat_RegistrationPage(driver);
		Thread.sleep(1000);
		
		RegistrationPage.clickOnRegisterBtn();
					Thread.sleep(1000);
					
					//String BusinessName = eUtility.readDataFromExcel("GoldBharat", 4,4);
					RegistrationPage.clickOnBusinessName();
					RegistrationPage.getBusinessName().sendKeys("Pavani");
					Thread.sleep(3000);
		   
			String PersonName = eUtility.readDataFromExcel("GoldBharat", 5, 5);
			RegistrationPage.clickOnPersonName();
			RegistrationPage.getPersonName().sendKeys("Pavani");
			Thread.sleep(3000);
			
			String Email = eUtility.readDataFromExcel("GoldBharat", 6, 6);
			RegistrationPage.clickOnEmail();
			RegistrationPage.getEmail().sendKeys("pavani.kaka@gmail.com");
			Thread.sleep(3000);
			
			String PhoneNumber = eUtility.readDataFromExcel("GoldBharat", 1, 1);
			RegistrationPage.clickOnPhoneNumber ();
			RegistrationPage.getPhoneNumber().sendKeys("pavani.kaka@gmail.com");
			Thread.sleep(3000);
			
			String Date = eUtility.readDataFromExcel("GoldBharat", 7, 7);
			RegistrationPage.clickOndate();
			RegistrationPage.getdate().sendKeys("11/05/2024");
			Thread.sleep(3000);
			
			
			
			String PinCode = eUtility.readDataFromExcel("GoldBharat", 8, 8);
			RegistrationPage.clickOnPinCode();
			RegistrationPage.getPinCode().sendKeys("500010");
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

