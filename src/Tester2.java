import org.openqa.selenium.chrome.ChromeDriver;

public class Tester2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin");
		
		String actualURL = driver.getCurrentUrl();
		String expectedURL = "https://accounts.google.com/signin";
		
		if(actualURL.contains(expectedURL)) {
			System.out.println("PASS:: Login page URL is correct");
			
		}
		else {
			System.out.println("FAIL:: Login page URL is incorrect");
				
		}
			Thread.sleep(5000);
		
			driver.close();	
		
	}

}
