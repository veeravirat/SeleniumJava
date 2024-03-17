
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class WebDriverConcepts {

	public static void main(String[] args) throws InterruptedException {
         
		  // ChromeDriver driver = new ChromeDriver;
		  // WebDrver driver = new WebDriver;
		      
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/locatorspractice/");
		  
		  //driver.findElement(By.id("inputUsername")).sendKeys("veera@gmail.com");
		driver.findElement(By.id("inputUsername")).sendKeys("virat@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("veeravirat@18");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		String value = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(value);
		//driver.quit();
		
	}

}
