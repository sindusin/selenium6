import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethodExamples2 {
	public static void main(String args[]) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.gmail.com");
		//11.findelement method example
		//driver.findElement(By.id("identifierNext")).click();
		//12.sendKeys method example
		WebElement abc=driver.findElement(By.id("identifierId"));
		abc.sendKeys("sind");
		abc.click();
		//16. isDisplayed example
		driver.findElement(By.id("identifierNext")).click();
		boolean a =driver.findElement(By.id("identifierNext")).isDisplayed();
		System.out.println(a);
		//17.isSlected example
		driver.navigate().to("https://www.facebook.com");
		boolean b=driver.findElement(By.id("u_0_g")).isSelected();
		System.out.println(b);//returns false
		driver.findElement(By.id("u_0_g")).click();
		b=driver.findElement(By.xpath(".//*[@id='u_0_g']")).isSelected();
		System.out.println(b);
		//maximise
		driver.manage().window().maximize();
		
	}
}
