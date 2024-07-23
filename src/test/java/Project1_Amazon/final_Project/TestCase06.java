package Project1_Amazon.final_Project;

import static org.testng.Assert.assertNotEquals;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestCase06 //extends LaunchnQuit
{
	RemoteWebDriver driver;
	@Test
	public void searchingWithFilters()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Amazon_Home_Page a1=new Amazon_Home_Page(driver);
		a1.searching();
		Amazon_SearchResult_Page a4=new Amazon_SearchResult_Page(driver);
		a4.category_select();
		
	}

}
