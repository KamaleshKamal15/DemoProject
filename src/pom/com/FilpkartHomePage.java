package pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import base.com.BaseClass;

public class FilpkartHomePage extends BaseClass {

	@Test
	public  void browser() {
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://WWW.filpkart.com");
		
	}
	
}
