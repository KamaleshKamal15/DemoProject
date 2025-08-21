package main.com;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;

import base.com.BaseClass;

public class AssertionTest extends BaseClass{

	
	@Test
	public void hardAssert() {
		launchBrowser("Chrome");
		windowMaximize();
		passingUrl("https://www.facebook.com/");
		String actualTitle = driver.getTitle();
		String expectTitle = "Facebook";

		assertTrue(false);
		
		System.out.println("result pass");
		
	}
}
