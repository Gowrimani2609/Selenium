import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester7 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://licindia.in/");
		Thread.sleep(5000);
		driver.get("https://en.wikipedia.org/");
		Thread.sleep(5000);
		
		Navigation navigation= driver.navigate();
		navigation.back();
		Thread.sleep(5000);
		navigation.forward();
		Thread.sleep(5000);
		navigation.refresh();

	}

}
