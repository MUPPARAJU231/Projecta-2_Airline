package airLine.final_Project2;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.LaunchnQuit;
import resources.Test_Data;
public class TestCase02 extends  LaunchnQuit
{
	@Test(retryAnalyzer =resources.RetryFailed.class)
	public void verifyLogin() throws  Exception 
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
		Assert.assertEquals(loginPage.manageProfile(), true);
	}
}