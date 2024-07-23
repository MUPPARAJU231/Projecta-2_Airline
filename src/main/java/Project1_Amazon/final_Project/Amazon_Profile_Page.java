package Project1_Amazon.final_Project;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Amazon_Profile_Page 
{
	WebDriver driver;
	@FindBy(xpath="//span[.='Manage Profiles']")
	WebElement profile;
	public void manageProfile()
	{
		profile.click();
	}
	@FindBy(xpath="//a[.='View']")
	WebElement view;
	public void view_profile()
	{
		view.click();
	}
	@FindBy(className = "editNameIcon")
	WebElement editNameIcon;
	public void selectEditName()
	{
		editNameIcon.click();
	}
	@FindBy(id = "editProfileNameInputId")
	WebElement editName_tf;
	public void editName()
	{
		editName_tf.sendKeys(Keys.CONTROL+ "A" + Keys.BACK_SPACE);
		editName_tf.sendKeys("veeranji" + Keys.ENTER);
	}


	@FindBy(xpath="//div[.='Preferred department']/parent::button")
	WebElement preferred_department;
	@FindBy(xpath="//button[.='Add']")
	WebElement add;
	@FindBy(xpath="//button[.='Men']")
	WebElement men;
	@FindBy(xpath = "//div[@class='survey-footer']/descendant::span[3]")
	WebElement save;
	public void preferreddepartment()
	{
		preferred_department.click();
		add.click();
		men.click();
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(3));
		boolean invisible= wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@class='a-button-input'] and [@type='submit']")));
		if(invisible) 
		{
			save.click();
		}
	}
	@FindBy(id="radix-2")
	WebElement heightNweight;
	@FindBy(xpath="//button[.='Add']")
	WebElement add2;
	@FindBy(xpath="//button[.='ft']")
	WebElement foot;
	@FindBy(xpath = "(//input[@class='a-button-input'])[2]")
	WebElement save2;
	public void heigtNweight()
	{
		heightNweight.click();
		add2.click();
		foot.click();


		save2.click();
	}


	//	public void hoverover(RemoteWebDriver driver) 
	//	{
	//		Actions ac=new Actions(driver);
	//		ac.moveToElement(accountnList).perform();
	//	}



	//	public void add()
	//	{
	//		add.click();
	//	}
	//	public void select_Men_Or_Women()
	//	{
	//		men.click();
	//	}
	//	public void save()
	//	{
	//		save.click();
	//	}


	public Amazon_Profile_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
