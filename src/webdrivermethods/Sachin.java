package webdrivermethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sachin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver,10);
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("Sachin");
		
		List<WebElement> name = driver.findElements(By.xpath("//li[@data-view-type='1'and not(@id='YMXe')]/following::div[@class='wM6W7d']"));
		
		int count= name.size();
		System.out.println("The Total Number of Count="+ count);
		
		for(WebElement ele:name)
		{
			System.out.println(ele.getText());
		}
		
		driver.quit();

	}

}
