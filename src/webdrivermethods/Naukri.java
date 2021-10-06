package webdrivermethods;

import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;

public class Naukri {

	public static void main(String[] args) throws IOException {
		LocalDateTime ldt= LocalDateTime.now();
		String timeStamp = ldt.toString().replace(':', '-');
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(16, TimeUnit.SECONDS);
		WebDriverWait wait= new WebDriverWait(driver, 10);
		driver.get("https://my.naukri.com/");
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File tempFile = ts.getScreenshotAs(OutputType.FILE);
		File destFile = new File("./errorshots/naukriWelcomePage"+timeStamp+".png");
		FileUtils.copyFile(tempFile, destFile);
		driver.quit();
		

	}

}
