package RealtimeQestions;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		String[] items = { "Brocolli", "Cauliflower", "Cucumber", "Carrot", "Tomato", "Beans", "Potato", "Capsicum",
				"Apple", "Onion" };
		int count = 0;

		List<WebElement> products = driver.findElements(By.cssSelector(".product-name"));
		// System.out.println(products.size());
		List<WebElement> addtoCart = driver.findElements(By.xpath("//div[@class='product'] //button[@type='button']"));

		for (int i = 0; i < products.size(); i++) {
			List Listitems = Arrays.asList(items);
			String ProductName = products.get(i).getText();
			String FinalProductName = ProductName.split("-")[0].trim();
			// System.out.println(FinalProductName);

			if (Listitems.contains(FinalProductName)) {
				count++;
				addtoCart.get(i).click();
				if (count == Listitems.size()) {
					break;
				}
			}
		}

	}

}
