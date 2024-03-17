package seleniumclass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class ParentToSibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		System.out.println(driver.findElement(By.xpath("//header/div/button/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button/parent::div/child::button[2]")).getText());
		
	}

}
