import org.openqa.selenium.chrome.ChromeDriver;

public class Tester8 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new Chromedriver();
		
		driver.get("https://licindia.in/");
		
		Thread.sleep(5000);
		
		driver.navigate().to("https://licindia.in/Guidelines/Be-an-Agent-(Individual)");

	}

}
