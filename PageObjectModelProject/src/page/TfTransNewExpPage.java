package page;

import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

/* if the pagesource if it has select tag we can create like this
Select acc=new Select(Account);
acc.selectByVisibleText("Swimming");
 Select dd=new Select(date);
 dd.getFirstSelectedOption();*/

public class TfTransNewExpPage {
WebDriver driver;
	
	public TfTransNewExpPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	@FindBy(how=How.ID,using="select2-account-container")
	WebElement Account;
	//because in this website they are using the bootstrap dropdown. so we have to find xpath for ul
	//list-->is used to store all the values in the dropdown menu
	//create your own xpath //ul[@class='class name in pagesource']//li/a
	//"a" is represents in that html code if we have any link we can use that
	@FindBy(how=How.XPATH,using="//ul[@class='select2-results__options']//li")
	List<WebElement> dropdown;
	
	@FindBy(how=How.ID,using="date")
	WebElement date;

	@FindBy(how=How.ID,using="description")
	WebElement Description;
	
	@FindBy(how=How.ID,using="amount")
	WebElement Amount;
	
	@FindBy(how=How.ID,using="submit")
	WebElement submit_button;
	
	 public void AddingNewExpInfo(){
		 //account.click,then only we can select one from the dropdown menu
		 Account.click();
		 
		 System.out.println(dropdown);
		 for(int i=0;i<dropdown.size();i++)
		 {
		 WebElement element=dropdown.get(i);
		 System.out.println(element);
		 String innertext=element.getText();
		 System.out.println(innertext);
		 if(innertext.contentEquals("Swimming"))
		 {
			 element.click();
			 break;
		 }
		 
		 }
		// date.click();
		 
		
			Description.sendKeys("Tution");
			Amount.sendKeys("200");
			submit_button.click();
	 }

}
