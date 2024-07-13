package GoldBharat;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v116.page.model.NavigatedWithinDocument;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import genericUtility.ExcelFileUtility;
import genericUtility.FMS_BaseClass;
import genericUtility.GoldBharat_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import net.bytebuddy.asm.Advice.Enter;
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
		
		Thread.sleep(7000);
		
		loginPage.clickOnBooking();
		Thread.sleep(2000);
		
		
		loginPage.clickOnAboutus();
		
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");

		Thread.sleep(7000);
		
loginPage.clickOnGooglePlayStore();
		
		Thread.sleep(3000);
		
loginPage.clickOnAppStore();
		
		Thread.sleep(3000);
		
	
		
loginPage.clickOnFacebook();
		
		Thread.sleep(3000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
        js1.executeScript("window.history.back()");
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollBy(0, 1000)");
loginPage.clickOnInstagram();
		
		Thread.sleep(3000);
		JavascriptExecutor js21 = (JavascriptExecutor) driver;
        js21.executeScript("window.history.back()");
        JavascriptExecutor js3 = (JavascriptExecutor) driver;
        js3.executeScript("window.scrollBy(0, 1000)");
loginPage.clickOnLinkedin();
		
		Thread.sleep(3000);
		JavascriptExecutor js31 = (JavascriptExecutor) driver;
        js31.executeScript("window.history.back()");
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollBy(0, 1000)");
loginPage.clickOnTwitter();
		
		Thread.sleep(5000);
		JavascriptExecutor js41 = (JavascriptExecutor) driver;
        js41.executeScript("window.history.back()");
                 
		
		 
		
		
        
		loginPage.clickOnProfileIcon();
		
boolean isClickable1 = loginPage.isProfileIconClickable();
		
		if (isClickable1) {
			
		
		
		System.out.println(" Profile icon successfully clickable");
	 } else {
		 
		 System.out.println("Profile icon is not clickable.");
     }
		//KYC Operation perform
		
		loginPage.clickOnKYC();
		
		
		
		Thread.sleep(2000);
		
		loginPage.clickOnclose();
		
		
		boolean isClickable2 = loginPage.isKYCClickable();
				
				if (isClickable2) {
					
				
				
				System.out.println(" KYC successfully clickable");
			 } else {
				 
				 System.out.println("KYC is not clickable.");
		     }
				
				
				
				loginPage.clickOnProprietorName();
				
				loginPage.getProprietorName().sendKeys("Pavani");
				
				Thread.sleep(2000);
				
loginPage.clickOnProprietorPan();
				
				loginPage.getProprietorPan().sendKeys("ABCDE1234E");
				
				Thread.sleep(2000);
				

				
	
				
				
loginPage.clickOnProprietorGSTNO();
				
				loginPage.getProprietorGSTNO().sendKeys("22AAAAA0000A1Z5", Keys.TAB,Keys.TAB);
				
				Thread.sleep(2000);
loginPage.clickOnBankName();
				
				loginPage.getBankName().sendKeys("ICIC");
				
				Thread.sleep(2000);
loginPage.clickOnAccountNumber();
				
				loginPage.getAccountNumber().sendKeys("1400001234560");
				
				Thread.sleep(2000);
loginPage.clickOnIFSCCode();
				
				loginPage.getIFSCCode().sendKeys("SBIN0011755");
				
				Thread.sleep(2000);
loginPage.clickOnHolderName();
				
				loginPage.getHolderName().sendKeys("Pavani");
				
				Thread.sleep(2000);
				
//	}
	/*
	 * @Test(priority = 1, groups = "GoldBharatLogin") public void loginTest() {
	 * 
	 * }
	 */
}
}
