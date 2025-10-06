package pom.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.com.BaseClass;

public class LoginPage extends BaseClass{
	
	
public LoginPage() {
		
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy (xpath = "//a[text()='Log in']")
	private WebElement login1;
	
	@FindBy (id = "Email")
	private WebElement email;
	
	@FindBy (id = "Password")
	private WebElement password;
	
	@FindBy (xpath = "(//input[@type='submit'])[2]")
	private WebElement login;
	
	
	
	public WebElement getLogin1() {
		return login1;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}
	
	
}
