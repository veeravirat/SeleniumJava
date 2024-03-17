package RealtimeQestions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task2 {
	
	//--------> Amazon task<---------
	
	static WebDriverWait wait;
	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox")))
		.keyDown(Keys.SHIFT).click().sendKeys("realme").build().perform();
		
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		List<WebElement> items = driver.findElements(By.xpath("//div[@id='search']"));
		System.out.println(items);
		//action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'P55 5G')]"))).click().build().perform();
		//driver.findElement(By.xpath("//span[contains(text(),'narzo 60X 5G（Nebula Purple 6GB,128GB Storage ） Up to 2TB External Memory | 50 MP AI Primary Camera | Segments only 33W Supervooc Charge')]")).click();
	
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'narzo 60X 5G（Nebula Purple 6GB,128GB Storage ')]")))
		.click().build().perform();
		
		

	}

}
