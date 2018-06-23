package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TfBank_CashPage {
WebDriver driver;
	
	public TfBank_CashPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.XPATH,using="//span[text()='Bank & Cash']")
	WebElement Bank_Cash;
	
	@FindBy(how=How.XPATH,using="//a[text()='New Account']")
	WebElement NewAccount;
	
	
     public void clickForNewAcc(){
		
    	 Bank_Cash.click();
    	 NewAccount.click();
		
	}
}
