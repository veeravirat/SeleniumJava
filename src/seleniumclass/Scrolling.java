package seleniumclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
		
		//List<WebElement> values = driver.findElements(By.xpath("//table[@class='table-display']"));
		List<WebElement> Prices = driver.findElements(By.cssSelector(".table-display td:nth-child(3)"));
		int TotalSum = 0;
		

		for(int i=0; i<Prices.size();i++) 
		{
			TotalSum = TotalSum+ Integer.parseInt(Prices.get(i).getText());
		}
		System.out.println(TotalSum);
	}

}
