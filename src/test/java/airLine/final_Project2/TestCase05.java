package airLine.final_Project2;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import resources.DatePicker;
import resources.LaunchnQuit;
import resources.Test_Data;

public class TestCase05 extends LaunchnQuit
{
	@Test(retryAnalyzer =resources.RetryFailed.class)
	public void roundTrip() throws  Exception
	{
		Search_Page search=new Search_Page(driver);
		Test_Data ddt=new Test_Data();
		ddt.data_fetching();
		search.ClickFrom();
		search.enterFrom("vga");
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOf(search.autosugg_from));
		Thread.sleep(500);
		search.selectFrom();
		search.enterTo("goi");
//		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait2.until(ExpectedConditions.visibilityOf(search.autosugg_To));
		Thread.sleep(500);
		search.selectTo();
		DatePicker.selectDate(driver, "25/aug/2024", "dd/MMM/yyyy");
		search.clickReturnDate();
		DatePicker.selectDate(driver, "10/nov/2024", "dd/MMM/yyyy");
		search.clickSearch();
		
		assertEquals(search.sortByAssertion(), true);
	}
}
