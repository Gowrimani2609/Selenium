package webdrivermethods;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		Point targetPosition=new Point(500,300);
		driver.manage().window().setPosition(targetPosition);

	}

}
