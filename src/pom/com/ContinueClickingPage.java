package pom.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.com.BaseClass;

public class ContinueClickingPage extends BaseClass{

	public ContinueClickingPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "(//input[@title=\"Continue\"])[1]")
	private WebElement clickContinue;
	
	@FindBy(xpath = "(//input[@title='Continue'])[2]")
	private WebElement clickContinue2;
	
	@FindBy(name = "shippingoption")
	private WebElement clickShippingMethod;
	
	@FindBy(xpath = "(//input[@value='Continue'])[3]")
	private WebElement clickContinue3;
	
	@FindBy(name = "paymentmethod")
	private WebElement clickPaymentMethod;
	
	@FindBy(xpath = "(//input[@value='Continue'])[4]")
	private WebElement clickContinue4;
	
	@FindBy(xpath = "(//input[@value='Continue'])[5]")
	private WebElement clickContinue5;
	
	@FindBy(xpath = "(//input[@type='button'])[7]")
	private WebElement clickConfirm;

	
	
	
	
	public WebElement getClickContinue() {
		return clickContinue;
	}

	public WebElement getClickContinue2() {
		return clickContinue2;
	}

	public WebElement getClickShippingMethod() {
		return clickShippingMethod;
	}

	public WebElement getClickContinue3() {
		return clickContinue3;
	}

	public WebElement getClickPaymentMethod() {
		return clickPaymentMethod;
	}

	public WebElement getClickContinue4() {
		return clickContinue4;
	}

	public WebElement getClickContinue5() {
		return clickContinue5;
	}

	public WebElement getClickConfirm() {
		return clickConfirm;
	}
	
	
	
}
