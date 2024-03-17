package seleniumclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthenticationPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		          //http://username:password@abc.com
		driver.manage().window().maximize();
		String massage = driver.findElement(By.cssSelector("p")).getText();
		System.out.println(massage);
	}

}
