package Project1_Amazon.final_Project;
import static org.testng.Assert.*;
import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import resources.LaunchnQuit;
import resources.Test_Data;
public class TestCase03 extends  LaunchnQuit
{
	@Test(retryAnalyzer = resources.RetryFailed.class)
	public void login_to_amazon_usingInvalidCredentials() throws Exception, IOException
	{
		Amazon_Home_Page a1=new Amazon_Home_Page(driver);
		a1.hoverover(driver);
		a1.signin_click();
		Amazon_Login_Page a=new Amazon_Login_Page(driver);
		Test_Data t=new Test_Data();
		t.data_fetching();
		a.invalidun();
		a.continue_click();

		assertEquals(driver.findElement(By.className("a-list-item")).getText(), "We cannot find an account with that mobile number");
	}
}