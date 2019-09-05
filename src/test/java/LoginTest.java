import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	@Test
	public void doLogin(){
		
		driver.get("https://www.amazon.in/");
		
		// Browser is still open
	}
	
	
	
	
}
