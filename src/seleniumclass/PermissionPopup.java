package seleniumclass;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;

import org.openqa.selenium.*;

public class PermissionPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options  = new ChromeOptions();   //ChromeOptions class
		HashMap<String,Integer> contentSettings = new HashMap<String,Integer>();
		HashMap<String,Object> profile = new HashMap<String,Object>();
		HashMap<String,Object> prefs = new HashMap<String,Object>();
		//contentSettings.put("notification", 0);
		contentSettings.put("deolocation", 0);
		profile.put("managed_default_content_settings", contentSettings);
		prefs.put("profile",profile );
		options.setExperimentalOption("prefs", prefs);
		
		//options.addArguments("disable-notifications");   //-----> disable notification method
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
//		driver.get("http://web-push-book.gauntface.com/demos/notification-examples/");
//		driver.findElement(By.cssSelector(".c-toggle.js-example-toggle")).click();
		
		driver.get("http://whatmylocation.com");
		
		
		
		
	}

}
