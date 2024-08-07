package airLine.final_Project2;
import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.Test_Data;

public class Registration_Page extends Test_Data
{
	
    @FindBy(xpath = "//select[@class='form-control form-select ']")
    WebElement title;
    public void selectTtile()
	{
    	Select s1=new Select(title);
    	s1.selectByVisibleText("Mr");
	}
    @FindBy(id = "first_name")
    WebElement first_name;
    public void firstName()
	{
    	first_name.sendKeys("Mupparaju");
	}
    @FindBy(id = "last_name")
    WebElement last_name;
    public void lastName()
	{
    	last_name.sendKeys("Veeranji");
	}
    @FindBy(id = "dobDate")
    WebElement dobDate;
    public void enterDOB()
	{
    	dobDate.sendKeys("24/June/1993" + Keys.ENTER);
	}
    @FindBy(xpath = "//input[@class=' form-control']")
    WebElement mobileNumber;
    public void enterMobNo()
	{
		mobileNumber.sendKeys("9063332478");
	}
    @FindBy(xpath = "//input[@id='email_id']")
    WebElement email_id;
    public void enterEmail()
   	{
    	email_id.click();
    	email_id.sendKeys("mupparaju123@gmail.com");
   	}
  
    public void enterEmail(WebDriver driver) throws InterruptedException
	{
//    	email_id.click();
    	Thread.sleep(2000);
    	WebDriverWait wait=new WebDriverWait(driver , Duration.ofMillis(2000));
    	wait.until(ExpectedConditions.elementToBeClickable(email_id));
    	email_id.sendKeys("mupparaju123@gmail.com");
	}
    
    @FindBy(id = "new-password")
    WebElement pwd;
    public void enterPWD()
	{
    	pwd.sendKeys("AddChinna@1");
	}
    @FindBy(id = "c-password")
    WebElement c_pwd;
    public void confirmPWD()
	{
    	c_pwd.sendKeys("AddChinna@1");
	}
    @FindBy(id = "defaultCheck1")
    WebElement checkbox;
    public void clickOnCheckbox()
	{
    	checkbox.click();
	}
    @FindBy(xpath = "//button[.='Submit']")
    WebElement submitBTN;
	public void clickSubmit()
	{
		submitBTN.click();
	}
	
	public Registration_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
}
