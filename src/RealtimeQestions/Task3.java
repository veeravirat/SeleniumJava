package RealtimeQestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task3 {

	public static void main(String[] args) throws InterruptedException {
		
		//-------> Calender Date Select Task <--------------
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.path2usa.com/travel-companion/");
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,1500)");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input#form-field-travel_comp_date")).click();
		List<WebElement> days = driver.findElements(By.cssSelector(".dayContainer span"));
		String month = driver.findElement(By.xpath("//span[@class='cur-month']")).getText();
		WebElement nextmonth = driver.findElement(By.cssSelector(".flatpickr-next-month svg"));
		
		String day = "18";
		String SelectMonth = "September";
		
		while(!month.equalsIgnoreCase(SelectMonth)) {
			
			nextmonth.click();
			Thread.sleep(1000);
			
			if(driver.findElement(By.xpath("//span[@class='cur-month']")).getText().equals(SelectMonth))
			{
				
				break;
			}
			
		}
	 
		for(int i=0;i<days.size();i++) {
			
			if(driver.findElements(By.cssSelector(".dayContainer span")).get(i).getText().equals(day)) {
				
				driver.findElements(By.cssSelector(".dayContainer span")).get(i).click();
				break;
			}
		}
	}

}
