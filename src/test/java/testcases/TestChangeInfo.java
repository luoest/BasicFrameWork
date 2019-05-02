package testcases;

import java.util.Hashtable;

import org.testng.SkipException;
import org.testng.annotations.Test;

import base.TestBase;
import utilities.TestUtil;

public class TestChangeInfo extends TestBase{

	@Test(dataProviderClass=TestUtil.class, dataProvider="dp")
	public void testChangeInfo(Hashtable<String, String> data) {
		
		if (!TestUtil.isTestRunnable("TestChangeInfo", excel)) {
			throw new SkipException("SKIP --->" + "TestChangeInfo".toUpperCase());
		}
		
		if (!data.get("Runmode").equalsIgnoreCase("Y")) {
			throw new SkipException("SKIPPED !!!");
		}
		
		clear("name_NAME");
		sendKeys("name_NAME", data.get("name"));
		
		clear("qq_NAME");
		sendKeys("qq_NAME", data.get("qq"));
		
		clear("msn_NAME");
		sendKeys("msn_NAME", data.get("msn"));
		
	}
}
