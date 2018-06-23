package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.TecfiosHomePage;
import page.TechfiosLoginPage;
import util.BrowserFactory;

public class TfDashboardTest {
	@Test
	public void DashboardTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
			
	TechfiosLoginPage loginPage = PageFactory.initElements(driver,TechfiosLoginPage.class);
			
				
	loginPage.login_demo();
	
	TecfiosHomePage DashboardPage = PageFactory.initElements(driver,TecfiosHomePage.class);
	
	DashboardPage.ValidateUser();
	DashboardPage.ValidateSearch();
	DashboardPage.ValidateIncExpGraph1();
	DashboardPage.ValidateNetWorth();
	DashboardPage.ValidateIncExpGraph();
	DashboardPage.ValidateIncExpButton();
	DashboardPage.ValidateLatestIncome();
	DashboardPage.ValidateLatestExpense();
	
	driver.close();
	driver.quit();
	}
}
