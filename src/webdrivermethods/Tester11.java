package webdrivermethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class Tester11 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().window().fullscreen();
		
		Thread.sleep(5000);
		
		driver.close();

	}

}
