package page;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TechfiosContactPage {
WebDriver driver;
	
	public TechfiosContactPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.ID,using="account")
	WebElement Fullname;
	
	@FindBy(how=How.ID,using="company")
	WebElement company;
	
	@FindBy(how=How.ID, using="email")
	WebElement email;
	
	@FindBy(how=How.ID,using="phone")
	WebElement phone;
	
	@FindBy(how=How.ID,using="address")
	WebElement address;
	
	@FindBy(how=How.ID,using="city")
	WebElement city;
	
	@FindBy(how=How.ID,using="state")
	WebElement state;
	
	@FindBy(how=How.ID,using="zip")
	WebElement zip;
	
	/*@FindBy(how=How.ID,using="select2-country-container")
	WebElement Country;
	@FindBy(how=How.XPATH,using="//ul[@class='select2-country-results']//li")
	List<WebElement> dropdown1;*/
	
	@FindBy(how=How.ID,using="submit")
	WebElement submit;
	
	
	
	
     public void send_info() throws InterruptedException{
    	 Fullname.sendKeys("John Abraham");
 		 company.sendKeys("Starbucks");
 		 email.sendKeys("abc@gmail.com");
 		 phone.sendKeys("1234567890");
 		 address.sendKeys("apt 12,allenwood street");
 		 city.sendKeys("Dallas");
 		 state.sendKeys("Texas");
 		 zip.sendKeys("75234");
		/* Country.click();
		 System.out.println(dropdown1);
		 for(int i=0;i<dropdown1.size();i++)
		 {
		 WebElement element=dropdown1.get(i);
		 System.out.println(element);
		 String innertext=element.getText();
		 System.out.println(innertext);
		 if(innertext.contentEquals("United States"))
		 {
			 element.click();
			 break;
		 }
		 
		 }
		Thread.sleep(3000);*/
		submit.click();
		
	}


 
}
