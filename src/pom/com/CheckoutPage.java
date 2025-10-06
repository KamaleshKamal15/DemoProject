package pom.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.com.BaseClass;

public class CheckoutPage extends BaseClass{

	public CheckoutPage() {
		
		PageFactory.initElements(driver, this);
		
	}


	@FindBy (id = "BillingNewAddress_Company")
	private WebElement company;
	
	@FindBy (id = "BillingNewAddress_CountryId")
	private WebElement country;
	
	@FindBy (id = "BillingNewAddress_City")
	private WebElement city;
	
	@FindBy (id = "BillingNewAddress_Address1")
	private WebElement address1;
	
	@FindBy (id = "BillingNewAddress_Address2")
	private WebElement address2;
	
	@FindBy (id = "BillingNewAddress_ZipPostalCode")
	private WebElement zipCode;
	
	@FindBy (id = "BillingNewAddress_PhoneNumber")
	private WebElement phonenum;
	
	@FindBy (id = "BillingNewAddress_FaxNumber")
	private WebElement faxnumber;

	@FindBy (xpath = "(//input[@type='button'])[2]")
	private WebElement clickContinue;
	
	
	
	

	public WebElement getCompany() {
		return company;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getAddress1() {
		return address1;
	}

	public WebElement getAddress2() {
		return address2;
	}

	public WebElement getZipCode() {
		return zipCode;
	}

	public WebElement getPhonenum() {
		return phonenum;
	}

	public WebElement getFaxnumber() {
		return faxnumber;
	}

	public WebElement getClickContinue() {
		return clickContinue;
	}
	
	
	
}
