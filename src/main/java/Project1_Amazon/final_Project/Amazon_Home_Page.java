package Project1_Amazon.final_Project;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Home_Page 
{
	@FindBy(xpath="//span[@id='nav-link-accountList-nav-line-1']") 
	WebElement accountnList;
	public String accNameFetch()
	{
		return accountnList.getText();
	}
	public void hoverover(WebDriver driver) 
	{
		Actions ac=new Actions(driver);
		ac.moveToElement(accountnList).perform();
	}
	@FindBy(xpath = "//a[contains(@class,'nav-a') and text()='Start here.']")
	WebElement startHere;
	public void selectStartHere()
	{
		startHere.click();
	}
	@FindBy(xpath = "(//span[.='Sign in'])[1]")
	WebElement signin;
	public void signin_click()
	{
		signin.click();
	}
	@FindBy(id="twotabsearchtextbox")
	WebElement search_tf;
	public void searching()
	{
		search_tf.sendKeys("shoe"+ Keys.ENTER);
	}
	
	public Amazon_Home_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
