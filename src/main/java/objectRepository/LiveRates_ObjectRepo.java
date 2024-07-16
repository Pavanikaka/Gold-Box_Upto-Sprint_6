package objectRepository;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LiveRates_ObjectRepo {

	//Finding WebElements Using @FindBy Annotations

	  
	
	//Create a constructor to initialize these elements
    
		public LiveRates_ObjectRepo(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
	
}
	
	


