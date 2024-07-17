package GoldBharat;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import genericUtility.GoldBharat_BaseClass;
import genericUtility.PropertyFileUtility;
import objectRepository.LiveRates_ObjectRepo;


public class LiveRates  extends Login {

	
	PropertyFileUtility pUtil = new PropertyFileUtility();
	

		@Test(groups = { "KYC" })
		public void LiveRatesmethod()   {
			
			LiveRates_ObjectRepo liverates = new LiveRates_ObjectRepo(driver);
			liverates.clickOnChart();
			
			
			liverates.clickOnTimeselect();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			liverates.clickOnTypeofgold();
			
			
			
			
			 
			
					

}
}
