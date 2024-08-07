package airLine.final_Project2;
import static org.testng.Assert.*;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import resources.LaunchnQuit;
import resources.Test_Data;
public class TestCase03 extends  LaunchnQuit
{
	@Test(retryAnalyzer = resources.RetryFailed.class)	
	public void login_usingInvalidCredentials() throws Exception, IOException
	{
		Home_Page homepage=new Home_Page(driver);
		Test_Data ddt=new Test_Data();
		ddt.data_fetching();
		homepage.hoveroverOnLoginOrSignUp(driver);
		homepage.clickOnLogin();
		homepage.enterEmail();
		homepage.clickContinue();
		Login_Page loginPage=new Login_Page(driver);
		loginPage.enterInvalidPWD();
		loginPage.clikLogin();
		assertEquals(driver.findElement(By.id("ValidPass")).getText(), "Please enter correct password.");
	}
}