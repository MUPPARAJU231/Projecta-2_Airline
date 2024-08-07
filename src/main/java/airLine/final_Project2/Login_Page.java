package airLine.final_Project2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.Test_Data;

public class Login_Page extends Test_Data
{
	@FindBy(xpath = "//input[@data-testid='user-mobileno-input-box']")
	WebElement mobileNO;
	public void enterMobileNO()
	{
		mobileNO.sendKeys(mobileNo);
	}
	public void enterInvalidMobileNO()
	{
		mobileNO.sendKeys(invalidMobNo);
	}
	@FindBy(id = "txtEmail")
    WebElement emailOrPhNOtBox;
	public void enterEmail()
	{
		emailOrPhNOtBox.sendKeys(email);
	}
	@FindBy(id = "txtEmail2")
	WebElement password;
	public void enterPWD()
	{
		password.sendKeys(pwd);
	}
	public void enterInvalidPWD()
	{
		password.sendKeys("");
	}
	@FindBy(xpath = "(//div[@class='_btnlog']//input)[2]")
	WebElement loginBTN;
	public void clikLogin()
	{
		loginBTN.click();
	}	
	@FindBy(xpath="//div[@class='logrousrico']") 
	WebElement accountName;
	public void accNameHoverOver(WebDriver driver)
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(accountName).perform();
	}
	@FindBy(xpath = "//span[text()='Manage your profile and password']")
	WebElement manageProfile;
	public boolean manageProfile()
	{
		return manageProfile.isEnabled();
	}
	public Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
