package resources;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailed implements IRetryAnalyzer
{
	int initial_count=0;
	
	@Override
	public boolean retry(ITestResult result)
	{
		int retry_times=3;
		if(initial_count<retry_times)
		{
			initial_count++;
			return true;
		}
		return false;
	}
}
