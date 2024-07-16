package GoldBharat;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import genericUtility.GoldBharat_BaseClass;
import genericUtility.PropertyFileUtility;
import objectRepository.LiveRates_ObjectRepo;


public class LiveRates  extends GoldBharat_BaseClass {

	PropertyFileUtility pUtil = new PropertyFileUtility();
	

		@Test(groups = { "KYC" })
		public void LiveRatesmethod()   {
			
			LiveRates_ObjectRepo liverates = new LiveRates_ObjectRepo(driver);
			
			
					

}
}
