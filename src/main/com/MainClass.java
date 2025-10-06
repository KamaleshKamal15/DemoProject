package main.com;

import org.testng.annotations.Ignore;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.com.BaseClass;
import pom.com.CartPage;
import pom.com.CheckoutPage;
import pom.com.ContinueClickingPage;
import pom.com.LoginPage;


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
		clickElement(cart.getShoppingCart());
		selectByVisibleText(cart.getCountry(), country);
		passingValue(cart.getZipCode(), zipCode);
		passingValue(cart.getDiscountCode(), disCode);
		passingValue(cart.getGiftCardCode(), giftCode);
		clickElement(cart.getEstimateShipping());
		clickElement(cart.getTermsOfService());
		clickElement(cart.getCheckOut());	
		
	}
    @Ignore
    @Parameters ({"company" , "country1" , "city" , "address1" , "address2" , "zip" , "phnum" , "faxnum"})
    @Test (priority = 5)
    public void checkoutPage(String company ,String country1 , String city , String address1 , String address2 , String zip , String phnum , String faxnum) {
		
    	CheckoutPage check = new CheckoutPage();
    	passingValue(check.getCompany(), company);
    	selectByVisibleText(check.getCountry(), country1);
    	passingValue(check.getCity(), city);
    	passingValue(check.getAddress1(), address1);
    	passingValue(check.getAddress2(), address2);
    	passingValue(check.getZipCode(), zip);
    	passingValue(check.getPhonenum(), phnum);
    	passingValue(check.getFaxnumber(), faxnum);
    	clickElement(check.getClickContinue());
    	
	}
    
    @Test(priority = 6)
    public void orderConfirm() {
    	ContinueClickingPage c1 = new ContinueClickingPage();
    	clickElement(c1.getClickContinue());
    	implicitlyWait(100);
    	clickElement(c1.getClickContinue2());
    	clickElement(c1.getClickShippingMethod());
    	clickElement(c1.getClickContinue3());
    	clickElement(c1.getClickPaymentMethod());
    	clickElement(c1.getClickContinue4());
    	clickElement(c1.getClickContinue5());
    	clickElement(c1.getClickConfirm());
    	
    	

	}
    

}
