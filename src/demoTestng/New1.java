package demoTestng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class New1 {
String path = "C:/Users/usern/Desktop/Interview/Selenium/Newfolder/";

		@Test
		public void goo() throws Exception{
			try{
				System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
				WebDriver driver = new FirefoxDriver();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver.get("http://www.google.co.in");
				System.out.println("google url opened");
				driver.manage().window().maximize();
				driver.close();
			} catch (Exception e){
				System.out.println(e.getMessage());
			}
		}

	}