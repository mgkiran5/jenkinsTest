package com.kmg.reporting;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class AutomationReport2 implements ITestListener {
	
	public void onStart(ITestContext context) {
	    System.out.println("Test Execution is started...");
	  }
	
	public void onTestStart(ITestResult result) {
	    System.out.println("Test started...");
	  }
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test passed...");
	  }

	  /**
	   * Invoked each time a test fails.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#FAILURE
	   */
	  public  void onTestFailure(ITestResult result) {
		  System.out.println("Test failed...");
	  }

	  /**
	   * Invoked each time a test is skipped.
	   *
	   * @param result <code>ITestResult</code> containing information about the run test
	   * @see ITestResult#SKIP
	   */
	  public void onTestSkipped(ITestResult result) {
		  System.out.println("Test skipped...");
	  }
	  
	  
	  
	  public void onFinish(ITestContext context) {
		  System.out.println("Test Execution is completed...");
		  }
	

}
