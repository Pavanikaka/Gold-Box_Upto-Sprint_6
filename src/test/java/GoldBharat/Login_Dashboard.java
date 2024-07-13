package GoldBharat;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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

public class Login_Dashboard extends GoldBharat_BaseClass {

	WebDriverUtility wUtility = new WebDriverUtility();
	JavaUtility jUtility = new JavaUtility();
	ExcelFileUtility eUtility = new ExcelFileUtility();
	public PropertyFileUtility pUtility = new PropertyFileUtility();

	@Test(priority = 1, groups = "GoldBharatLogin")
	public void login() throws InterruptedException, EncryptedDocumentException, IOException {

		GoldBharat_LoginPage loginPage = new GoldBharat_LoginPage(driver);
		Thread.sleep(1000);
		loginPage.clickOnLoginBtn();
		Thread.sleep(1000);
		String PhoneNumber = eUtility.readDataFromExcel("GoldBharat", 1, 1);
		loginPage.clickOnPhnNum();
		loginPage.getPhnNum().sendKeys("6309631698");
		Thread.sleep(1000);

		loginPage.clickOnSubmitBtn();
		
		Thread.sleep(2000);
		
		String otp = eUtility.readDataFromExcel("GoldBharat", 2, 1);
		
	      char Char1 = otp.charAt(0);  // Get character at index i
	        String otp1 = Character.toString(Char1);  // Convert char to String
	        char Char2 = otp.charAt(1);  // Get character at index i
	        String otp2 = Character.toString(Char2);  // Convert char to String
	        char Char3 = otp.charAt(2);  // Get character at index i
	        String otp3 = Character.toString(Char3);  // Convert char to String
	        char Char4 = otp.charAt(3);  // Get character at index i
	        String otp4 = Character.toString(Char4);  // Convert char to String
	        char Char5 = otp.charAt(4);  // Get character at index i
	        String otp5 = Character.toString(Char5);  // Convert char to String
	        char Char6 = otp.charAt(5);  // Get character at index i
	        String otp6 = Character.toString(Char6);  // Convert char to String
	//	String otp1 = eUtility.readDataFromExcel("GoldBharat", 2, 1);
	//	String otp2 = eUtility.readDataFromExcel("GoldBharat", 3, 1);
	//	String otp3 = eUtility.readDataFromExcel("GoldBharat", 4, 1);
	//	String otp4 = eUtility.readDataFromExcel("GoldBharat", 5, 1);
	//	String otp5 = eUtility.readDataFromExcel("GoldBharat", 6, 1);
	//	String otp6 = eUtility.readDataFromExcel("GoldBharat", 7, 1);
		loginPage.clickOnotp1();
		loginPage.getotp1().sendKeys(otp1);
		loginPage.clickOnotp2();
		loginPage.getotp2().sendKeys(otp2);
		loginPage.clickOnotp3();
		loginPage.getotp3().sendKeys(otp3);
		loginPage.clickOnotp4();
		loginPage.getotp4().sendKeys(otp4);
		loginPage.clickOnotp5();
		loginPage.getotp5().sendKeys(otp5);
		loginPage.clickOnotp6();
		loginPage.getotp6().sendKeys(otp6);
		Thread.sleep(5000);
		loginPage.clickOnNotificationbell();
		
		boolean isClickable = loginPage.isNotificationbellClickable();
		
		if (isClickable) {
			
		
		
		System.out.println(" Notification bell icon successfully clickable");
	 } else {
		 
		 System.out.println("Notification bell icon is not clickable.");
     }
		
		Thread.sleep(3000);
		
		loginPage.clickOnNotificationbell();
		loginPage.clickOnLiveRates();
		
		Thread.sleep(3000);
		
		
		loginPage.clickOnAboutus();
		
		Thread.sleep(3000);
		
		
		
		
		//loginPage.clickOnProfileIcon();
		
//boolean isClickable1 = loginPage.isProfileIconClickable();
		
	//	if (isClickable1) {
			
		
		
		//System.out.println(" Profile icon successfully clickable");
	// } else {
		 
		 //System.out.println("Profile icon is not clickable.");
   //  }
		
		//loginPage.clickOnKYC();
		
	//	boolean isClickable2 = loginPage.isKYCClickable();
				
				//if (isClickable2) {
					
				
				
				//System.out.println(" KYC successfully clickable");
			// } else {
				 
				// System.out.println("KYC is not clickable.");
		   //  }
				//loginPage.clickOnNotificationbell();
				//loginPage.clickOnLiveRates();
//	}
	/*
	 * @Test(priority = 1, groups = "GoldBharatLogin") public void loginTest() {
	 * 
	 * }
	 */
}
}
