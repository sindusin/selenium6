import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementHandlingExamples3 {
	public static void main(String args[]) {
		WebDriver driver=new FirefoxDriver();
		///-------------HANDLING FRAMES---------------
		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		////method1 in switching frames by index//
		//driver.switchTo().frame(2);
		///method2 in switching frames by frame name
		driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		///------------HANDLING MOUSEOVER EVENTS----------
		driver.navigate().to("https://www.carmax.com/");
		Actions abc=new Actions(driver); //actions is built in class to detect mouse event
		WebElement xyz=driver.findElement(By.linkText("CARS FOR SALE"));
		abc.moveToElement(xyz).build().perform(); //build action is to switch the focus from menu to menu item or main item to sub item
		driver.findElement(By.linkText("Transfers")).click();
		
	}
}
