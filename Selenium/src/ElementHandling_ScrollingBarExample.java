import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ElementHandling_ScrollingBarExample {
	public static void main(String args[]) {
		WebDriver driver=new FirefoxDriver();
		Actions dragger = new Actions(driver);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		WebElement draggablePartOfScrollbar = driver.findElement(By.xpath(".//*[@id='gbwa']/div[2]"));
		int numberOfPixelsToDragTheScrollbarDown = 5000;
		dragger.moveToElement(draggablePartOfScrollbar).clickAndHold().moveByOffset(0,numberOfPixelsToDragTheScrollbarDown).release().perform();
	}
}

//not working scroll button also