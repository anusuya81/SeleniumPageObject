package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TfTransactionsPage {
WebDriver driver;
	
	public TfTransactionsPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	
	@FindBy(how=How.XPATH,using="//span[text()='Transactions']")
	WebElement Transactions;
	@FindBy(how=How.XPATH,using="//a[text()='New Expense']")
	WebElement NewExpense;

	public void Click_Transacations()
	{
		Transactions.click();
		NewExpense.click();
	}
	
	
}
