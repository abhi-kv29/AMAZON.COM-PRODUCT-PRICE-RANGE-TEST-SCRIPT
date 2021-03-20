import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class productRating {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		
		ChromeOptions options = new ChromeOptions();

		options.setExperimentalOption("prefs", prefs);

		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL\\Documents\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait w = new WebDriverWait(driver,10);
		
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		System.out.println("Website: " + driver.getTitle());
		
		driver.findElement(By.id("twotabsearchtextbox")).click();
		String searchItem = "laptops";
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(searchItem);	
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,400)");
		
		String minPrice = "20000";
		String maxPrice = "60000";
		
		driver.findElement(By.id("low-price")).click();
		driver.findElement(By.id("low-price")).sendKeys(minPrice);

		driver.findElement(By.id("high-price")).click();
		driver.findElement(By.id("high-price")).sendKeys(maxPrice);
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		int count = driver.findElements(By.cssSelector("a[class='a-link-normal a-text-normal']")).size();
		System.out.println("TOTAL PRODUCTS : " + count);
		
		for (int i=0; i<count;i++)
		{
			System.out.println("PRODUCT NAME: " + driver.findElements(By.cssSelector("a[class='a-link-normal a-text-normal']")).get(i).getText());
			System.out.println("PRICE : " + driver.findElements(By.cssSelector("span[class='a-price-whole']")).get(i).getText());
		}
		
	}
}
