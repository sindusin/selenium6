import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementHandlingExamples4 {
	 public static void main(String args[]) {
		 WebDriver driver=new FirefoxDriver();
		 ///------HANDLING MULTIPLE WINDOWS------///
		 driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		 driver.findElement(By.linkText("Flight Tickets")).click();
		 //driver.close();//it closes only first browser since it is considering 1st as focussed browser
		 
		 ///--------HANDLING DUPLICATE OBJECTS-----///
		 driver.navigate().to("http://www.gcrit.com/build3/admin/login.php");
		 driver.findElement(By.name("username")).sendKeys("admin");
		 driver.findElement(By.name("password")).sendKeys("admin@123");
		 driver.findElement(By.id("tdb1")).click();
		 driver.findElement(By.linkText("Online Catalog")).click();
		 System.out.println(driver.getCurrentUrl());
		 
	 }
}
