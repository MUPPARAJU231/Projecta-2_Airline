package airLine.final_Project2;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import resources.DatePicker;
import resources.LaunchnQuit;
import resources.Test_Data;

public class TestCase12 extends  LaunchnQuit 
{
	@Test(retryAnalyzer =resources.RetryFailed.class )
	public void loginSearCHLogout() throws  Exception
	{
		Home_Page homepage=new Home_Page(driver);
		Test_Data ddt=new Test_Data();
		ddt.data_fetching();
		homepage.hoveroverOnLoginOrSignUp(driver);
		homepage.clickOnLogin();
		homepage.enterEmail();
		homepage.clickContinue();
		Login_Page loginPage=new Login_Page(driver);
		loginPage.enterPWD();
		loginPage.clikLogin();
		Thread.sleep(500);
		Search_Page search=new Search_Page(driver);
		search.ClickFrom();
		search.enterFrom("hyd");
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOf(search.autosugg_from));
		Thread.sleep(500);
		search.selectFrom();
		search.enterTo("goa");
//		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait2.until(ExpectedConditions.visibilityOf(search.autosugg_To));
		Thread.sleep(500);
		search.selectTo();
		DatePicker.selectDate(driver, "11/oct/2024", "dd/MMM/yyyy");
		search.clickSearch();
//		Thread.sleep(500);
		homepage.hoveroverOnlogDropBox(driver);
		homepage.clickOnLogOut();
		
		assertEquals(homepage.LoginOrSignUp.isDisplayed(), true);
	}
}