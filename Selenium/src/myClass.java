import org.openqa.selenium.By; 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.chrome.ChromeDriver; 
import org.openqa.selenium.support.ui.WebDriverWait;
//import java.util.List;
import org.openqa.selenium.firefox.*;
import java.util.concurrent.*;
 
public class myClass {
	public static void main(String[] args) 
    {
         
        //initialize Chrome driver
         //System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");        
         //WebDriver driver = new ChromeDriver(); 
          WebDriver driver=new FirefoxDriver();
         //Open gmail
         driver.get("http://www.gmail.com");
          
         // Enter userd id
         WebElement element = driver.findElement(By.id("identifierId"));
         element.sendKeys("sindusin9@gmail.com");
         WebElement next=driver.findElement(By.id("identifierNext"));
         next.click();
         //wait 5 secs for  userid to be entered
         //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
          
         //Enter Password
         WebElement element1 = driver.findElement(By.name("password"));
         element1.sendKeys("namanasu1234");
          
         //Submit button
         element.submit();
          
          
         //WebElement myDynamicElement = (new WebDriverWait(driver, 15)).until(ExpectedConditions.presenceOfElementLocated(By.id("gbg4")));
         //driver.findElement(By.id("gbg4")).click();
          
         //press signout button
         //driver.findElement(By.id("gb_71")).click();   
          
          
    }
}
