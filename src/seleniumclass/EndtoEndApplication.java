package seleniumclass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndtoEndApplication {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		String country = "India";
		driver.findElement(By.cssSelector("input#autosuggest")).sendKeys("ind");
		Thread.sleep(1000);
	List<WebElement>element = driver.findElements(By.cssSelector("li.ui-menu-item a"));
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
	
	driver.findElement(By.cssSelector("#ctl00_mainContent_ddl_originStation1_CTXT")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@value='VTZ']")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
	driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight")).click();
	driver.findElement(By.id("divpaxinfo")).click();
	Thread.sleep(1000);
	//driver.findElement(By.cssSelector("span#hrefIncAdt")).click(); //----> for single element selection.
	WebElement Element = driver.findElement(By.cssSelector("span#hrefIncAdt"));  //---> for mutiple element select using while loop.
	int i = 1;
	while(i<3)
	{
		
		Element.click();
		i++;
	}
	
	driver.findElement(By.id("btnclosepaxoption")).click();
	
	WebElement Element1 = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	Select dropdown = new Select(Element1);
	dropdown.selectByValue("INR");  //----->dropDown select by value method
    System.out.println(dropdown.getFirstSelectedOption().getText());
    
    
    Boolean element2 = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isDisplayed();
    Assert.assertTrue(element2);
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).click();
	
	Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();
    
	}

}
