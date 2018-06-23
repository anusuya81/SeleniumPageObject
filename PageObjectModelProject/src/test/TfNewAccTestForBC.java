package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TechfiosLoginPage;
import page.TfBCNewAccPage;
import page.TfBank_CashPage;
import util.BrowserFactory;

public class TfNewAccTestForBC {
	@Test
	public void NewAccountTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
			
	TechfiosLoginPage loginPage = PageFactory.initElements(driver,TechfiosLoginPage.class);
			
	loginPage.login_demo();
	
	TfBank_CashPage BCPage = PageFactory.initElements(driver,TfBank_CashPage.class);
	
	BCPage.clickForNewAcc();
	
	TfBCNewAccPage NewPage = PageFactory.initElements(driver,TfBCNewAccPage.class);
	
	NewPage.sendinfo_NewAcc();
	
	driver.close();
	driver.quit();
	
	
	
	
}
}
