package airLine.final_Project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClassSelection_Page 
{
	@FindBy(id = "myFunction4")
	WebElement travellerNClass;
	public void clickTravellerNClass()
	{
		travellerNClass.click();
	}
	@FindBy(id = "spanBusiness")
	WebElement businessClass;
	public void clickBusinessClass()
	{
		businessClass.click();
	}
	@FindBy(id = "spanFirst")
	WebElement firstClass;
	public void clickFirstClass()
	{
		firstClass.click();
	}
	@FindBy(id = "Book1")
	WebElement bookNow;
	public boolean bookNowAssertion()
	{
		return bookNow.isDisplayed();
	}
	public void selectClass(String enterClass)
	{
		if(enterClass.equalsIgnoreCase("business"))
		{
			clickBusinessClass();
		}
		if(enterClass.equalsIgnoreCase("first class"))
		{
			clickFirstClass();
		}
	}
	@FindBy(xpath =  "(//button[@class='add plus_box1'])[1]")
	WebElement adultPlus;
	public void clickAdultPlus()
	{
		adultPlus.click();
	}
	@FindBy(xpath =  "(//button[@class='add plus_boxChd'])[1]")
	WebElement childPlus;
	public void click_childPlus()
	{
		childPlus.click();
	}
	
	public ClassSelection_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
