package main.com;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.com.BaseClass;

public class AssertionTest extends BaseClass{

	
	@Test
	public void hardAssert() {
		launchBrowser("Chrome");
		windowMaximize();
		passingUrl("https://www.facebook.com/");
		String actualTitle = driver.getTitle();
		String expectTitle = "Facebook";

		assertEquals(actualTitle, expectTitle);
		assertTrue(false);
		
		System.out.println("result pass");
		
	}
	
	@Test
	private void softAssert() {
		launchBrowser("Chrome");
		windowMaximize();
		passingUrl("https://www.facebook.com/");
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		
		String expetedTitle = "Facebook – log in or sign up";
		
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle, expetedTitle);
	
		System.out.println("result pass");
		soft.assertAll();
	}
}
