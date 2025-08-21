package pom.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.com.BaseClass;

public class CartPage extends BaseClass{

	public CartPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy (xpath = "(//input[@value='Add to cart'])[2]")
	private WebElement addCart;
	
	
	@FindBy (xpath = "//span[text()='Shopping cart']")
	private WebElement shoppingCart;
	
	
	@FindBy (id = "CountryId")
	private WebElement Country;
	
	
	@FindBy (id = "ZipPostalCode")
	private WebElement zipCode;
	
	
	@FindBy (name = "discountcouponcode")
	private WebElement discountCode;
	
	
	@FindBy (name = "giftcardcouponcode")
	private WebElement giftCardCode;
	
	
	@FindBy (name = "estimateshipping")
	private WebElement estimateShipping;
	
	
	@FindBy (id = "termsofservice")
	private WebElement termsOfService;
	
	
	@FindBy (id = "checkout")
	private WebElement checkOut;

	
	

	public WebElement getAddCart() {
		return addCart;
	}


	public WebElement getShoppingCart() {
		return shoppingCart;
	}


	public WebElement getCountry() {
		return Country;
	}


	public WebElement getZipCode() {
		return zipCode;
	}


	public WebElement getDiscountCode() {
		return discountCode;
	}


	public WebElement getGiftCardCode() {
		return giftCardCode;
	}


	public WebElement getEstimateShipping() {
		return estimateShipping;
	}


	public WebElement getTermsOfService() {
		return termsOfService;
	}


	public WebElement getCheckOut() {
		return checkOut;
	}
	
	
}
