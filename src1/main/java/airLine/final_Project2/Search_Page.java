package airLine.final_Project2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page 
{
	WebDriver driver;
//	From AirPort
	@FindBy(xpath = "//input[@id='FromSector_show']") //div[@id='frmcity']
	WebElement origin;
	public void ClickFrom() 
	{
		origin.click();
	}
	@FindBy(xpath = "//input[@id='a_FromSector_show']")
	WebElement enterOrigin;
	public void enterFrom(String airPort)
	{
		enterOrigin.sendKeys(airPort);
	}
	@FindBy(xpath = "//div[@id='fromautoFill']/ul/li[1]")
	WebElement autosugg_from;
	public void selectFrom()
	{
		autosugg_from.click();
	}
//	To Airport
	@FindBy(xpath = "//input[@id='Editbox13_show']")
	WebElement destination;
	public void clickTo()
	{
		destination.click();
	}
	@FindBy(xpath = "//input[@id='a_Editbox13_show']")
	WebElement enterDestination;
	public void enterTo(String airPort)
	{
		enterDestination.sendKeys(airPort);
	}
	@FindBy(xpath = "//div[@id='toautoFill']/ul/li[1]")
	WebElement autosugg_To;
	public void selectTo()
	{
		autosugg_To.click();
	}
	
	@FindBy(className = "srchBtnSe")
	WebElement srchBTN;
	public void clickSearch()
	{
		srchBTN.click();
	}
	@FindBy(xpath = "//div[@class='fascolm']")
	WebElement sortBy;
	public boolean sortByAssertion()
	{
		return sortBy.isEnabled();
	}
	
	@FindBy(xpath = "//div[@id='divRtnCal']")
	WebElement returnDate;
	public void clickReturnDate()
	{
		returnDate.click();
	}
//	validation
	@FindBy(xpath = "(//div[@class='tr-cn-m ng-scope']//div)[2]")
	WebElement flightDetails;
	public boolean validateFlightDetails()
	{
		return flightDetails.isDisplayed();
	}
	@FindBy(id = "divFareSummary")
	WebElement fareDeatils;
	public boolean validateFareDeatils()
	{
		return fareDeatils.isDisplayed();
	}
	@FindBy(xpath = "//a[contains(@class,'tabHightLight baggTabHiglight')]")
	WebElement baggageRules;
	public boolean validateBaggageRules()
	{
		return baggageRules.isDisplayed();
	}
	@FindBy(xpath = "(//a[.='Check T&Cs '])[1]")
	WebElement cancellationRules;
	public boolean validateCancellationRules()
	{
		return cancellationRules.isDisplayed();
	}
	
	
	public Search_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
