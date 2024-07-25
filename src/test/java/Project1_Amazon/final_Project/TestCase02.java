package Project1_Amazon.final_Project;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import resources.LaunchnQuit;
import resources.Test_Data;
public class TestCase02 extends  LaunchnQuit
{
	@Test(retryAnalyzer = resources.RetryFailed.class)
	public void login_to_amazon() throws Exception, IOException
	{
		Amazon_Home_Page a1=new Amazon_Home_Page(driver);
		a1.hoverover(driver);
		a1.signin_click();
		Amazon_Login_Page a2=new Amazon_Login_Page(driver);
		Test_Data t=new Test_Data();
		t.data_fetching();
		a2.enter_mobile();
		a2.continue_click();
		a2.pwd();
		a2.signin();

		Assert.assertEquals(a1.accNameFetch(), "Hello, VeeR");
	}
}