import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLocator_id_example {
	public static void main(String args[]) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//syntax 1- used when there are multiple operations on same element
		WebElement abc=driver.findElement(By.id("identifierId"));
		abc.sendKeys("123");
		abc.clear();
		//syntax 2- used when there is only one operation
		//driver.findElement(By.id("identifierId")).sendKeys("123");
	}
}
