package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TechfiosLoginPage;
import page.TfTransNewExpPage;
import page.TfTransactionsPage;
import util.BrowserFactory;

public class TfTransNewExpTest {
	@Test
	public void NewExpenseTest() throws IOException, InterruptedException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
			
	TechfiosLoginPage loginPage = PageFactory.initElements(driver,TechfiosLoginPage.class);
			
	loginPage.login_demo();
	
	TfTransactionsPage TransPage=PageFactory.initElements(driver,TfTransactionsPage.class);
	TransPage.Click_Transacations();
	
	TfTransNewExpPage newExpPage=PageFactory.initElements(driver,TfTransNewExpPage.class);
	newExpPage.AddingNewExpInfo();
	
	Thread.sleep(3000);
	driver.close();
	driver.quit();
}
}