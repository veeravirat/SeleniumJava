package RealtimeQestions;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

import javax.swing.JScrollBar;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class Task4 {

	public static void main(String[] args) throws InterruptedException {
		
		//----------> RahulShetty Academy - E commerce client task<------------------
		
		WebDriver driver = new ChromeDriver();
		WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(5));  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://rahulshettyacademy.com/client");
		driver.manage().window().maximize();
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	 
		driver.findElement(By.id("userEmail")).sendKeys("Veeravirat.18@gmail.com");
		driver.findElement(By.id("userPassword")).sendKeys("Veera@123");
		driver.findElement(By.xpath("//input[@class='btn btn-block login-btn']")).click();
		
		List<WebElement> AddCart = driver.findElements(By.xpath("//button[@class='btn w-10 rounded']"));
	
		for(int i=0;i<AddCart.size();i++) {
			
			
			AddCart.get(i).click();
			
			System.out.println(driver.findElements(By.cssSelector("h5[style='text-transform: uppercase;']")).get(i).getText() + " : Item added into cart");
			Thread.sleep(2000);
		}
		driver.findElement(By.xpath("//button[@routerlink='/dashboard/cart']")).click();
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,700)");
		System.out.println("Total ammount :"+ driver.findElement(By.xpath("//span[@class='value']")).getText());
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li/button[@type='button']")).click();
		
       
        
        WebElement CardName = driver.findElement(By.xpath("//div[contains(text(),'Name on Card ')]"));
        driver.findElement(with(By.tagName("input")).toRightOf(CardName)).sendKeys("2293");
        
        WebElement text= driver.findElement(By.xpath("//div[contains(text(),'CVV Code ')]"));
		driver.findElement(with(By.tagName("input")).below(text)).sendKeys("Veeravirat");
		Thread.sleep(3000);

		//driver.findElement(By.className("input txt ng-valid ng-touched ng-dirty")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//input[@name='coupon']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		Thread.sleep(4000);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("p[class='mt-1 ng-star-inserted']")));
		String coupon = driver.findElement(By.cssSelector("p[class='mt-1 ng-star-inserted']")).getText();
		System.out.println(coupon);
		
		String country = "India";
		
//		List<WebElement> CountryNames =driver.findElements(By.xpath("//input[@placeholder='Select Country']"));
//		List<WebElement> FinalName = CountryNames.stream().filter(CountryName->CountryNames.size()>5).collect(Collectors.toList());
//		System.out.println(FinalName);
		driver.findElement(By.xpath("//input[@placeholder='Select Country']")).sendKeys(country);
		List<WebElement> countryloctors = driver.findElements(By.xpath("//button[@type='button']"));
		
		for(int i=0;i<countryloctors.size();i++) {
			
			String CountryName = countryloctors.get(i).getText();
			
			if(CountryName.equalsIgnoreCase(country)) {
				
				countryloctors.get(i).click();
			}
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Place Order ')]")).click();
		String FinalOrder= driver.findElement(By.xpath("//h1[contains(text(),' Thankyou for the order')]")).getText();
		System.out.println(FinalOrder);
		
	}

}
