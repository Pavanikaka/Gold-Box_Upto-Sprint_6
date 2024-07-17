package objectRepository;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class LiveRates_ObjectRepo {

	//Finding WebElements Using @FindBy Annotations
	
	@FindBy(xpath="//li[@routerlink='/chart']")private WebElement Chart;
	
	@FindBy(xpath="//select[@name='timeSelect']")private WebElement Timeselect;
	
	@FindBy(xpath="//select[@name='typeSelect']")private WebElement Typeofgold ;
	
	
	 
	
	

	//getters  
	public WebElement getChart() {
		return Chart;
	}
	//Create a constructor to initialize these elements
    
		public LiveRates_ObjectRepo(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}

		public void clickOnChart() {
			Chart.click();
			
			
		}
		public WebElement getTimeselect() {
			return Timeselect;}
		
		
		public void selectDropdownOptions() {
			Select select = new Select(Timeselect);
			Select select1 = new Select(Typeofgold);
			
			

	        // Select "30 min" option by value
	        select.selectByValue("30");

	        
	        select.selectByValue("gold_22");
	    }

		public void clickOnTimeselect() {
			Timeselect.click();
			
		}

		public void clickOnTypeofgold() {
			// TODO Auto-generated method stub
			Typeofgold.click();
		}
			
			
		}
	

	
	


