import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class LoginTest {

	public static WebDriver driver;
	
	@BeforeSuite
	public void setUp(){
		
		driver = new FirefoxDriver();
		
	}
	
	@Test
	public void doLogin(){
		
		driver.get("https://www.amazon.in/");
		
		// broswer is still open
	}
	
	
	
	
}
