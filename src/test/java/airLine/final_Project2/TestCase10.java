package airLine.final_Project2;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import resources.DatePicker;
import resources.LaunchnQuit;
import resources.Test_Data;

public class TestCase10 extends  LaunchnQuit 
{
	@Test(retryAnalyzer =resources.RetryFailed.class )
	public void validations() throws  Exception
	{
		Search_Page search=new Search_Page(driver);
		Test_Data ddt=new Test_Data();
		ddt.data_fetching();
		search.ClickFrom();
		search.enterFrom("hyd");
		Thread.sleep(500);
		search.selectFrom();
		search.enterTo("goa");
		Thread.sleep(500);
		search.selectTo();
		DatePicker.selectDate(driver, "25/oct/2024", "dd/MMM/yyyy");
		search.clickSearch();
		SeatSelection seat=new SeatSelection(driver);
		seat.clickBookNow();

		assertEquals(search.validateFlightDetails(), true);
		assertEquals(search.validateFareDeatils(), true);
		assertEquals(search.validateBaggageRules(), true);
		assertEquals(search.validateCancellationRules(), true);
	}
}