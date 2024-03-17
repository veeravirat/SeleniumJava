package seleniumclass;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//---------> selenium version 4 (New features)<-------------
		
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
		
		//-------->//Getting Element ScreenShot<--------------
		
		File src = element.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("elementScreenshot.png"));
		
		//-------->//Getting Dimentions<-----------------
		
		System.out.println(element.getRect().getDimension().getHeight()); 
		System.out.println(element.getRect().getDimension().getWidth()); 
		
		
		
	}

}
