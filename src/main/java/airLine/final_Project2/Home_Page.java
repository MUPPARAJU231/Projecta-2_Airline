package airLine.final_Project2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.Test_Data;

public class Home_Page extends Test_Data
{
	@FindBy(xpath = "//div[@id='divSignInPnl']")
    WebElement LoginOrSignUp;
	public void hoveroverOnLoginOrSignUp(WebDriver driver) 
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(LoginOrSignUp).perform();
	}
	@FindBy(xpath = "(//a[@class='_drpdubro log']//span)[2]")
    WebElement customerLogin;
	public void clickOnLogin()
	{
		customerLogin.click();
	}
	@FindBy(id = "txtEmail")
    WebElement emailOrPhNOtBox;
	public void enterEmail()
	{
		emailOrPhNOtBox.sendKeys(email);
	}
	@FindBy(id = "shwotp")
	WebElement continueBTN;
	public void clickContinue()
	{
		continueBTN.click();
	}
	@FindBy(id = "OtpLgnBtn")
	WebElement createAccBTN;
	public void clickCreateAccBTN()
	{
		createAccBTN.click();
	}
	@FindBy(id = "spnLogoutPnl")
	WebElement logDropBox;
	public void hoveroverOnlogDropBox(WebDriver driver) 
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(logDropBox).perform();
	}
	@FindBy(xpath = "(//span[.='Log Out'])[2]")
    WebElement logOutBtn;
	public void clickOnLogOut()
	{
		logOutBtn.click();
	}
	
	public Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
