
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverMethodExamples1 {
	public static void main(String args[]) {
		WebDriver driver=new FirefoxDriver();
		//1.get() method example
		driver.get("https://www.google.com/");
		//2.getTitle() method example
		String Title=driver.getTitle();
		System.out.println(Title);
		//3.getPageSource example
		//String Pagesource=driver.getPageSource();
		//System.out.println(Pagesource);
		//4.getCurrentUrl() example
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		//5.navigate.to() example
		driver.navigate().to("https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dwm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		//or the below method
		//driver.findElement(By.linkText("Gmail")).click();
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		//6.navigate() back() example
		driver.navigate().to("https://www.facebook.com");
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		driver.navigate().back();
		URL=driver.getCurrentUrl();
		System.out.println(URL);
		//8.navigate() refresh() example
		driver.navigate().refresh();
		//9.close method example
		driver.close();
		//10.quit method example
		driver.quit();
		
	}
}
