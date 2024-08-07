package airLine.final_Project2;

import static org.testng.Assert.assertEquals;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import resources.LaunchnQuit;
import resources.Test_Data;

public class TestCase01  extends LaunchnQuit
{
	@Test (retryAnalyzer =resources.RetryFailed.class)
	public void registration() throws Exception 
	{
		Home_Page homepage = new Home_Page(driver);
		Test_Data ddt = new Test_Data();
		ddt.data_fetching();
		homepage.hoveroverOnLoginOrSignUp(driver);
		homepage.clickOnLogin();
		homepage.enterEmail();
		homepage.clickContinue();
		

//		Set<String> s1=driver.getWindowHandles();
//		Iterator<String> p_cid=s1.iterator(); 
//		String p_id=p_cid.next(); 
//		String c_id=p_cid.next();
//		driver.switchTo().window(c_id);
//
//		Registration_Page
//		registration=new Registration_Page(driver);
//		registration.selectTtile();
//		registration.firstName(); 
//		registration.lastName(); 
//		registration.enterDOB();
//		registration.enterMobNo(); 
//		Thread.sleep(500);
//		registration.enterEmail();
//		registration.enterPWD();
//		registration.confirmPWD();
//		registration.clickOnCheckbox();
//		registration.clickSubmit();

//		assertEquals(driver.getTitle(), "Authentication required", "Registration Failed");
	}
}