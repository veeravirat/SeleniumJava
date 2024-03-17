package seleniumclass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class LocatorsClass {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Public\\Drivers\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.get("https://rahulshettyacademy.com/locatorspractice/");
		  
		  //driver.findElement(By.id("inputUsername")).sendKeys("veera@gmail.com");
		driver.findElement(By.id("inputUsername")).sendKeys("virat@gmail.com");
		driver.findElement(By.name("inputPassword")).sendKeys("veeravirat@18");
		driver.findElement(By.className("submit")).click();
		Thread.sleep(2000);
		String ErrorMessage = driver.findElement(By.cssSelector("p.error")).getText();
		System.out.println(ErrorMessage);
		//driver.quit();
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("veera");  //absoluteXpath
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("veera@gmail.com");
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("virat@gmail.com");
		driver.findElement(By.xpath("//form/input[@placeholder='Phone Number']")).sendKeys("8328107699");
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String InformationMessage = driver.findElement(By.cssSelector("form p")).getText();
		System.out.println(InformationMessage);
		driver.findElement(By.xpath("//div[contains(@class,'pwd')]/button[1]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.xpath("//button[contains(@class, 'submit')]")).click();
	}

}
