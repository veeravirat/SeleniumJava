package seleniumclass;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		WebElement element = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(element);
		dropdown.selectByIndex(3);      // -----> dropDown selection method by index
		System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByVisibleText("AED"); //----->dropDown visibleText method 
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    dropdown.selectByValue("INR");  //----->dropDown select by value method
	    System.out.println(dropdown.getFirstSelectedOption().getText());
	    
	    
	    
		
	}

}
