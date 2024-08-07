package airLine.final_Project2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Cart_Page 
{
	@FindBy(xpath="//select[@id='quantity']")
	WebElement qty_dd;
	public void selectQuantity_dd()
	{
		Select s1=new Select(qty_dd);
		s1.selectByIndex(1);
	}
	@FindBy(css = "[value='Delete']")
	WebElement deleteProduct;
	public void deleteProduct()
	{
		deleteProduct.click();
	}
	@FindBy(name="proceedToRetailCheckout") 
	WebElement proceedToBuy;
	public void proceedToBuy() 
	{
		proceedToBuy.click();
	}
	
	public Cart_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
