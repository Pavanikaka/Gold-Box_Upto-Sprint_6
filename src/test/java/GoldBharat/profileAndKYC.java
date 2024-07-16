package GoldBharat;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import genericUtility.GoldBharat_BaseClass;
import genericUtility.PropertyFileUtility;
import objectRepository.GoldBharat_ProfileIconandKYC;
import objectRepository.GoldBharat_UserDashboard;


public class profileAndKYC  extends Login {

	PropertyFileUtility pUtil = new PropertyFileUtility();
	

		@Test(groups = { "KYC" })
		public void profile() throws InterruptedException  {
			
			
			GoldBharat_ProfileIconandKYC profile = new GoldBharat_ProfileIconandKYC(driver);
	
			//Click on Profile Icon in Login Page
			
			profile.clickOnProfileIcon();
			
			boolean isClickable1 = profile.isProfileIconClickable();
					
					if (isClickable1) {
						
					
					
					System.out.println(" Profile icon successfully clickable");
				 } else {
					 
					 System.out.println("Profile icon is not clickable.");
			     }
					
					
					
					
					//KYC clicking Operation 
					
					profile.clickOnKYC();
					
					
					
					Thread.sleep(2000);
					
					profile.clickOnclose();
					
					
					boolean isClickable2 = profile.isKYCClickable();
							
							if (isClickable2) {
								
							
							
							System.out.println(" KYC successfully clickable");
						 } else {
							 
							 System.out.println("KYC is not clickable.");
					     }
							
		//Clicking on Proprietor Name in KYC Page	
							
							profile.clickOnProprietorName();
							
							profile.getProprietorName().sendKeys("Pavani");
							
							Thread.sleep(2000);
		//Click on Proprietor Pan
							
			profile.clickOnProprietorPan();
							
							profile.getProprietorPan().sendKeys("ABCDE1234E");
							
							Thread.sleep(2000);
	
       //Click on Proprietor_pan_image
							
							String projectPath= System.getProperty("user.dir");
							
	profile.getproprietor_pan_image().sendKeys(projectPath+"\\Files\\Pan card.jpg");  
	System.out.println(projectPath+"\\Files\\Pan card.jpg");
	
							
							
							

					//	String filePath = "C:\\Users\\sures\\OneDrive\\Desktop\\Spiderman-nowayhome.png";  working one from folder
					/*		String panfilePath = "/Fms_Goldbox_Xyug/src/test/java/GoldBharat/spiderman_head.jpg";
							profile.getproprietor_pan_image().sendKeys(System.getProperty("user.dir") +panfilePath);
							Thread.sleep(3000);
							String gstpanfilePath = "/Fms_Goldbox_Xyug/src/test/java/GoldBharat/spiderman-download.jpg";
							profile.getproprietor_pan_image().sendKeys(System.getProperty("user.dir") + gstpanfilePath);  */
				
							
							
							Thread.sleep(3000);
							
							
		//Click on Proprietor GSTNO
							
			profile.clickOnProprietorGSTNO();
							
							profile.getProprietorGSTNO().sendKeys("22AAAAA0000A1Z5", Keys.TAB,Keys.TAB);
							
							Thread.sleep(2000);
	//Click On Proprietor_GST_Image
							
							
							
							profile.getproprietor_gst_image().sendKeys(projectPath+"\\Files\\GST.jpg");
		
	//Click on Bank Name
							
			profile.clickOnBankName();
							
							profile.getBankName().sendKeys("ICIC");
							
							Thread.sleep(2000);
		//Click on Account Number
							
			profile.clickOnAccountNumber();
							
							profile.getAccountNumber().sendKeys("1400001234560");
							
							Thread.sleep(2000);
		//Click on IFSC Code
							
			profile.clickOnIFSCCode();
							
							profile.getIFSCCode().sendKeys("SBIN0011755");
							
							Thread.sleep(2000);
							
		//Click on Bank Holder Name
							
			profile.clickOnHolderName();
							
							profile.getHolderName().sendKeys("Pavani");
							
							Thread.sleep(2000);  
							
							JavascriptExecutor js = (JavascriptExecutor) driver;
					        js.executeScript("window.scrollBy(0, 300)");
					        
					        Thread.sleep(2000);

		//Click on Submit Button
							
		profile.clickOnSubmitButton();
		Thread.sleep(2000);
                 
					

}
}
