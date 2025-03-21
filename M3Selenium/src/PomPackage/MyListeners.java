package PomPackage;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.google.common.io.Files;

public class MyListeners extends BaseTest implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log("_ _ Test Start_ _" + result.getName(), true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("_ _ Test Success_ _" + result.getName(), true);
	}

	@Override
	public void onTestFailure(ITestResult result) {
		String failureMethod = result.getName();
		String ldt = LocalDateTime.now().toString();
		String time = ldt.replaceAll(":", "-");
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File des = new File("./errorshots/"+ failureMethod +time +".png");
		try {
			Files.copy(src,des);

		} catch (IOException e) {

			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("_ _ Test Skipped_ _" + result.getName(), true);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		Reporter.log("_ _ Test Failed Within Success Percentage_ _" + result.getName(), true);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		Reporter.log("_ _ Test Failed With Timeout_ _" + result.getName(), true);
	}

	@Override
	public void onStart(ITestContext result) {
		Reporter.log("_ _ Test Start_ _" + result.getName(), true);
	}

	@Override
	public void onFinish(ITestContext result) {
		Reporter.log("_ _ Test Finish_ _" + result.getName(), true);
	}
	

}
