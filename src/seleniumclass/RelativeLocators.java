package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().window().maximize();
		WebElement element =driver.findElement(By.cssSelector("[name='name']"));
		String text = driver.findElement(with(By.tagName("label")).above(element)).getText();
		System.out.println(text);
		WebElement Checkbox = driver.findElement(By.xpath("//label[text()='Check me out if you Love IceCreams!']"));
		driver.findElement(with(By.tagName("input")).toLeftOf(Checkbox)).click();
		WebElement radioButton =driver.findElement(By.cssSelector("#inlineRadio1"));
		String Name = driver.findElement(with(By.tagName("label")).toRightOf(radioButton)).getText();
		System.out.println(Name);
		WebElement dob = driver.findElement(By.xpath("//label[text()='Date of Birth']"));
		driver.findElement(with(By.tagName("input")).below(dob)).click();
	}

}
