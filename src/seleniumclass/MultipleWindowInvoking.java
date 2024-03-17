package seleniumclass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowInvoking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		driver.switchTo().newWindow(WindowType.TAB);
		Set<String> windows = driver.getWindowHandles();
		Iterator<String>window =windows.iterator();
		String parentwindow = window.next();
		String childwindow = window.next();
		driver.get("https://rahulshettyacademy.com/");
		
		driver.switchTo().window(childwindow);
		String courseName = driver.findElements(By.cssSelector("a[href*='https://courses.rahulshettyacademy.com/p/']")).get(1).getText();
		driver.switchTo().window(parentwindow);
		WebElement element =driver.findElement(By.cssSelector("[name='name']"));
		element.sendKeys(courseName);
	}

}
