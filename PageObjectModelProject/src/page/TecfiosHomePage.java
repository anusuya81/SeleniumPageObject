package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TecfiosHomePage {
WebDriver driver;
	
	public TecfiosHomePage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.XPATH,using="//text()[contains(.,'CRM')]/ancestor::a[1]")
	WebElement CRM;
	@FindBy(how=How.XPATH,using="//a[text()='Add Contact']")
	WebElement AddContact;
	
	
	
	
	@FindBy(how=How.XPATH,using="//span[text()='Welcome TechFios Tester']")
	WebElement Welcome;
	
	@FindBy(how=How.XPATH,using="//input[@type='text'][@placeholder='Search Customers...']")
	WebElement Search;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Income Today')]")
	WebElement Income;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Expense Today')]")
	WebElement Expense;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Income This Month')]")
	WebElement IncomeMonth;
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Expense This Month')]")
	WebElement ExpenseMonth;
	
	@FindBy(how=How.XPATH,using="//*[@class=' c3-event-rect c3-event-rect-7']")
	WebElement InAndExGra;
	
	@FindBy(how=How.XPATH,using="//*[@class=' c3-shape c3-shape c3-arc c3-arc-Income']	")
	WebElement InExpGraph;
	
	@FindBy(how=How.XPATH,using="//h5[text()='Net Worth & Account Balances']")
	WebElement Networth;
	@FindBy(how=How.XPATH,using="//text()[contains(.,'Latest Income')]/ancestor::div[1]")
	WebElement LatestIncome;
	@FindBy(how=How.XPATH,using="//text()[contains(.,'Latest Expense')]/ancestor::div[1]")
	WebElement LatestExpense;
	
     public void clickForContPage(){
		
		CRM.click();
		AddContact.click();
		
		
	}
     public void ValidateUser(){
			
		 if(Welcome.isDisplayed())
		 {
		    System.out.println("login works and home page open");
		 }
	
					
		}
     public void ValidateSearch(){
			
		 if(Search.isDisplayed())
		 {
		    System.out.println("Search button shows");
		 }
	
					
		}
    
     public void ValidateIncExpButton(){
			
		 if(Income.isDisplayed() && Expense.isDisplayed() && IncomeMonth.isDisplayed() && ExpenseMonth.isDisplayed())
		 {
		    System.out.println("Shows Income and Expense button");
		 }
	
					
		}
     public void ValidateIncExpGraph1(){
			
		 if(InAndExGra.isDisplayed())
		 {
		    System.out.println("Income Vs Expense Graph1 Shows");
		 }
	
					
		}
     public void ValidateNetWorth(){
			
		 if(Networth.isDisplayed())
		 {
		    System.out.println("Networth Table Shows");
		 }
	
					
		}
     
     
     
     
     public void ValidateIncExpGraph(){
			
		 if(InExpGraph.isDisplayed())
		 {
		    System.out.println("Income Vs Expense Graph Shows");
		 }
	
					
		}
     
     public void ValidateLatestIncome(){
			
		 if(LatestIncome.isDisplayed())
		 {
		    System.out.println(" Latest Income Table Shows");
		 }
	
					
		}
     
     public void ValidateLatestExpense(){
			
		 if(LatestExpense.isDisplayed())
		 {
		    System.out.println(" Latest Expense Table Shows");
		 }
	
					
		}



}
