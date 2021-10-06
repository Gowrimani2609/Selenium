import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		Point point=driver.manage().window().getPosition();
		System.out.println("Start x =" + point.getX());
		System.out.println("Start y =" + point.getY());
		

	}

}
