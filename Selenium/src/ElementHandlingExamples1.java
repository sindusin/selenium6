import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementHandlingExamples1 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");        
        WebDriver driver = new ChromeDriver(); 
	/*	WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		
		//general Image example
		WebElement abc=driver.findElement(By.id("hplogo"));
		System.out.println(abc.isDisplayed());
		System.out.println(abc.getAttribute("alt"));
		
		//image button example
		driver.navigate().to("https://dabuttonfactory.com/");
		WebElement xyz=driver.findElement(By.id("butt"));
		System.out.println(xyz.isDisplayed());
		xyz.click();
		
		//image link example
		driver.navigate().to("http://docs.seleniumhq.org/");
		driver.findElement(By.xpath(".//*[@id='choice']/tbody/tr/td[1]/center/a[1]/img")).click();
	*/	
		//dropdownbox examples
		//driver.navigate().to("https://www.melaleuca.com/Account/SignIn");
		//Select dd=driver.findElement(By.id("https://www.melaleuca.com/Account/SignIn"));--in this one it still resturns error since there is no alias
        driver.get("https://www.melaleuca.com/Account/SignIn");
		Select dd=new Select (driver.findElement(By.id("ddlCountries")));
		//dd.selectByValue("en-CA");
		//items count
		List <WebElement> e=dd.getOptions();
		int itemcount= e.size();
		System.out.println(itemcount);
	}
}
