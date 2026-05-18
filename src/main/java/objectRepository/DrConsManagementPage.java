package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DrConsManagementPage {

	//Finding WebElements Using @FindBy Annotations

    @FindBy(xpath="//td[contains(.,' Dr. Teja')]/following-sibling::td[contains(.,'6666666666')]/following-sibling::td[contains(.,'16 May 2026')]/following-sibling::td[contains(.,' Approved ')]/following-sibling::td[.='Preview']")private WebElement DoctorIcon;
    
    @FindBy(xpath="//img[contains(@src,'patient')]")private WebElement PatientIcon;
    
    @FindBy(xpath="//img[contains(@src,'dash')]")private WebElement DashboardIcon;
    	
  
	//Rule-3:Create a constructor to initilise these elements
    
	public DrConsManagementPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
    

	//Rule-4:Provide getters to access these variables
	
}
