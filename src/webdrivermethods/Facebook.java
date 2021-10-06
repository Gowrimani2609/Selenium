package webdrivermethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/signup");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"menu_login_show_link\"]")).click();
		
		Rectangle usernameRect = driver.findElement(By.id("email")).getRect();
		Rectangle passwordRect = driver.findElement(By.id("pass")).getRect();
		
		int usernameEndX = usernameRect.getX()+ usernameRect.getWidth();
		int passwordEndX = passwordRect.getX()+ passwordRect.getWidth();
		int differ=passwordEndX-usernameEndX ;
		
		System.out.println("usernameEndX=" + usernameEndX);
		System.out.println("passwordEndX=" + passwordEndX);
		
		
		if(usernameEndX!=passwordEndX) 
		{
			System.out.println("Pass:: Textfields are not overlapped");
			
		}
		else 
		{
			System.out.println("Fail :: Textfields are overlapped");
		}
		
		Thread.sleep(3000);
		
		driver.quit();
		
	}

}
