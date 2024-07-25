package Project1_Amazon.final_Project;
import org.testng.annotations.Test;
import resources.LaunchnQuit;

public class TestCase06 extends LaunchnQuit
{
	@Test(retryAnalyzer =resources.RetryFailed.class)
	public void searchingWithFilters()
	{
		Amazon_Home_Page a1=new Amazon_Home_Page(driver);
		a1.searching();
		Amazon_SearchResult_Page a4=new Amazon_SearchResult_Page(driver);
		a4.category_select();
		
	}
}
