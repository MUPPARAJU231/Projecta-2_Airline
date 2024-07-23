package resources;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener extends LaunchnQuit implements ITestListener
{
	@Override
	public void onTestStart(ITestResult result)  {

	}

	@Override
	public void onTestSuccess(ITestResult result) {
		TakesScreenshot t1= (TakesScreenshot) driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\admin\\OneDrive\\Desktop\\MKT\\Pass\\"+"pass"+Math.random()+".png");
		try 
		{
			FileHandler.copy(source, destination);
		} catch (IOException e)
		{
			e.printStackTrace();
		}	
		Reporter.log("Test case Ppassed");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test case Ffailed");
		System.out.println("Failed");
		TakesScreenshot t1=  (TakesScreenshot) driver;
		File source=t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\admin\\OneDrive\\Desktop\\MKT\\Fail\\"+"fail"+Math.random()+".png");
		try {
			FileHandler.copy(source, destination);
		} catch (IOException e1)
		{
			e1.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {

	}
}
