package Project1_Amazon.final_Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.Test_Data;

public class Amazon_Login_Page extends Test_Data
{
	@FindBy(name="email")
	WebElement signin_box;
	public void enter_mobile()
	{
		signin_box.sendKeys(mobileNo);
	}
	@FindBy(id="continue")
	WebElement continue_btn;
	@FindBy(id="createAccountSubmit")
	WebElement create_acc;
	@FindBy(id="ap_password")
	WebElement password;
	@FindBy(id="signInSubmit")
	WebElement signin_btn;
	public void enter_email()
	{
		signin_box.sendKeys(un_email);
	}
	
	public void invalidun()
	{
		signin_box.sendKeys(invalidMobNo);
	}
	public void continue_click()
	{
		continue_btn.click();
	}
	public void createAcc()
	{
		create_acc.click();
	}
	public void pwd()
	{
		password.sendKeys(pwd);
	}
	public void signin()
	{
		signin_btn.click();
	}

	public Amazon_Login_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
