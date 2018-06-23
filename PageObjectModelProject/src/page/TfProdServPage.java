package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TfProdServPage {
WebDriver driver;
	
	public TfProdServPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.XPATH,using="//span[text()='Products & Services']")
	WebElement Product_Service;
	
	@FindBy(how=How.XPATH,using="//a[text()='New Product']")
	WebElement NewProduct;
	
	
     public void clickForNewProd(){
		Product_Service.click();
		NewProduct.click();
    	 
	}
}
