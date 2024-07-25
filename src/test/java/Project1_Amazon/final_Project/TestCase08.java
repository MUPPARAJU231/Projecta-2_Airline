package Project1_Amazon.final_Project;
import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import resources.LaunchnQuit;

public class TestCase08 extends LaunchnQuit
{
	@Test(retryAnalyzer =resources.RetryFailed.class)
	public void searching_bySort() throws InterruptedException
	{
		Amazon_Home_Page a1=new Amazon_Home_Page(driver);
		a1.searching();
		Amazon_SearchResult_Page a2=new Amazon_SearchResult_Page(driver);
		a2.sortby();
		a2.sortby_price();
		driver.navigate().refresh();
		a2.sortby();
		a2.sortby_price_customerReview();
		driver.navigate().refresh();
		a2.sortby();
		a2.sortby_price_newestArrival();
		
		assertEquals(a2.newestArrival.isEnabled(), true);
	}
}
