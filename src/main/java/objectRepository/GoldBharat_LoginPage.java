package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharat_LoginPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//button[@class='loginbotn']")private WebElement LoginBtn;
    @FindBy(xpath="//input[@placeholder=' Enter Your Number']")private WebElement PhnNum;
    @FindBy(xpath="//input[@type='submit']")private WebElement SubmitBtn;
    
       
     
	//Create a constructor to initialize these elements
    
	public GoldBharat_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    

	//Provide getters to access these variables

	public WebElement getLoginBtn() {
		return LoginBtn;
	}

	public WebElement getPhnNum() {
		return PhnNum;
	}
	
	public WebElement getSubmitBtn() {
		return SubmitBtn;
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
}
