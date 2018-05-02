package demoTestng;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class newtestng {
	String path = "C:/Users/usern/Desktop/Interview/Selenium/Newfolder/";
	@BeforeSuite
	public void beforesuite(){
		System.out.println("I am in Before Suit");
	}
	@BeforeClass
	public void beforeclass(){
		System.out.println("I am in Before Class");
	}
	@BeforeGroups
	public void beforegroups(){
		System.out.println("I am in Before Groups");
	}
	
	@BeforeMethod
	public void beforemethod(){
		System.out.println("I am in Before Method");
	}
	@BeforeTest
	public void beforetest(){
		System.out.println("I am in Before Test");
	}
	
	@Test
  public void facebook() throws Exception {
		try{
			System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("http://www.facebook.com");
			System.out.println("facebook url opened");
			driver.manage().window().maximize();
			
			driver.close();
		} catch (Exception e){
			System.out.println(e.getMessage());
		}
  }
	@Test
	public void newtest() {
		System.out.println("another test");
	}
	
	@AfterSuite
	public void Aftersuite(){
		System.out.println("I am in After Suit");
	}
	@AfterClass
	public void Afterclass(){
		System.out.println("I am in After Class");
	}
	@AfterGroups
	public void Aftergroups(){
		System.out.println("I am in After Groups");
	}
	
	@AfterMethod
	public void Aftermethod(){
		System.out.println("I am in After Method");
	}
	@AfterTest
	public void aftertest(){
		System.out.println("I am in After Test");
	}
}
