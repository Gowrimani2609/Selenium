import org.openqa.selenium.chrome.ChromeDriver;

public class Tester6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://licindia.in/");
		driver.get("https://en.wikipedia.org/");
		driver.navigate().back();		

	}

}