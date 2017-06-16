//Link text, Partial link text examples, cssSelector, xpath examples
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementLocator_linkText_Example {
	public static void main(String args[]) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		//linkText syntax
		//driver.findElement(By.linkText("Gmail")).click();
		//Partial link text syntax
		//driver.findElement(By.partialLinkText("Gm")).click();
		//cssSelector syntax
		//driver.findElement(By.cssSelector(".gb_P")).click();
		//xpath syntax
		driver.findElement(By.xpath(".//*[@id='gbw']/div/div/div[1]/div[1]/a")).click();
	}
}