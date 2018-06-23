package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TechfiosLoginPage;
import page.TfPSNewProdPage;
import page.TfProdServPage;
import util.BrowserFactory;

public class TfNewProdTestForPS {
	@Test
	public void NewProductTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
			
	TechfiosLoginPage loginPage = PageFactory.initElements(driver,TechfiosLoginPage.class);
			
	loginPage.login_demo();
	
	TfProdServPage ProdServPage = PageFactory.initElements(driver,TfProdServPage.class);
	
	ProdServPage.clickForNewProd();
	
	TfPSNewProdPage NewProdPage = PageFactory.initElements(driver,TfPSNewProdPage.class);
	
	NewProdPage.sendinfo_NewProduct();
	
	driver.close();
	driver.quit();
	
	
	
}
}