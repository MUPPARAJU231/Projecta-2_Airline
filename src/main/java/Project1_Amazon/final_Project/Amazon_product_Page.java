package Project1_Amazon.final_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_product_Page 
{
	WebDriver driver;

	@FindBy(xpath = "(//span[@class='a-price-whole'])[1]")
	WebElement price;
	public String price()
	{
		return price.getText();
	}
	@FindBy(id  = "detailBulletsWrapper_feature_div")
	WebElement productDetails;
	public String description()
	{
		return productDetails.getText();
	}
	@FindBy(id  = "reviewsMedley")
	WebElement customerReviews;
	public String reviews()
	{
		return customerReviews.getText();
	}

	@FindBy(id = "add-to-wishlist-button-submit")
	WebElement wishlist;
	public void wishlisting()
	{
		wishlist.click();
	}
	@FindBy(xpath = "//input[@id='add-to-cart-button']")
	WebElement addtocart;
	public void addingtocart()
	{
		addtocart.click();
	}
	@FindBy(xpath = "//h1[normalize-space()='Added to Cart']")
	WebElement addedToCartCartText;
	public String addedToCartCartAssertion()
	{
		return addedToCartCartText.getText();
	}
	@FindBy(linkText = "View Your List")
	WebElement viewlist;
	public void viewWishList()
	{
		viewlist.click();
	}
	@FindBy(xpath = "(//a[normalize-space(text())='Go to Cart'])[2]")
	WebElement goToCart;
	public void goToCart()
	{
		goToCart.click();
	}
	
	public Amazon_product_Page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
