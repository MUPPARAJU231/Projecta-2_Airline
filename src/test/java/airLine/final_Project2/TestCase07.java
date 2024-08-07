package airLine.final_Project2;
import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import resources.DatePicker;
import resources.LaunchnQuit;
import resources.Test_Data;

public class TestCase07 extends LaunchnQuit
{
	@Test(retryAnalyzer =resources.RetryFailed.class)
	public void multiCityFlight() throws  Exception
	{
		MultiCitySearch_Page search=new MultiCitySearch_Page(driver);
		Test_Data ddt=new Test_Data();
		ddt.data_fetching();
		search.clickMultiCitySearch();
		search.clickFrom1();
		search.enterFrom1("vga");
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.visibilityOf(search.autosugg_from1));
		Thread.sleep(500);
		search.selectFrom1();
		search.clickTo1();
		search.enterTo1("hyd");
//		WebDriverWait wait2=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait2.until(ExpectedConditions.visibilityOf(search.autosugg_To1));
		Thread.sleep(500);
		search.selectTo1();
		search.clickDepartureDate1();
		DatePicker.selectDate(driver, "25/oct/2024", "dd/MMM/yyyy");
		search.clickFrom2();
		search.enterFrom2("hyd");
//		WebDriverWait wait3=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait3.until(ExpectedConditions.visibilityOf(search.autosugg_from2));
		Thread.sleep(500);
		search.selectFrom2();
		search.clickTo2();
		search.enterTo2("rbd");
//		WebDriverWait wait4=new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait4.until(ExpectedConditions.visibilityOf(search.autosugg_To2));
		Thread.sleep(500);
		search.selectTo2();
		search.clickDepartureDate2();
		DatePicker.selectDate(driver, "26/oct/2024", "dd/MMM/yyyy");
		search.clickSearch();
		
		assertEquals(search.noOfFlightsAssertion(), true);
	}
}
