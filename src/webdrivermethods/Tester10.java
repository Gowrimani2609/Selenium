package webdrivermethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tester10 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://licindia.in/");
		Thread.sleep(5000);
		
		URL mainurl= new URL("https://licindia.in/");
		URL suburl1= new URL("https://licindia.in/Guidelines/Be-an-Agent");
		URL suburl2 = new URL("https://licindia.in/Guidelines/Be-an-Agent-(Individual)");
			
		driver.navigate().to(suburl1);
		Thread.sleep(5000);
		driver.navigate().to(suburl2);

	}

}
