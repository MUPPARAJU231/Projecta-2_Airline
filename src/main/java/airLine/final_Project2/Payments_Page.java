package airLine.final_Project2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Payments_Page 
{
	@FindBy(id = "CC")
	WebElement cardNumber;
	public void enterCardNumber()
	{
		cardNumber.sendKeys("5103720438441477");
	}
	@FindBy(id = "CCN")
	WebElement nicName;
	public void enterName()
	{
		nicName.clear();
		nicName.sendKeys("veer's SBI DEBIT");
	}
	@FindBy(id = "CCMM")
	WebElement selectExpiryMonth;
	public void expiryMonth() 
	{
		Select selectDate = new Select(selectExpiryMonth);
		selectDate.selectByValue("11");
	}
	@FindBy(id = "CCYYYY")
	WebElement selectExpiryYear;
	public void expiryYear() 
	{
		Select selectYear = new Select(selectExpiryYear);
		selectYear.selectByValue("2035");
	}
	@FindBy(id = "CCCVV")
	WebElement cvvNumber;
	public void enterCvvNumber() 
	{
		cvvNumber.sendKeys("143");
	}
	@FindBy(xpath = "(//div[@class='mk-pym'])[1]")
	WebElement makePayment;
	public void makePaymentBtn() 
	{
		makePayment.click();
	}		

	public Payments_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
