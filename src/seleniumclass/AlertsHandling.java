package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		
	String name = "veera";	
	WebDriver driver =  new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	driver.findElement(By.cssSelector("input#name")).sendKeys(name);
	driver.findElement(By.cssSelector("input#alertbtn")).click();
	System.out.println(driver.switchTo().alert().getText());
	Thread.sleep(1000);
	driver.switchTo().alert().accept();
	driver.findElement(By.cssSelector("input#name")).sendKeys(name);
	driver.findElement(By.cssSelector("#confirmbtn")).click();
	System.out.println(driver.switchTo().alert().getText());
	//driver.switchTo().alert().accept();
	driver.switchTo().alert().dismiss();
	

	}

}
