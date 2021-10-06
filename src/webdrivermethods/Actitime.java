package webdrivermethods;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actitime {

	public static void main(String[] args) throws IOException {
		LocalDateTime ldt= LocalDateTime.now();
		String timeStamp = ldt.toString().replace(':','-');
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 15);
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//a[text()='actiTIME Inc.']")).click();
		driver.navigate().to("https://www.actitime.com/");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File tempFile=ts.getScreenshotAs(OutputType.FILE);
		File distFile = new File("./errorshots/actiTIME Inc."+timeStamp+".png");
		FileUtils.copyFile(tempFile, distFile);
		
		driver.quit();
		
		}
	}  