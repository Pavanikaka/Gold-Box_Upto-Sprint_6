package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//img[contains(@src,'doctor')]")private WebElement DoctorIcon;
    
    @FindBy(xpath="//img[contains(@src,'patient')]")private WebElement PatientIcon;
    
    @FindBy(xpath="//img[contains(@src,'dash')]")private WebElement DashboardIcon;
    	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public DashboardPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    

	//Rule-4:Provide getters to access these variables
	
	public WebElement getDoctorIcon() {
		return DoctorIcon;
	}


	public WebElement getPatientIcon() {
		return PatientIcon;
	}


	public WebElement getDashboardIcon() {
		return DashboardIcon;
	}
	
	//Business Library
	
	public void clickOnDoctorIcon()
	{
		DoctorIcon.click();
	}
	
	public void clickOnPatientIcon()
	{
		PatientIcon.click();
	}
	
	public void clickOnDashboardIcon()
	{
		DashboardIcon.click();
	}
	
}
