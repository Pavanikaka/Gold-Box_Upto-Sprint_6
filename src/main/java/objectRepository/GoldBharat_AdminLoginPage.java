package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoldBharat_AdminLoginPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//input[@formcontrolname='userId']")private WebElement AdminUserName;
    @FindBy(xpath="//input[@formcontrolname='password']")private WebElement AdminPwd;
    @FindBy(xpath="//button[@type='submit']")private WebElement AdminLoginBtn;
    @FindBy(xpath="//p[contains(text(), 'Manage')]")private WebElement ManageLink;
    
   
    
  @FindBy(xpath="//i[@class='fa fa-pencil']")private WebElement ActionEdit;
  
  @FindBy(xpath="//input[@formcontrolname='silver_max_limit']")private WebElement Silverlimit;
  
  
  
  @FindBy(xpath="//input[@formcontrolname='max_limit']")private WebElement maxlimit;
  
  
  
  @FindBy(xpath="//button[@type='submit']")private WebElement SubmitBtn;

	
  
  
  
  
    
      
	//Create a constructor to initialize these elements
    
	public GoldBharat_AdminLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    
	//Provide getters to access these variables

	public WebElement getAdminUserName() {
		return AdminUserName;
	}

	public WebElement getAdminPwd() {
		return AdminPwd;
	}
	public WebElement getAdminLoginBtn() {
		return AdminLoginBtn;
	}
	
	//Business Libraries
	
	public void clickOnAdminUserName()
	{
		AdminUserName.click();
	}
	
	public void clickOnAdminPwd()
	{
		AdminPwd.click();
	}
	
	public void clickOnAdminLoginBtn()
	{
		AdminLoginBtn.click();
	}
	public void clickOnManageLink()
	{
		ManageLink.click();
	}
	public void clickOnActionEdit()
	{
		ActionEdit.click();
	}
	public void clickOnSilverlimit()
	{
		Silverlimit.clear();
	}
	public void clickOnmaxlimit()
	{
		maxlimit.clear();
	}

	public void clickOnSubmitBtn() {
		// TODO Auto-generated method stub
		SubmitBtn.click();
	}

	public WebElement getSilverlimit() {
		// TODO Auto-generated method stub
		return Silverlimit;
	}

	public WebElement getmaxlimit() {
		// TODO Auto-generated method stub
		return maxlimit;
	}
}
