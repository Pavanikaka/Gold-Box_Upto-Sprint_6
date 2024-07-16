package GoldBharat;
 
import java.io.IOException;
 
import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
 
import org.testng.annotations.Test;
import genericUtility.ExcelFileUtility;
import genericUtility.GoldBharatAdmin_BaseClass;
import genericUtility.JavaUtility;
import genericUtility.PropertyFileUtility;
import genericUtility.WebDriverUtility;
import objectRepository.GoldBharat_AdminLoginPage;
import java.util.*;
 
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
 
		
		// Get all rows of the table
		List<WebElement> rows = driver.findElements(By.xpath("//table[@class='table table-hover mt-4']/tbody/tr"));
				String phoneNumberfromdatasheet =  eUtility.readDataFromExcel("GoldBharat", 1, 1);
		// Loop through each row to find the phone number and click the edit button
		for (WebElement row : rows) {
						List<WebElement> cells = row.findElements(By.tagName("td"));
					if (cells.size() > 0) {
				System.out.println(cells.get(4).getText());
				// Assuming the phone number is in the 5th column (index 4)
				String phoneNumber = cells.get(4).getText();
				System.out.println("Found phone number: " + phoneNumber);
				if (phoneNumberfromdatasheet.equals(phoneNumber)) {				
					AdminloginPage.clickOnActionEdit();					
					break;
				}
			}
		}

			 AdminloginPage.clickOnActionEdit(); Thread.sleep(2000);
			  JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0, 400)");
			  Thread.sleep(3000);
			  js.executeScript("window.scrollBy(0, -300)");
			  Thread.sleep(2000);
			  AdminloginPage.clickOnSilverlimit();

			  AdminloginPage.getSilverlimit().sendKeys("10000");
			  Thread.sleep(2000);
			  AdminloginPage.clickOnmaxlimit();
			 AdminloginPage.getmaxlimit().sendKeys("10000"); Thread.sleep(2000);

			  AdminloginPage.clickOnSubmitBtn();
			  Thread.sleep(2000);


 
			/*
			 * @Test(priority = 1, groups = "GoldBharatLogin") public void loginTest() {
			 * 
			 * }
			 */
	}
}