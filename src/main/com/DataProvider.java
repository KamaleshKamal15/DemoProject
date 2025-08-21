package main.com;



import org.testng.annotations.Test;

import base.com.BaseClass;
import pom.com.FbLoginPage;

public class DataProvider extends BaseClass{

	
	@Test (dataProvider = "allDatas")
	public void loginPage(String browser , String pass) {
		launchBrowser("Chrome");
        passingUrl("https://www.facebook.com/");
        FbLoginPage fb = new FbLoginPage();
        
        passingValue(fb.getUsername(), browser);
        passingValue(fb.getPassword(), pass);
	}
	
	
	@org.testng.annotations.DataProvider (name = "allDatas")
	public String [][] multipleDatas() {
		String datas [][] = {{"kamalesh@123" , "kamal"} , 
				             {"murugan@123" , "murugan"} , 
				             {"chithra@123" , "chithra"} , 
				             {"kaviya@1323" , "kaviya"} };
		
		return datas;
	}
	
	
	
}
