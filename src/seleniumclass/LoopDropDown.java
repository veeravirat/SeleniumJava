package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoopDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(1000);
		//driver.findElement(By.cssSelector("span#hrefIncAdt")).click(); //---> for one element select
		
		WebElement element = driver.findElement(By.cssSelector("span#hrefIncAdt"));  //---> for mutiple element select using while loop.
		int i = 1;
		while(i<5)
		{
			
			element.click();
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		driver.close();
	}

}
