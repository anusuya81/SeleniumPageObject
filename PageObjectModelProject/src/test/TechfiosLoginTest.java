package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.LoginPage;
import page.TechfiosLoginPage;
import util.BrowserFactory;

public class TechfiosLoginTest {
	@Test
	public void loginTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
			
	TechfiosLoginPage loginPage = PageFactory.initElements(driver,TechfiosLoginPage.class);
			
				
	loginPage.login_demo();

	driver.close();

	driver.quit();
}
}