import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumClass2 {

	@BeforeTest
	public void beforetest(){
		String path = "C:/Users/usern/Desktop/Interview/Selenium/Newfolder/";
		System.out.println("Running before test");
		 System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
	}
	
	 @Test
	 public void testngTest()
	 {
		 System.out.println("Running test");
		 WebDriver driver = new FirefoxDriver();
		 driver.get("http://www.facebook.com");
		 	System.out.println("url opened");
		 	driver.close();
			
	 }
	 
	 @AfterTest
	 public void aftertest(){
		 System.out.println("Running after test");
	 }
}
