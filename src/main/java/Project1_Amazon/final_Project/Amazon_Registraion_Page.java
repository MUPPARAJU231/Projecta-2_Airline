package Project1_Amazon.final_Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import resources.Test_Data;

public class Amazon_Registraion_Page extends Test_Data
{
	@FindBy(name = "email")
    WebElement email_tf;
	public void email()
	{
		email_tf.sendKeys(un_email);
	}
    @FindBy(id = "continue")
    WebElement continue_btn;
    public void conitnue_click()
	{
      continue_btn.click();
	}
    @FindBy(id = "ap_phone_number")
    WebElement mobileNumber;
    public void phoneNumer()
	{
		mobileNumber.sendKeys(mobileNo);
	}
    @FindBy(id = "ap_customer_name")
    WebElement yourName_tf;
    public void fullName()
	{
		yourName_tf.sendKeys(name);
	}
    @FindBy(id = "ap_password")
    WebElement password;
    public void pwd()
	{
		password.sendKeys(pwd);
	}
    @FindBy(id = "continue")
    WebElement verifyMobileNumber;
    public void verifyPhone()
	{
		verifyMobileNumber.click();
	}
    @FindBy(id = "intention-submit-button")
    WebElement proceedToCreate;
    public void proceedToCreateAccount()
	{
    	proceedToCreate.click();
	}
    @FindBy(id = "auth-verify-button")
    WebElement createAccount;
	public void createAcc()
	{
		createAccount.click();
	}
	
	public Amazon_Registraion_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
