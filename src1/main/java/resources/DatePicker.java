package resources;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DatePicker 
{
	public static void selectDate(WebDriver driver,String targetDate, String dateFormat) throws Exception 
	{
		Calendar calendar = Calendar.getInstance();
		SimpleDateFormat targetDateFormat = new SimpleDateFormat(dateFormat);
		Date formattedTargetDate;
		try 
		{
			targetDateFormat.setLenient(false);
			formattedTargetDate = targetDateFormat.parse(targetDate);
		}
		catch (ParseException e) 
		{
			throw new Exception("Invalid date is provided, please check input date");
		}

		calendar.setTime(formattedTargetDate);

		int targetDay = calendar.get(Calendar.DAY_OF_MONTH);
		int targetMonth = calendar.get(Calendar.MONTH);
		int targetYear = calendar.get(Calendar.YEAR);

		String actualDate = driver.findElement(By.xpath("(//div[@class='month']//div)[2]")).getText(); 
		calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

		int actualMonth = calendar.get(Calendar.MONTH);
		int actualYear = calendar.get(Calendar.YEAR);

		while(targetMonth < actualMonth || targetYear < actualYear)
		{
			driver.findElement(By.xpath("//div[@id='dvprevious']//img")).click();
			actualDate = driver.findElement(By.xpath("(//div[@class='month']//div)[2]")).getText(); 
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

			actualMonth = calendar.get(Calendar.MONTH);
			actualYear = calendar.get(Calendar.YEAR);
		}

		while(targetMonth > actualMonth || targetYear > actualYear)
		{
			driver.findElement(By.xpath("//div[@class='month3']/img")).click();
			actualDate = driver.findElement(By.xpath("(//div[@class='month']//div)[2]")).getText(); 
			calendar.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));

			actualMonth = calendar.get(Calendar.MONTH);
			actualYear = calendar.get(Calendar.YEAR);
		}

		driver.findElement(By.xpath("//div[@class='box']//li[contains(@id,"+targetDay+")]")).click();

	}
}
