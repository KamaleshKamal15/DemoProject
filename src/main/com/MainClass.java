package main.com;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.com.BaseClass;
import pom.com.CartPage;
import pom.com.LoginPage;
import pom.com.Register;

public class MainClass extends BaseClass{

	@Parameters ({"browserlan"})
	@Test (priority = 0)
	public  void browserLaunch(String browserlan) {
		launchBrowser(browserlan);
		
	}

   
	@Test (priority = 1)
	public void maximize() {
		
		windowMaximize();
	}
	
    @Parameters ({"Url"})
	@Test (priority = 2)
	public void passUrl(String Url) {
			
		passingUrl(Url);
		
	}

    @Parameters ({"email" , "pass"})
	@Test (priority = 3)
	public void loginPage(String email , String pass) {
		
		LoginPage log = new LoginPage();
		clickElement(log.getLogin1());
		passingValue(log.getEmail(), email);
		passingValue(log.getPassword(), pass);
		clickElement(log.getLogin());
		
	}
	
  
    @Parameters ({"country" , "zipCode" , "disCode" , "giftCode"})
	@Test (priority = 4)
	public void cartPage(String country , String zipCode , String disCode , String giftCode) {
		
		CartPage cart = new CartPage();
		clickElement(cart.getAddCart());
		clickElement(cart.getShoppingCart());
		selectByVisibleText(cart.getCountry(), country);
		passingValue(cart.getZipCode(), zipCode);
		passingValue(cart.getDiscountCode(), disCode);
		passingValue(cart.getGiftCardCode(), giftCode);
		clickElement(cart.getEstimateShipping());
		clickElement(cart.getTermsOfService());
		clickElement(cart.getCheckOut());	
		
	}
    
    

}
