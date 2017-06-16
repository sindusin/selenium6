import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AdminLogin {
public static void main(String[] args)
{
	//System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.com/");
	//driver.close();
}
}
