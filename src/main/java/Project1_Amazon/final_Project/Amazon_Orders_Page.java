package Project1_Amazon.final_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Amazon_Orders_Page 
{
	@FindBy(id="nav-orders") 
	WebElement orders;
	public void selectOrdersandReturns()
	{
		orders.click();
	}
	@FindBy(id="time-filter")
	WebElement ordersSortby;
	public void selectOrdersSortbyTime()
	{
		Select s1=new Select(ordersSortby);
		s1.selectByValue("months-3");
	}
	@FindBy(xpath ="(//a[@id='Write-a-product-review_2'])[1]")
	WebElement productReviewButton;
	public void productReview() 
	{
		productReviewButton.click();
	}
	@FindBy(css ="[alt='select to rate item five star.']")
	WebElement fiveStar;
	public void rateFiveStar() 
	{
		fiveStar.click();
	}
	
	public Amazon_Orders_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
