package GoldBharat;


import java.io.IOException;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericUtility.GoldBharat_BaseClass;
import genericUtility.PropertyFileUtility;
import objectRepository.GoldBharat_UserDashboard;

public class UserDashboardTabs  extends Login {

	private static final WebElement Facebook = null;
	PropertyFileUtility pUtil = new PropertyFileUtility();
			@Test(groups = { "Dashboardtabs" })
		public void UserDashboardTab() throws InterruptedException, IOException  {
			
			
				GoldBharat_UserDashboard Userdashboard = new GoldBharat_UserDashboard(driver);
	
		Thread.sleep(2000);		
		Userdashboard.clickOnNotificationbell();		
		boolean isClickable = Userdashboard.isNotificationbellClickable();
		
		if (isClickable) {
			
		
		
		System.out.println(" Notification bell icon successfully clickable");
	 } else {
		 
		 System.out.println("Notification bell icon is not clickable.");
     }
		
		Thread.sleep(3000);
		
		Userdashboard.clickOnNotificationbell();
		
		
		Userdashboard.clickOnLiveRates();
		
		Thread.sleep(7000);
		
		Userdashboard.clickOnBooking();
		Thread.sleep(2000);
		
		
		Userdashboard.clickOnAboutus();
		
		Thread.sleep(3000);
		/*
		String AboutustextActual  = Userdashboard.getAboutustext();
		System.out.println(AboutustextActual);
		String AboutustextExpected = "Goldsikka Limited is part of a diversified three decades old Aztar Group. Est. in 1990, which specializes in Print Media, Tech Application, Insurance Broking, Data Analytics, Ecommerce, Non Tangible Asset Management, Property Underwriting, Corporate Law Advisory and Activations.The Goldsikka is the market innovative organisation for the gold industry as an asset class. Our purpose is to stimulate and sustain demand for gold provide monetization of Gold and be the leaders on the gold liquidity.We are a unique organization that delivers tangible benefits to the gold assets. We are an active force within the market working with a large and diverse set of partners to create access, drive innovation and stimulate demand while providing a collective voice for our customers. We provide insights into the international gold markets helping people to understand the investment qualities of gold and its role in meeting the social and environmental needs of self and society.";
		wUtility.takeScreenShot(driver, "About us text in page");
		if (AboutustextActual.equals(AboutustextExpected)) {
			System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}
		*/
		JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");

		Thread.sleep(7000);
		Userdashboard.clickOnGooglePlayStore();
		
		Thread.sleep(3000);
		
		Userdashboard.clickOnAppStore();
		
		Thread.sleep(3000);
		
		 Actions actions = new Actions(driver);

	     // Perform key press action to scroll to the bottom
	     actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	        Thread.sleep(3000);

	
		
		Userdashboard.clickOnFacebook();
		
		Thread.sleep(3000);
		String mainWindowHandle = driver.getWindowHandle();
		// Switch to the new window
        Set<String> handles = driver.getWindowHandles();
        String newWindowHandle = "";
        for (String handle : handles) {
            if (!handle.equals(mainWindowHandle)) {
                newWindowHandle = handle;
                break;
            }
        }
        driver.switchTo().window(newWindowHandle);

        
        driver.close();

        // Switch back to the main window
        driver.switchTo().window(mainWindowHandle);

       
        JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        Thread.sleep(3000);
        
        Userdashboard.clickOnInstagram();
		
		Thread.sleep(3000);
		
		String mainWindowHandle1 = driver.getWindowHandle();
		// Switch to the new window
       Set<String> handles1 = driver.getWindowHandles();
        String newWindowHandle1 = "";
        for (String handle : handles1) {
            if (!handle.equals(mainWindowHandle1)) {
                newWindowHandle1 = handle;
                break;
            }
        }
        driver.switchTo().window(newWindowHandle1);

        
        driver.close();

        // Switch back to the main window
        driver.switchTo().window(mainWindowHandle1);

       
        //JavascriptExecutor js2 = (JavascriptExecutor) driver;
        js2.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
        Thread.sleep(3000);

        
        

        // Switch back to the main window
       // driver.switchTo().window(mainWindowHandle);
		//JavascriptExecutor js21 = (JavascriptExecutor) driver;
        //js21.executeScript("window.history.back()");
        //JavascriptExecutor js3 = (JavascriptExecutor) driver;
       // js3.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Userdashboard.clickOnLinkedin();
		
		Thread.sleep(3000);
		JavascriptExecutor js31 = (JavascriptExecutor) driver;
        js31.executeScript("window.history.back()");
        JavascriptExecutor js4 = (JavascriptExecutor) driver;
        js4.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Userdashboard.clickOnTwitter();
		
		Thread.sleep(5000);
		JavascriptExecutor js41 = (JavascriptExecutor) driver;
        js41.executeScript("window.history.back()");
        
        Thread.sleep(3000);
                 driver.quit();
					

}
}
