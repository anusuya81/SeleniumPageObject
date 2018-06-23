package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TfPSNewProdPage {
WebDriver driver;
	
	public TfPSNewProdPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.ID,using="name")
	WebElement Prodname;
	
	@FindBy(how=How.ID,using="sales_price")
	WebElement SalesPrice;
	
	@FindBy(how=How.ID, using="item_number")
	WebElement item_number;
	
	@FindBy(how=How.ID, using="description")
	WebElement Description;
		
	@FindBy(how=How.ID,using="submit")
	WebElement submit_button;
	
	public void sendinfo_NewProduct()
	{
		Prodname.sendKeys("Phone");
		SalesPrice.sendKeys("250");
		item_number.sendKeys("23xp");
		Description.sendKeys("galaxy");
		submit_button.click();
		
		
	}
	
}
