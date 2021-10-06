package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester34 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/signup");
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"menu_login_show_link\"]")).click();
		Thread.sleep(5000);
		
		Rectangle usernameRect = driver.findElement(By.id("email")).getRect();
		Rectangle passwordRect = driver.findElement(By.id("pass")).getRect();
		
		int usernameY = usernameRect.getY();
		int passwordY = passwordRect.getY();
		System.out.println("usernameEndY="+ usernameY);
		System.out.println("passwordEndY="+ passwordY );
		
		if(usernameRect.getY()== passwordRect.getY()) {
			System.out.println("Pass:: Top alignment is correct");
		}
		else {
			System.out.println("Fail:: Top alignment is Incorrect");
		}
		Thread.sleep(5000);
		
		driver.quit();				

	}

}
