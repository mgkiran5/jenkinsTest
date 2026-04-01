package com.kmg.reporting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class AutomationReport implements ITestListener {

	public ExtentSparkReporter spark;
	public ExtentReports extent = new ExtentReports();
	public ExtentTest test;

	public void onStart(ITestContext context)  {
		spark = new ExtentSparkReporter(System.getProperty("user.dir")+"/reports/myReport.html");
		spark.config().setDocumentTitle("Automation Report");
		spark.config().setReportName("Functional Testing");
		spark.config().setTheme(Theme.DARK);
		
		
		extent.attachReporter(spark);
		
		extent.setSystemInfo("ComputerName", "LocalHost");
		extent.setSystemInfo("Environment", "QA");
		extent.setSystemInfo("Tester Name", "Kiran");
		extent.setSystemInfo("OS", "MacOS");
		extent.setSystemInfo("Browser", "Chrome");
	
	}

	public void onTestStart(ITestResult result) {
	    System.out.println("Test started...");
	  }
	
	public void onTestSuccess(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test Case PASSED is: "+result.getName());
	}

	
	public void onTestFailure(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test Case FAILED is: "+result.getName());
		test.log(Status.FAIL, "Test Case FAILED cause is: "+result.getThrowable());
	}

	
	public void onTestSkipped(ITestResult result) {
		test = extent.createTest(result.getName());
		test.log(Status.SKIP, "Test Case SKIPPED is: "+result.getName());
	}
	
	public void onFinish(ITestContext context) {
		extent.flush();
	}
}
