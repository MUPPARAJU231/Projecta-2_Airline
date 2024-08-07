package airLine.final_Project2;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import resources.DatePicker;
import resources.LaunchnQuit;
import resources.Test_Data;

public class TestCase06 extends LaunchnQuit
{
	@Test(retryAnalyzer =resources.RetryFailed.class )
	public void economyBussinessFirstClass() throws  Exception
	{
		Search_Page search=new Search_Page(driver);
		Test_Data ddt=new Test_Data();
		ddt.data_fetching();
		search.ClickFrom();
		search.enterFrom("hyd");
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOf(search.autosugg_from));
		Thread.sleep(500);
		search.selectFrom();
		search.enterTo("dxb");
//		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait2.until(ExpectedConditions.visibilityOf(search.autosugg_To));
		search.selectTo();
		Thread.sleep(500);
		DatePicker.selectDate(driver, "20/oct/2024", "dd/MMM/yyyy");
		ClassSelection_Page klas=new ClassSelection_Page(driver);
		klas.clickTravellerNClass();
		klas.selectClass("First class");
		search.clickSearch();
		
		assertEquals(klas.bookNowAssertion(), true);
	}
}
