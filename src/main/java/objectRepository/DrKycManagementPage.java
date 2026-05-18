package objectRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrKycManagementPage {

	//Finding WebElements Using @FindBy Annotations

	@FindBy(xpath="//a[@href='/dashboard']")private WebElement DashBoard;
	
	@FindBy(xpath="//a[@href='/doctor/d-cons-mangement']")private WebElement ConsManagement;
	
    @FindBy(xpath="//td[contains(.,' Dr. Teja')]/following-sibling::td[contains(.,'6666666666')]/following-sibling::td[contains(.,'16 May 2026')]/following-sibling::td[contains(.,' Approved ')]/following-sibling::td[.='Preview']")private WebElement DoctorIcon;
    
    @FindBy(xpath="//a[.='Prev']")private WebElement PreviousLnk;
    
    @FindBy(xpath="//a[.='Next']")private WebElement NextLnk;
    
    @FindBy(xpath="//p[.=' Logout ']")private WebElement LogoutLnk;
  
  
    	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public DrKycManagementPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    

	//Rule-4:Provide getters to access these variables
	
	public WebElement getDashBoard() {
		return DashBoard;
	}


	public WebElement getConsManagement() {
		return ConsManagement;
	}


	public WebElement getDoctorIcon() {
		return DoctorIcon;
	}


	public WebElement getPreviousLnk() {
		return PreviousLnk;
	}


	public WebElement getNextLnk() {
		return NextLnk;
	}


	public WebElement getLogoutLnk() {
		return LogoutLnk;
	}
	
	//Business Library
	
	public void clickOnParticularDoctorPreviewBUTTON(WebDriver driver,String DoctorName, int MobileNo, String Status)
	{
		driver.findElement(By.xpath("//td[contains(.,' "+DoctorName+"')]/following-sibling::td[contains(.,'"+MobileNo+"')]/following-sibling::td[contains(.,'16 May 2026')]/following-sibling::td[contains(.,' "+Status+" ')]/following-sibling::td[.='Preview']"));
	}
	
}
