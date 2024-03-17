package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	Boolean element = driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isDisplayed();
	Assert.assertTrue(element);
	driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).click();
	Assert.assertTrue(driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
	//System.out.println(driver.findElement(By.cssSelector("input[type='checkbox']")).Size());
	}

}
