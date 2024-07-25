package resources;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listener extends LaunchnQuit implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test case Ppassed");
		captureScreenShot(result.getMethod().getMethodName()+"_Pass.jpg");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test case Ffailed");
		captureScreenShot(result.getName()+"_Fail.jpeg");
	}
}