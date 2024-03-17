package seleniumclass;

import java.time.Duration;
import java.util.NoSuchElementException;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWaitHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("http://practice.expandtesting.com/dynamic-loading");
		driver.findElement(By.xpath("//a[contains(text(),'Example 1: Element on page that is')]")).click();
		driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(5))
		.pollingEvery(Duration.ofSeconds(1))
		.ignoring(NoSuchElementException.class);
		
		WebElement element = wait.until(new Function<WebDriver, WebElement>()
		{

			@Override
			public WebElement apply(WebDriver driver) {
				WebElement LoadElement = driver.findElement(By.cssSelector("div#finish h4"));
				if (LoadElement.isDisplayed())
				{
					return LoadElement;
				}
				else
				{
					return null;	
				}
			
				
			}
			
		});
		System.out.println(driver.findElement(By.cssSelector("div#finish h4")).getText());
	}

}
