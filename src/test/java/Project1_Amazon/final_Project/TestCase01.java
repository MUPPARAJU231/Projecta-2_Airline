package Project1_Amazon.final_Project;

import static org.testng.Assert.assertEquals;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;
import resources.LaunchnQuit;
import resources.Test_Data;

//@Listeners(resources.Listener.class)
public class TestCase01 extends LaunchnQuit
{
	@Test(retryAnalyzer =resources.RetryFailed.class)
	public void register_on_Amazon() throws EncryptedDocumentException, IOException 
	{
		Amazon_Home_Page a1=new Amazon_Home_Page(driver);
		a1.hoverover(driver);
		a1.selectStartHere();
		Amazon_Registraion_Page a3=new Amazon_Registraion_Page(driver);
		//DDT
		Test_Data t=new Test_Data();
		t.data_fetching();
		if(driver.getTitle().equals("Amazon Registration"))
		{
			a3.fullName();
			a3.phoneNumer();
			a3.pwd();
			a3.verifyPhone();
		}
		else
		{
			a3.email();
			a3.conitnue_click();
			a3.proceedToCreateAccount();	
			a3.phoneNumer();
			a3.fullName();
			a3.pwd();
			a3.verifyPhone();
		}
		assertEquals(driver.getTitle(), "Authentication required", "Registration Failed");
	}
}
