package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TfBCNewAccPage {
WebDriver driver;
	
	public TfBCNewAccPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.ID,using="account")
	WebElement accounttitle;
	
	@FindBy(how=How.ID,using="description")
	WebElement description;
	
	@FindBy(how=How.ID, using="balance")
	WebElement initialbalance;
	
		
	@FindBy(how=How.XPATH,using="//text()[contains(.,'Submit')]/ancestor::button[1]")
	WebElement submit_button;
	
	public void sendinfo_NewAcc()
	{
		accounttitle.sendKeys("Swimming");
		description.sendKeys("tution");
		initialbalance.sendKeys("200");
		submit_button.click();
	}
	
	
}
