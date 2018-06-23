package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TecfiosHomePage;
import page.TechfiosContactPage;
import page.TechfiosLoginPage;
import util.BrowserFactory;

public class TechfiosContactTest {
	@Test
	public void AddContactTest() throws IOException, InterruptedException{
			
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
		
		
		TechfiosLoginPage loginPage = PageFactory.initElements(driver,TechfiosLoginPage.class);
				
					
		loginPage.login_demo();
	
	TecfiosHomePage homepage=PageFactory.initElements(driver,TecfiosHomePage.class);
	homepage.clickForContPage();
	
	TechfiosContactPage contactpage=PageFactory.initElements(driver, TechfiosContactPage.class);
	contactpage.send_info();
	
	driver.close();
	driver.quit();
}
}
