package seleniumclass;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
public class BrokenLinks {

	public static  void main(String[]args) throws MalformedURLException, IOException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("Li[class='gf-li'] a"));
		SoftAssert asserts = new SoftAssert();
		for(WebElement link:links) {
			
			String url = link.getAttribute("href");
			HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();
			connection.setRequestMethod("HEAD");
			connection.connect();
			int responseCode = connection.getResponseCode();
			
			if(responseCode>400) {
				
				System.out.println("the "+link.getText()+"link is broken with statusCode:"+responseCode+
						":"+link.getAttribute("href"));
				//Assert.assertTrue(false);
			}
		}
		asserts.assertAll();
	}
}
