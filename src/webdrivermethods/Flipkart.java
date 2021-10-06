package webdrivermethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Flipkart {

	public static void main(String[] args) 
		{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(13,TimeUnit.SECONDS);
		
		WebDriverWait wait= new WebDriverWait(driver, 13);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("iphone");
		List<WebElement> alliphoneList = driver.findElements(By.xpath("//div[@class='lrtEPN _17d0yO']"));
		WebElement lastElement = driver.findElement(By.xpath("(//div[@class='lrtEPN _17d0yO'])[last()]"));
		
		
		for(WebElement ele:alliphoneList)
		
		System.out.println(ele.getText());
		lastElement.click();
		driver.quit();
		}

}
