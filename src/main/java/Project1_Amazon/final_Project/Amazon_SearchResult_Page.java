package Project1_Amazon.final_Project;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_SearchResult_Page 
{
	 WebDriver driver;
	 @FindBy(xpath = "//span[.=\"Women's Running Shoes\"]")
	 WebElement category;
	 public void category_select()
	 	{
	 		category.click();
	 	}
	 @FindBy(xpath = "//input[@aria-valuetext='₹54,300+']")
	 WebElement maxprice;
	 @FindBy(xpath = "//input[@aria-valuetext='₹14,900']")
	 WebElement pricedesired;
	 public void selectingPriceRange()
	 	{
		 Actions a1=new Actions(driver);
		 a1.dragAndDrop(maxprice, pricedesired);
	 	}
	 
	 
     @FindBy(xpath="(//div[@class='a-section aok-relative s-image-tall-aspect'])[1]")
	 WebElement shoe1;
     public void selcting_1st_product()
     {
    	 shoe1.click();
     }
     @FindBy(className="a-dropdown-label")
	 WebElement sort;
     public void sortby()
     {
    	 sort.click();
     }
     @FindBy(xpath="(//div[@class='a-popover-wrapper']/div/ul/li)[2]")
	 WebElement lowToHigh;
     public void sortby_price()
     {
    	 lowToHigh.click();
     }
     @FindBy(xpath="(//div[@class='a-popover-wrapper']/div/ul/li)[4]")
	 WebElement customerReview;
     public void sortby_price_customerReview()
     {
    	 customerReview.click();
     }
     @FindBy(xpath="(//div[@class='a-popover-wrapper']/div/ul/li)[5]")
	 WebElement newestArrival;
     public void sortby_price_newestArrival()
     {
    	 newestArrival.click();
     }
   
     
   public Amazon_SearchResult_Page(WebDriver driver)
   {
	   PageFactory.initElements(driver, this);
   }
}
