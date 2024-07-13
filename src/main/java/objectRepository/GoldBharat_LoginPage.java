package objectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharat_LoginPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//button[@class='loginbotn']")private WebElement LoginBtn;
    @FindBy(xpath="//input[@placeholder=' Enter Your Number']")private WebElement PhnNum;
    @FindBy(xpath="//button[@type='submit']")private WebElement SubmitBtn;
    @FindBy(xpath="//ng-otp-input/div/input[1]")private WebElement otp1;
    @FindBy(xpath="//ng-otp-input/div/input[2]")private WebElement otp2;
    @FindBy(xpath="//ng-otp-input/div/input[3]")private WebElement otp3;
    @FindBy(xpath="//ng-otp-input/div/input[4]")private WebElement otp4;
    @FindBy(xpath="//ng-otp-input/div/input[5]")private WebElement otp5;
    @FindBy(xpath="//ng-otp-input/div/input[6]")private WebElement otp6;
    @FindBy(xpath="//i[@class='fa-solid fa-bell fa-xl']")private WebElement Notificationbell;
    @FindBy(xpath="//li[@routerlink=\"/home\"]")private WebElement LiveRates;
    @FindBy(xpath="//li[@routerlink=\"/Booking\"]")private WebElement Booking;
    
    @FindBy(xpath="//li[@routerlink=\"/aboutus\"]")private WebElement Aboutus;
   @FindBy(xpath="//img[contains(@src, '../../assets/googlplay.png') and @alt='']")private WebElement GooglePlayStore;
    @FindBy(xpath="//img[contains(@src, '../../assets/GooglepalyStore.png') and @alt='']")private WebElement AppStore;
    
    @FindBy(xpath="//i[@class='fa-brands fa-facebook']")private WebElement Facebook;
    @FindBy(xpath="//i[@class='fa-brands fa-instagram']")private WebElement Instagram;
    @FindBy(xpath="//i[@class='fa-brands fa-linkedin']")private WebElement Linkedin;
    @FindBy(xpath="//img[@class='twiter_icon']")private WebElement Twitter;
    @FindBy(xpath="//img[@class='goldsikkaimage']")private WebElement ProfileIcon;
    @FindBy(xpath="//p[@_ngcontent-ng-c3797498073='' and text()='KYC']")private WebElement KYC;
    @FindBy(xpath="//button[@class='btn-close']")private WebElement Close;
    
    
    @FindBy(xpath="//input[@formcontrolname='proprietor_name']")private WebElement ProprietorName;
    @FindBy(xpath="//input[@formcontrolname='proprietor_pan']")private WebElement ProprietorPan;
   
    @FindBy(xpath="//input[@formcontrolname='proprietor_gst']")private WebElement ProprietorGSTNO;
    @FindBy(xpath="//input[@formcontrolname='bank_name']")private WebElement BankName;
    @FindBy(xpath="//input[@formcontrolname='account_number']")private WebElement AccountNumber;
    @FindBy(xpath="//input[@formcontrolname='ifsc_code']")private WebElement IFSCCode;
    @FindBy(xpath="//input[@formcontrolname='account_holder_name']")private WebElement HolderName;
	
	
	
	
	
	
    
    
    
	//Create a constructor to initialize these elements
    
	public GoldBharat_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    

	//Provide getters to access these variables

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public WebElement getSubmitBtn() {
		return SubmitBtn;
	}
	public WebElement getPhnNum() {
		return PhnNum;
	}
	
	
	public WebElement getotp1() {
		return otp1;
	}
	
	public WebElement getotp2() {
		return otp2;
	}
	public WebElement getotp3() {
		return otp3;
	}
	public WebElement getotp4() {
		return otp4;
	}
	public WebElement getotp5() {
		return otp5;
	}
	public WebElement getotp6() {
		return otp6;
	}
	public WebElement getNotificationbell() {
		return Notificationbell;
	}
	
	public WebElement getLiveRates() {
		return LiveRates;
	}
	public WebElement getBooking() {
		return Booking;
	}
	
	public WebElement getAboutus() {
		return Aboutus;
	}
	public WebElement getGooglePlayStore() {
		return GooglePlayStore;
	}
	
	public WebElement getAppStore() {
		return AppStore;
	}
	
	public WebElement getFacebook() {
		return Facebook;
	}
	public WebElement getInstagram() {
		return Instagram;
	}
	public WebElement getLinkedin() {
		return Linkedin;
	}
	public WebElement getTwitter() {
		return Twitter;
	}
	
	
	public WebElement getProfileIcon() {
		return ProfileIcon;
	}
	public WebElement getKYC() {
		return KYC;
	}
	public WebElement getclose() {
		return Close;
	}
	
	
	public WebElement getProprietorName() {
		return ProprietorName;
	}
	public WebElement getProprietorPan() {
		return ProprietorPan;
	}
	
	
	
	
	public WebElement getProprietorGSTNO() {
		return ProprietorGSTNO;
	}
	public WebElement getBankName() {
		return BankName;
	}
	public WebElement getAccountNumber() {
		return AccountNumber;
	}
	public WebElement getIFSCCode() {
		return IFSCCode;
	}
	public WebElement getHolderName() {
		return HolderName;
	}
	
	
	//Business Libraries
	
	public void clickOnLoginBtn()
	{
		LoginBtn.click();
	}
	
	public void clickOnPhnNum()
	{
		PhnNum.click();
	}
	
	public void clickOnSubmitBtn()
	{
		SubmitBtn.click();
	}
	public void clickOnotp1()
	{
		otp1.click();
	}
	
	
	public void clickOnotp2()
	{
		otp2.click();
	}
	public void clickOnotp3()
	{
		otp3.click();
	}
	public void clickOnotp4()
	{
		otp4.click();
	}
	public void clickOnotp5()
	{
		otp5.click();
	}
	public void clickOnotp6()
	{
		otp6.click();
	}


	public void clickOnNotificationbell() {
		
		Notificationbell.click();
	}


	public boolean isNotificationbellClickable() {
		try {
			
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		//Notificationbell.click();
		
		return false; 
	}
public void clickOnLiveRates() {
		
		
		LiveRates.click();
		
	}
public void clickOnBooking() {
	Booking.click();
	
}

public void clickOnAboutus() {
	Aboutus.click();
	
}

public void clickOnGooglePlayStore() {
	GooglePlayStore.click();
	
}



public void clickOnAppStore() {
	AppStore.click();
	
}
public void clickOnFacebook() {
	Facebook.click();
	
}
public void clickOnInstagram() {
	Instagram.click();
	
}


public void clickOnLinkedin() {
	Linkedin.click();
	
}


public void clickOnTwitter() {
Twitter.click();
	
}

	public void clickOnProfileIcon() {
		
		ProfileIcon.click();
		
		
	}


	public boolean isProfileIconClickable() {
		try {
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return false;
	}


	public void clickOnKYC() {
		
		KYC.click();
	}
		
		
	
	public boolean isKYCClickable() {
		try {
			return true;
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		// TODO Auto-generated method stub
		return false;
	}
public void clickOnclose() {
		
		Close.click();
	}

	public Object navigate() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

	public void clickOnProprietorName() {
		ProprietorName.click();
		
		
	}


	public void clickOnProprietorPan() {
		ProprietorPan.click();
		
	}
	


	


	public void clickOnProprietorGSTNO() {
		
		ProprietorGSTNO.click();
		// TODO Auto-generated method stub
		
	}


	public void clickOnBankName() {
	BankName.click();
		
	}


	public void clickOnAccountNumber() {
		
		AccountNumber.click();
	}


	


	public void clickOnIFSCCode() {
		IFSCCode.click();
		
	}
	public void clickOnHolderName() {
		HolderName.click();
		
	}


	

	


	

	                     


	


	


	


	


	


	

	

	


	


	
	
	
	
}
