package Project1_Amazon.final_Project;

import static org.testng.Assert.*;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestCase08 //extends LaunchnQuit
{
	RemoteWebDriver driver;
	@Test
	public void searching_bySort() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Amazon_Home_Page a1=new Amazon_Home_Page(driver);
		a1.searching();
		Amazon_SearchResult_Page a2=new Amazon_SearchResult_Page(driver);
		a2.sortby();
		a2.sortby_price();
//		Thread.sleep(2000);
		driver.navigate().refresh();
		a2.sortby();
		a2.sortby_price_customerReview();
//		Thread.sleep(2000);
		driver.navigate().refresh();
		a2.sortby();
		a2.sortby_price_newestArrival();
		
		
	}
}
