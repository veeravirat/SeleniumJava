package seleniumclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RealtimeQuestioninAmazon {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//Item need to be select
		String item = "Tomato";    //need to check with bro.<----------
		//Extract Information from UI Element
		// item name Location
		
       List<WebElement> Products = driver.findElements(By.cssSelector(".product-name"));
       //Add to cart button for the item.
      
       List<WebElement> addtoCart = driver.findElements(By.xpath("//div[@class='product'] //button[@type='button']"));
       //System.out.println(Products.size());
       for(int i=1; i<=Products.size();i++) 
       {
    	   
    	 String ProductName =  Products.get(i).getText();
    	// System.out.println(ProductName);
    	 String FinalProductName = ProductName.split("-")[0].trim();
    	//System.out.println(FinalProductName);

    		 if(ProductName.equalsIgnoreCase(item)) 
    		 {
    			 addtoCart.get(i).click();
    			 break;
    		 }
       }
	}

}
