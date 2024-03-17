import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
public class WebDriverConcept {

	public static void main(String[] args) {
         
		 //System.setProperty("webdriver.chrome.driver", "C:\\SeleniumClassNotes\\Drivers\\chromedriver.exe");
		  //WebDriverManager.chromedriver().setup();
		  WebDriver driver = WebDriverManager.chromedriver().create();
		 // WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.facebook.com/");
		  driver.quit();
	}

}
