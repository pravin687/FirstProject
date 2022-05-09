package selenium;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class reports {
	ExtentReports ext;

	// ExtentSparkReports and ExtentReports
	@BeforeTest
	public void config() {
		String path = System.getProperty("user.dir")+"//reports//index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		ext = new ExtentReports();
		ext.attachReporter(report);
	
		
	}

	@Test
	public void reportdata() {
		ExtentTest test = ext.createTest("reportdata");
		test.fail("Its failure");

	}

	@Test
	public void reportdata1() {
		ExtentTest test = ext.createTest("reportdata12");
		test.pass("Its successfull");

	}
	@AfterTest
	public void endreport() {
		
		ext.flush();
	}
}
