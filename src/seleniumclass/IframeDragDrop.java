package seleniumclass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeDragDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Actions action = new Actions(driver);
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe.demo-frame")));
		WebElement Source = driver.findElement(By.cssSelector("div#draggable"));
		WebElement target = driver.findElement(By.cssSelector("div#droppable"));
		
		action.dragAndDrop(Source, target).build().perform();
		driver.switchTo().defaultContent();
		
	}

}
