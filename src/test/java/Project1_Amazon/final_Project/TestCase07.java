package Project1_Amazon.final_Project;

import static org.testng.Assert.*;
import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class TestCase07 //extends LaunchnQuit
{
	RemoteWebDriver driver;
	@Test
	public void productDetsils()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		Amazon_Home_Page a1=new Amazon_Home_Page(driver);
		a1.searching();
		Amazon_SearchResult_Page a2=new Amazon_SearchResult_Page(driver);
		a2.selcting_1st_product();
		
		Set<String> s1=driver.getWindowHandles();
		Iterator<String> p_cid= s1.iterator();
		String p_id=p_cid.next();
		String c_id=p_cid.next();
		driver.switchTo().window(c_id);
		Amazon_product_Page a3=new Amazon_product_Page(driver);
		
		String actual= a3.price();
		System.out.println(actual);
		assertNotEquals(actual, "0");
		String productDetails=a3.description();
		System.out.println(productDetails);
		assertEquals(productDetails.contentEquals(productDetails), true);
		assertNotEquals(a3.reviews(), null);
		
	}
}
