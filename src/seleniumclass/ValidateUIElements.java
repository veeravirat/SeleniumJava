package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidateUIElements {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
	String attributeValue	= driver.findElement(By.cssSelector("#Div1")).getAttribute("style");
	System.out.println(attributeValue);
	
	if(attributeValue.contains("1"))
	{
		
		System.out.println("Element is enable");
		Assert.assertTrue(true);

	}
	else {
		System.out.println("Element is disable");
		Assert.assertTrue(false);
		
	}

	}

}
