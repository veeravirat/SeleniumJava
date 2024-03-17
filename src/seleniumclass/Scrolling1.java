package seleniumclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Scrolling1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		Thread.sleep(2000);
        js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
        List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
        int ActualSum =0;
        for(int i=0;i<values.size();i++) 
        {
        	ActualSum = ActualSum+Integer.parseInt(values.get(i).getText());
        	System.out.println(values.get(i).getText());
        }
        
      //  int ExpectedSum= Integer.parseInt(driver.findElement(By.cssSelector(".totalAmount"))
      //  Assert.assertEquals(ActualSum, ExpectedSum);
	}

}
