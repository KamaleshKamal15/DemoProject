package base.com;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.opentelemetry.sdk.trace.internal.data.ExceptionEventData;

public class BaseClass {
	
	public static WebDriver driver;
	
	public static void launchBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("Chrome")) {
		    driver = new ChromeDriver();
		
		}
		
		else if(browser.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
		
		else if(browser.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();

		}
		
	}
	
	public static void windowMaximize() {
		
		driver.manage().window().maximize();
		
	}
		
	public static void passingUrl(String Url) {
		
		driver.get(Url);

	}
	
	public static void getpageUrl() {
		
		String getUrl = driver.getCurrentUrl();
		System.out.println(getUrl);

	}
	
	public static void getpageTitle() {
		
		String title = driver.getTitle();
		System.out.println(title);
	}
	
	public static void closingWindow() {
		
		driver.close();
	
	}
	
	public static void terminatingBrowser() {
		
		driver.quit();
	
	}
	
	public static void navigateTo(String Url) {
		
		driver.navigate().to(Url);
	
	}
	
	public static void navigateBack() {
		
		driver.navigate().back();
		
	}
	
	public static void navigateForward() {
		
		driver.navigate().forward();
		
	}
	
	public static void navigateRefresh() {
		
		driver.navigate().refresh();
		
	}
	
	public static void passingValue(WebElement element, String value) {
		
		element.sendKeys(value);

	}
	
	public static void clickElement(WebElement element) {
		
		element.click();

	}
	
	public static void elementTagName(WebElement element) {
		
		String tagName = element.getTagName();
		System.out.println(tagName);
	}
	
	public static void elementAttribute(WebElement element, String attributeName) {
		
		String attribute = element.getAttribute(attributeName);
		System.out.println(attribute);
	}
	
	public static void pageClear(WebElement element) {
		
		element.clear();
	
	}
	
	public static void screenshot(String name) throws IOException {
		
       TakesScreenshot screenshot = (TakesScreenshot) driver;
       File src = screenshot.getScreenshotAs(OutputType.FILE);
       File destanition = new File("C:\\Users\\kammi\\eclipse-workspace\\ProjectClass\\ImageScreenshot\\"+name+".png");
       FileHandler.copy(src, destanition);
	}
	
	public static void threadSleep(int sec) throws InterruptedException {
		
		Thread.sleep(sec);
		
	}
	
	public static void implicitlyWait(int sec) {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
		
	}
	
	public static void explicitlyWiat(int sec, WebElement element) {
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(sec));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	
	public static JavascriptExecutor javaScriptObject() {
		
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		return jss;
	
	}
	
	public static void jsSrollDown() {
		
		javaScriptObject().executeScript("window.scrollBy(0,1000)");
		
	}
	
	public static void jsSrollUp() {
		
		javaScriptObject().executeScript("window.scrollBy(0,-500)");
		
	}
	
	public static void jsElementClicking(WebElement element) {
		
		javaScriptObject().executeScript("arguments[0].click();", element);
		
	}
	
	public static void jsScrollIntoView(WebElement element) {
		
		javaScriptObject().executeScript("arguments[0].scrollIntoView(true);", element);
		
	}
	
	public static void jsScrollPageEnd() {
		
		javaScriptObject().executeScript("window.scrollTo(0,document.body.scrollHeight)");
		
	}
	
	public static void jsScrollPageTop() {
		
		javaScriptObject().executeScript("window.scrollTo(0, 0)");
		
	}
	
	public static Select dropDownObject(WebElement element) {
		
		Select sel = new Select(element);
		return sel;
		
	}
	
	public static void selectByIndex(WebElement element, int index) {
		
		dropDownObject(element).selectByIndex(index);
		
	}
	
	public static void selectByVisibleText(WebElement element, String text) {
		
		dropDownObject(element).selectByVisibleText(text);
		
	}
	
	public static void selectByVaule(WebElement element, String value) {
		
		dropDownObject(element).selectByValue(value);
		
	}
	
	public static void deselectByIndex(WebElement element, int index) {
		
		dropDownObject(element).deselectByIndex(index);
		
	}
	
	public static void deselectByVisibleText(WebElement element, String text) {
		
		dropDownObject(element).deselectByVisibleText(text);
		
	}
	
	public static void deselectByVaule(WebElement element, String value) {
		
		dropDownObject(element).deselectByValue(value);
		
	}
	
	public static void deselectAll(WebElement element) {
		
		dropDownObject(element).deselectAll();
		
	}
	
	public static void getOptions(WebElement element) {
		
		List<WebElement> allOptions = dropDownObject(element).getOptions();
		for(WebElement option : allOptions) {
			System.out.println("AllOption: "+option.getText());
		}
	}
	
	public static void getFirstSelectOptions(WebElement element) {
		
		WebElement firstSelectedOption = dropDownObject(element).getFirstSelectedOption();
		System.out.println("FirstSelectOption: "+firstSelectedOption.getText());
		
	}
	
	public static void getAllSelectOptions(WebElement element) {
		
		List<WebElement> allSelectedOptions = dropDownObject(element).getAllSelectedOptions();
		for(WebElement selectOption : allSelectedOptions) {
			System.out.println("AllSelectedOption: "+selectOption.getText());
		}
	}
	
	public static void isMultipleChecking(WebElement element) {
		
		if(dropDownObject(element).isMultiple()) {
			System.out.println("DropDown is Multiple Selection.");
			
		} else {
			
			System.out.println("DropDown is Single Selection.");
		}
	}
	
	public static Actions actionObjcet() {
		
		Actions action = new Actions(driver);
		return action;	
		
	}
	
	public static void clickingUsingAct(WebElement element) {
		
		actionObjcet().click(element).perform();
		
	}
	
	public static void doubleclickUsingAct(WebElement element) {
		
		actionObjcet().doubleClick(element).perform();
		
	}
	
	public static void moveToElementUseingAct(WebElement element) {
		
		actionObjcet().moveToElement(element).perform();
		
	}
	
	public static void contexClickUsingAct(WebElement element) {
		
		actionObjcet().contextClick(element).perform();
		
	}
	
	public static void clickAndHoldUsingAct(WebElement element) {
		
		actionObjcet().clickAndHold(element).perform();
		
	}
	
	public static void releaseUsingAct(WebElement element) {
		
		actionObjcet().release(element).perform();
		
	}
	
	public static void switchToFrameunsingIndex(int index) {
		
		driver.switchTo().frame(index);
		
	}
	
	public static void switchToFrameUsingIdOrName(String IdOrName) {
		
		driver.switchTo().frame(IdOrName);
		
	}
	
	public static void switchToFrameUsingElement(WebElement element) {
		
		driver.switchTo().frame(element);
		
	}
	
	public static void switchToParentFrame() {
		
		driver.switchTo().parentFrame();
		
	}
	
	public static void switchToDefaultContent() {
		
		driver.switchTo().defaultContent();
		
	}
	
	public static void acceptUsingAlert() {
		
		driver.switchTo().alert().accept();
		
	}
	
	public static void dismissUsingAlert() {
		
		driver.switchTo().alert().dismiss();
		
	}
	
	public static void sendKeysUsingAlert(String value) {
		
		driver.switchTo().alert().sendKeys(value);
		
	}
	
	public static Robot robotObject() throws AWTException {
		
		Robot robot = new Robot();
		return robot;
		
	}
	
	public static void keyPressDownUsingRobot() throws AWTException {
		
		robotObject().keyPress(KeyEvent.VK_DOWN);
		
	}
	
	public static void keyPressUpUsingRobot() throws AWTException {
		
		robotObject().keyPress(KeyEvent.VK_UP);
		
	}
	
	public static void keyPressEnterUsingRobot() throws AWTException {
		
		robotObject().keyPress(KeyEvent.VK_ENTER);
		
	}
	
	public static void getWindowHandles() {
		
		Set<String> windowId = driver.getWindowHandles();
		System.out.println(windowId);
		
	}
	
	public static void switchToWindow() throws InterruptedException {
		
		Set<String> windowId = driver.getWindowHandles();
		for(String id : windowId) {
		
		String title = driver.switchTo().window(id).getTitle();
		System.out.println(title);
		}
		
		
	}
	
	
















}
