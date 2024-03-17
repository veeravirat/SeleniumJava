package seleniumclass;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
public class WindowbrowserActivities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.navigate().back();
		driver.navigate().forward();
	}

}
