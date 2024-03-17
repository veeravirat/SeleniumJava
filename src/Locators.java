import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {

	public static void main(String[] args) {
		  System.setProperty("webdriver.chrome.driver", "C:\\SeleniumClassNotes\\Drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://rahulshettyacademy.com/locatorspractice/");
		  driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		  driver.findElement(By.name("inputPassword")).sendKeys("rahul");
		  driver.findElement(By.className("signInBtn")).click();
		 String value = driver.findElement(By.cssSelector("p.error")).getText();
		 System.out.println(value);
          
	}

}
