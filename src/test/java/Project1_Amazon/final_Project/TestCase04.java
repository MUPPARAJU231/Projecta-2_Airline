package Project1_Amazon.final_Project;
import java.io.IOException;
import org.testng.annotations.Test;
import resources.LaunchnQuit;
import resources.Test_Data;

public class TestCase04 extends  LaunchnQuit 
{
	@Test(retryAnalyzer =resources.RetryFailed.class )
	public void edit_profile() throws  IOException
	{
		Amazon_Home_Page a1=new Amazon_Home_Page(driver);
		a1.hoverover(driver);
		a1.signin_click();
		Amazon_Login_Page a2=new Amazon_Login_Page(driver);
		Test_Data ddt=new Test_Data();
		ddt.data_fetching();
		a2.enter_mobile();
		a2.continue_click();
		a2.pwd();
		a2.signin();
		Amazon_Profile_Page a3=new Amazon_Profile_Page(driver);
		a1.hoverover(driver);
		a3.manageProfile();
		a3.view_profile();
		a3.selectEditName();
		a3.editName();
//		a3.preferreddepartment();
//		a3.heigtNweight();
//		a3.add();
//		a3.select_Men_Or_Women();
//		a3.save();

		//		assertEquals(a.search_tf.getAttribute("value"), "shoe");
	}
}