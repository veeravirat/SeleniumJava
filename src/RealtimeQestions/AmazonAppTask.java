package RealtimeQestions;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.*;


public class AmazonAppTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver wd = new ChromeDriver();
		wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
		
		wd.get("https://www.amazon.in/");
		wd.findElement(By.xpath("//div[@id='nav-xshop'] //a[contains(text(),'Best Sellers')]")).click();
		wd.findElement(By.xpath("//a[contains(text(),'Hot New Releases')]")).click();
		
		for(int i=0; i<3;i++) {
			List<WebElement> productsloc = wd.findElements(By.xpath("//div[@class='p13n-sc-truncate-desktop-type2  p13n-sc-truncated']"));

			productsloc.get(i).click();
            wd.findElement(By.xpath("//input[@title='Add to Shopping Cart']")).click();
			wd.navigate().back();
			wd.navigate().back();
		}
		wd.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
	    int productssize = wd.findElements(By.xpath("//div[@class='a-section a-spacing-mini']")).size();
	    System.out.println(productssize);
	    int[] arr = new int[productssize];
	    for(int i=0; i<productssize;i++) {
	    List<WebElement> prices = wd.findElements(By.xpath("//div[@class='a-section a-spacing-mini']"));
	    int productvalue = Integer.parseInt(prices.get(i).getText().trim().replace(".", " ").split(" ")[0]);
	    System.out.println(productvalue);
	    arr[i]=productvalue;
	    }
	     int temp;    
	     for(int i=0;i<arr.length-1;i++)
	     {
	    	 if(arr[i]>arr[i+1])
	    	 {
	    		 temp=arr[i];
	    		 arr[i]=arr[i+1];
	    		 arr[i+1] = temp;
	    	 }
	     }
	     
	     System.out.println("max value is : " + arr[arr.length-1]);
	
		
	}

	}


