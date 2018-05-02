import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumClass {
public static String path = "C:/Users/usern/Desktop/Interview/Selenium/Newfolder/";
	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", path+"geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver", path+"chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		System.out.println("url opened");
		driver.manage().window().maximize();
		
		driver.close();

	}

}
