package testcases;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.SkipException;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;

public class TestMemberCenter extends TestBase{

	@Test
	public void testMemberCenter() {
		
		if (!TestUtil.isTestRunnable("TestMemberCenter", excel)) {
			throw new SkipException("SKIP ---> " + "TestMemberCenter".toUpperCase());
		}
		
		log.debug("enter testMemberCenter to test");
		Reporter.log("enter testMemberCenter to test");
		Reporter.log("<br>");
		
		driver.findElement(By.linkText("会员中心")).click();
		driver.findElement(By.linkText("修改资料")).click();
		
		log.debug("inside testMemberCenter test is done.");
		Reporter.log("inside testMemberCenter test is done.");
		Reporter.log("<br>");
	}
}
