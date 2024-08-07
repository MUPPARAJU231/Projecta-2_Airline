package airLine.final_Project2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MultiCitySearch_Page 
{
//	From Airport1
	@FindBy(xpath = "//div[@class='onewaycolm']//li[@id='mcity']")
	WebElement multicity;
	public void clickMultiCitySearch()
	{
		multicity.click();
	}
	@FindBy(id="FromSector-mul1_show") 
	WebElement from1;
	public void clickFrom1()
	{
		from1.click();
	}
	@FindBy(xpath = "//input[@id='a_FromSector-mul1_show']")
	WebElement enterOrigin1;
	public void enterFrom1(String airPort)
	{
		enterOrigin1.sendKeys(airPort);
	}
	@FindBy(xpath = "//div[@id='FromMulti1']/ul/li[1]")
	WebElement autosugg_from1;
	public void selectFrom1()
	{
		autosugg_from1.click();
	}
//	To Airport1
	@FindBy(xpath = "//input[@id='ToSector-mul1_show']")
	WebElement destination1;
	public void clickTo1()
	{
		destination1.click();
	}
	@FindBy(xpath = "//input[@id='a_ToSector-mul1_show']")
	WebElement enterDestination1;
	public void enterTo1(String airPort)
	{
		enterDestination1.sendKeys(airPort);
	}
	@FindBy(xpath = "//div[@id='ToMulti1']/ul/li[1]")
	WebElement autosugg_To1;
	public void selectTo1()
	{
		autosugg_To1.click();
	}
	@FindBy(xpath = "//input[@id='ddateMul1']")
	WebElement departureDate1;
	public void clickDepartureDate1()
	{
		departureDate1.click();
	}
	
//	From Airport2
	@FindBy(id="FromSector-mul2_show") 
	WebElement from2;
	public void clickFrom2()
	{
		from2.click();
	}
	@FindBy(xpath = "//input[@id='a_FromSector-mul2_show']")
	WebElement enterOrigin2;
	public void enterFrom2(String airPort)
	{
		enterOrigin2.sendKeys(airPort);
	}
	@FindBy(xpath = "//div[@id='FromMulti2']/ul/li[1]")
	WebElement autosugg_from2;
	public void selectFrom2()
	{
		autosugg_from2.click();
	}
//	To Airport2
	@FindBy(xpath = "//input[@id='ToSector-mul2_show']")
	WebElement destination2;
	public void clickTo2()
	{
		destination2.click();
	}
	@FindBy(xpath = "//input[@id='a_ToSector-mul2_show']")
	WebElement enterDestination2;
	public void enterTo2(String airPort)
	{
		enterDestination2.sendKeys(airPort);
	}
	@FindBy(xpath = "//div[@id='ToMulti2']/ul/li[1]")
	WebElement autosugg_To2;
	public void selectTo2()
	{
		autosugg_To2.click();
	}
	@FindBy(xpath = "//input[@id='ddateMul2']")
	WebElement departureDate2;
	public void clickDepartureDate2()
	{
		departureDate2.click();
	}

	@FindBy(xpath = "//div[@id='addmul2']/input")
	WebElement srchBTN;
	public void clickSearch()
	{
		srchBTN.click();
	}
	@FindBy(xpath = "//div[@class='mn-title ng-binding']")
	WebElement noOfFlightsFound;
	public boolean noOfFlightsAssertion()
	{
		return noOfFlightsFound.isEnabled();
	}
		
	public MultiCitySearch_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
