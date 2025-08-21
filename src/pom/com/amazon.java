package pom.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class amazon {

	@Test
	public  void browserAmazon() {
		WebDriver driver = new ChromeDriver();
		 
		 driver.get("https://WWW.amazon.com");
	}
}
