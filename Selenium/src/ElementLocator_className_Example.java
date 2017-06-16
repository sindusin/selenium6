//CLASSNAME AND TAGNAME EXAMPLES
//--------------------------------------
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLocator_className_Example {
	public static void main(String args[]) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		//syntax 1- used when there are multiple operations on same element
		WebElement abc=driver.findElement(By.className("inputtext"));
		abc.sendKeys("123");
		//WebElement ind=driver.findElement(By.tagName("input"));
		//ind.sendKeys("facebook");
		//abc.clear();
	
	}
}
/*????????????????????????????????
 * doubt here while i am trying to send value for normal username 
 * it is taking but when i am trying to send values for registration form username it is not 
 * taking by className why?
 */
//2ND DOUBT
/* all fields have similar tagName as input when i try to execute the program with tagName 
it gave me error that the Element is not currently visible and so may not be interacted with */
// tag name doubt is cleared that it is not suitable for these kind of operations. the tag name locates first element if we want to operate second one it is not suitable so we can do that by xpath or id or name
//what is this tagName used for>???????????????