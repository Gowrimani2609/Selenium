import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tester9 {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https://licindia.in");
		URL urlref= new URL("https://licindia.in/Guidelines/Be-an-Agent-(Individual)");
		driver.navigate().to(urlref);
	
	}

}
