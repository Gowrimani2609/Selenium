import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPanel {

	public static void main(String[] args) throws IOException {
		String timeStamp = LocalDateTime.now().toString().replace(':', '-');
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 15);
		driver.get("https://www.facebook.com/");
		
		WebElement ele=driver.findElement(By.tagName("form"));
		File tempFile = ele.getScreenshotAs(OutputType.FILE);
		File destFile = new File ("./screenshots/fbLoginpanel"+timeStamp+".png");
		FileUtils.copyFile(tempFile, destFile);
		driver.quit();

	}

}
