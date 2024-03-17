package seleniumclass;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		String country = "India";
		driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("ind");
		Thread.sleep(1000);
	List<WebElement>element = driver.findElements(By.cssSelector("li.ui-menu-item a"));
		//System.out.println(element.size());
	for(int i=0;i<element.size();i++) 
	{
		String elementText = element.get(i).getText();
		//System.out.println(elementText);
		if(elementText.equalsIgnoreCase(country)) 
		{
			element.get(i).click();
			break;
		}
	}
		

	}

}
