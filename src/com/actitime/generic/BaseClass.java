package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import com.actitime.pom.HomePage;
import com.actitime.pom.LoginPage;

public class BaseClass {
	public static WebDriver driver;
static {
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
}
@BeforeClass
	public void openBrowser() {
	Reporter.log("openBrowser",true);
	driver= new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	}
@AfterClass
public void closeBrowser() {
	Reporter.log("closeBrowser",true);
	driver.close();
}
//@BeforeMethod
//public void login() {
//	Reporter.log("Login",true);
//	driver.get("https://demo.actitime.com/");
//	LoginPage l=new LoginPage(driver);
//	l.setLogin("admin","manager");
//}
@BeforeMethod
public void login() throws IOException {
	Reporter.log("Login",true);
	FileLib f= new FileLib();
	driver.get(f.getPropertyData("url"));
	LoginPage l= new LoginPage(driver);
	l.setLogin(f.getPropertyData("username"),f.getPropertyData("password"));
}
@AfterMethod
public void logout() {
	Reporter.log("Logout",true);
	HomePage h= new HomePage(driver);
	h.setLogout();

}
	
}

