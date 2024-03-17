package seleniumclass;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWait {

	static int count =0;
	static WebDriverWait wait;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		
		String[] items = {"Brocolli","Cauliflower","Cucumber","Carrot","Tomato","Beans","Potato","Capsicum","Apple","Onion"};
		
		addToCart(driver,items);
	
	}

	public static void addToCart(WebDriver driver, String[]items) {
		
		List<WebElement> products =	driver.findElements(By.cssSelector(".product-name"));
		//System.out.println(products.size());
		List<WebElement> addtoCart = driver.findElements(By.xpath("//div[@class='product'] //button[@type='button']"));
		
		for(int i=0; i<products.size();i++) 
		{
		List Listitems = Arrays.asList(items);
		String ProductName = products.get(i).getText();
	     String FinalProductName =	ProductName.split("-")[0].trim();
	   //System.out.println(FinalProductName);

	   if(Listitems.contains(FinalProductName))
	   {
		   count++;
		   addtoCart.get(i).click();
		   if(count== Listitems.size()) 
		   {
			   break;
		   }
	   }
	  
		}
		driver.findElement(By.cssSelector("a.cart-icon")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promobtn")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated((By.cssSelector("span.promoInfo"))));
		String promoMessage = driver.findElement(By.cssSelector("span.promoInfo")).getText();
		System.out.println(promoMessage);
	}
}
