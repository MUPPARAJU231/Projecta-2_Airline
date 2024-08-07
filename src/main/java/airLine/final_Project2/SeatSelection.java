package airLine.final_Project2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import resources.Test_Data;

public class SeatSelection extends Test_Data
{
	@FindBy(xpath = "(//div[contains(@class,'col-md-2 col-sm-2')]//button)[1]")
    WebElement bookNowBTN;
	public void clickBookNow() 
	{
		bookNowBTN.click();
	}
	@FindBy(xpath = "(//span[@class='checkmark-radio'])[3]")
    WebElement insuranceRadioBTN;
	public void selectInsurance()
	{
		insuranceRadioBTN.click();
	}
	@FindBy(id = "txtEmailId")
    WebElement contactInfo;
	public void enterContactEmail()
	{
		contactInfo.sendKeys(email);
	}
	@FindBy(id = "spnVerifyEmail")
	WebElement verifyEmail;
	public void clickVerifyEmail()
	{
		verifyEmail.click();
	}
	@FindBy(id = "titleAdult0")
	WebElement title;
	public void titleSelection()
	{
		Select s=new Select(title);
		s.selectByVisibleText("MR");
	}
	@FindBy(id = "txtFNAdult0")
	WebElement firstName1;
	public void enterFN()
	{
		firstName1.sendKeys(firstName);
	}
	@FindBy(id = "txtLNAdult0")
	WebElement lastName1;
	public void enterLN()
	{
		lastName1.sendKeys(lastName);
	}
	@FindBy(id = "txtCPhone")
	WebElement contactPH;
	public void enterPh()
	{
		contactPH.sendKeys(mobileNo);
	}
	@FindBy(id = "spnTransaction")
	WebElement continueBtn;
	public void clickContinueBtn()
	{
		continueBtn.click();
	}
	@FindBy(xpath = "(//div[@class='coupn_inr']//div[@class='coupn_col ng-scope'])[2]")
    WebElement selectcouponCode;
	public void selectcouponCodeRadio() 
	{
		selectcouponCode.click();
	}
	@FindBy(xpath = "//ol[@class='cabin fuselage']/li[@class='row--1']//label[@for='1A']")
    WebElement seatAinRow1;
	public void selectSeat()
	{
		seatAinRow1.click();
	}
	
	public SeatSelection(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
