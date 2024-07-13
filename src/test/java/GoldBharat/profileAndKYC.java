package GoldBharat;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import genericUtility.GoldBharat_BaseClass;
import genericUtility.PropertyFileUtility;
import objectRepository.GoldBharat_ProfileIconandKYC;
import objectRepository.GoldBharat_UserDashboard;


public class profileAndKYC  extends GoldBharat_BaseClass {

	PropertyFileUtility pUtil = new PropertyFileUtility();
	

		@Test(groups = { "KYC" })
		public void profile() throws InterruptedException  {
			
			
			GoldBharat_ProfileIconandKYC profile = new GoldBharat_ProfileIconandKYC(driver);
	
			profile.clickOnProfileIcon();
			
			boolean isClickable1 = profile.isProfileIconClickable();
					
					if (isClickable1) {
						
					
					
					System.out.println(" Profile icon successfully clickable");
				 } else {
					 
					 System.out.println("Profile icon is not clickable.");
			     }
					
					
					
					
					//KYC Operation perform
					
					profile.clickOnKYC();
					
					
					
					Thread.sleep(2000);
					
					profile.clickOnclose();
					
					
					boolean isClickable2 = profile.isKYCClickable();
							
							if (isClickable2) {
								
							
							
							System.out.println(" KYC successfully clickable");
						 } else {
							 
							 System.out.println("KYC is not clickable.");
					     }
							
							
							
							profile.clickOnProprietorName();
							
							profile.getProprietorName().sendKeys("Pavani");
							
							Thread.sleep(2000);
							
			profile.clickOnProprietorPan();
							
							profile.getProprietorPan().sendKeys("ABCDE1234E");
							
							Thread.sleep(2000);
							

							
				
							
							
			profile.clickOnProprietorGSTNO();
							
							profile.getProprietorGSTNO().sendKeys("22AAAAA0000A1Z5", Keys.TAB,Keys.TAB);
							
							Thread.sleep(2000);
			profile.clickOnBankName();
							
							profile.getBankName().sendKeys("ICIC");
							
							Thread.sleep(2000);
			profile.clickOnAccountNumber();
							
							profile.getAccountNumber().sendKeys("1400001234560");
							
							Thread.sleep(2000);
			profile.clickOnIFSCCode();
							
							profile.getIFSCCode().sendKeys("SBIN0011755");
							
							Thread.sleep(2000);
			profile.clickOnHolderName();
							
							profile.getHolderName().sendKeys("Pavani");
							
							Thread.sleep(2000);   
                 
					

}
}
