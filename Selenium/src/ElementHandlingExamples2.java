import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementHandlingExamples2 {
	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe"); 
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/sql/sql_select.asp");
		//getting cell value example
		WebElement htmltable=driver.findElement(By.xpath(".//*[@id='main']/div[5]"));
		String s=driver.findElement(By.xpath(".//*[@id='main']/div[5]/table/tbody/tr[2]/td[2]")).getText();
		System.out.println(s);
		
		//handling row count of a table
		List <WebElement> rows=htmltable.findElements(By.tagName("tr"));
		int r=rows.size();
		System.out.println(r);
		
		//handling columns count of a table
		List <WebElement> cells=htmltable.findElements(By.tagName("td"));
		System.out.println(cells.size());
				
		//Handling the inline Elements
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
		//driver.findElement(By.xpath(".//*[@id='gbwa']/div[2]/a[1]")).click();
		/*not working below method for scroll down
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("scroll(0, 250);");
		*/
		driver.findElement(By.xpath(".//*[@id='gb300']/span[1]")).click();
		driver.navigate().back();
		driver.close();
		
		
	}
}
