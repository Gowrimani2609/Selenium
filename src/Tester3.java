import org.openqa.selenium.chrome.ChromeDriver;

public class Tester3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.actitime.com/");
		String actualPageSource=driver.getPageSource();
		System.out.println(actualPageSource);
		
		String expectedText= "Please Identify Yourself";
		if(actualPageSource.contains(expectedText))
		{
			System.out.println("Pass : Text is Present");
		}
		
		else
		{
			System.out.println("Fail : Text is not present");
		}
		
		Thread.sleep(5000);
		
		driver.close();
		

	}

}
