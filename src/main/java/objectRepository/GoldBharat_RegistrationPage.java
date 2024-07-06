package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharat_RegistrationPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//button[@class='registerbotn']")private WebElement RegisterBtn;
    @FindBy(xpath="//input[@formcontrolname='businessName']")private WebElement BusinessName;
    @FindBy(xpath="//input[@placeholder=' Ex: Kumar']")private WebElement PersonName;
    @FindBy(xpath="//input[@placeholder='Ex: *********@gmail.com']")private WebElement Email;
    @FindBy(xpath="//input[@placeholder=' Ex: +91**********']")private WebElement PhoneNumber;
    @FindBy(xpath="//input[@date=' formcontrolname']")private WebElement date;
    
    @FindBy(xpath="//input[@placeholder=' Ex: 5*****']")private WebElement PinCode;
    @FindBy(xpath="//button[@placeholder='submit']")private WebElement Register;
       
     
	//Create a constructor to initialize these elements
    
	public GoldBharat_RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    

	//Provide getters to access these variables

	public WebElement getRegisterBtn() {
		return RegisterBtn;
	}

	public WebElement getBusinessName() {
		return BusinessName;
	}
	
	public WebElement getPersonName() {
		return PersonName;
	}
	public WebElement getEmail() {
		return Email;
	}
	public WebElement getPhoneNumber() {
		return PhoneNumber;
	}
	public WebElement getdate() {
		return date;
	}
	public WebElement getPinCode() {
		return PinCode;
	}
	public WebElement getRegister() {
		return Register;
	}


	//Business Libraries
	
	public void clickOnRegisterBtn()
	{
		RegisterBtn.click();
	}
	
	public void clickOnBusinessName()
	{
		BusinessName.click();
	}
	
	public void clickOnPersonName()
	{
		PersonName.click();
	}
	public void clickOnEmail()
	{
		Email.click();
	}
	public void PhoneNumber()
	{
		PhoneNumber.click();
	}

	public void clickOndate()
	{
		date.click();
	}
	public void clickOnPinCode()
	{
		PinCode.click();
	}
	public void clickOnRegister()
	{
		Register.click();
	}


	public void clickOnPhoneNumber() {
		// TODO Auto-generated method stub
		
	}
}
