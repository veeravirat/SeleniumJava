package seleniumclass;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		driver.findElement(By.cssSelector("a.blinkingText")).click();
		int TotalWindowsOpened = driver.getWindowHandles().size();
		System.out.println(TotalWindowsOpened);
		
		Set<String> windows = driver.getWindowHandles();
		System.out.println(windows);   //------> How Many opened windows 
		Iterator<String> itr = windows.iterator();   // using iterator
		String ParentWindow = itr.next();
		//String ChildWindow = itr.next();
		System.out.println(ParentWindow);
		//System.out.println(ChildWindow);
		
		while(itr.hasNext()) // -----> using while loop for switch to multiple windows
		{
			String window = itr.next();
			if(window != ParentWindow)
			{
				System.out.println(window);
				driver.switchTo().window(window);
				break;
			}
		}
		//driver.switchTo().window(ChildWindow);       // switch to one window to another window
		String MailID = driver.findElement(By.cssSelector("p.im-para.red")).getText().split("at")[1].trim()
				.split(" ")[0];
		System.out.println(MailID);
		driver.switchTo().window(ParentWindow);
		
		System.out.println(ParentWindow);
		driver.findElement(By.cssSelector("input#username")).sendKeys(MailID);

	}

}
