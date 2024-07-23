package Project1_Amazon.final_Project;

import static org.testng.Assert.*;
import java.time.Duration;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(amazon_Scenarios.Listener.class)
public class TestCase14 //extends  LaunchnQuit//Listener
{
	RemoteWebDriver driver;
	@Test
	public void rating()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		Amazon_Home_Page a1=new Amazon_Home_Page(driver);
		a1.hoverover(driver);
		a1.signin_click();
		Amazon_Login_Page a2=new Amazon_Login_Page(driver);
		a2.enter_mobile();
		a2.continue_click();
		a2.pwd();
		a2.signin();
		Amazon_Orders_Page a3=new Amazon_Orders_Page(driver);
		a3.selectOrdersandRturns();
		a3.selectOrdersSortbyTime();
		a3.productReview();
		a3.rateFiveStar();
		
		//		assertEquals(a.search_tf.getAttribute("value"), "shoe");
	}
}