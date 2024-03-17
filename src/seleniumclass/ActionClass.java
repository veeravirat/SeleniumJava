package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//a[@data-csa-c-slot-id= 'nav-link-accountList']")))
		.build().perform();
		
		action.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox")))
		.keyDown(Keys.SHIFT).click().sendKeys("Sumsung").build().perform();
		
		action.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).doubleClick()
		.build().perform();
		
		action.moveToElement(driver.findElement(By.cssSelector("input#twotabsearchtextbox"))).contextClick()
		.build().perform();
		
		
		
	}

}
