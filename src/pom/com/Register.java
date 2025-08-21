package pom.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.com.BaseClass;

public class Register extends BaseClass{
	
	public Register() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (xpath = "//a[text()='Register']")
	private WebElement register;

	@FindBy (id = "gender-male" )
	private WebElement gender;

	@FindBy (id = "FirstName")
    private WebElement firstName;
	
	@FindBy (id = "LastName")
	private WebElement lastName;
	
	@FindBy (name = "Email")
	private WebElement email;
	
	@FindBy (id = "Password")
	private WebElement pass;
	
	@FindBy (id = "ConfirmPassword")
	private WebElement confirmpass;
	
	@FindBy (name = "register-button")
	private WebElement register1;
	
	
	
	public WebElement getGender() {
		return gender;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getConfirmpass() {
		return confirmpass;
	}

	public WebElement getRegister() {
		return register;
	}
	
	
}
