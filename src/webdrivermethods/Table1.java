ackage Handlingtablesdivisions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Table1 {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	WebDriver d = new ChromeDriver();
	d.manage().window().maximize();
	d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(d,5);
	d.get("E:\\EDUCATION\\Selenium\\Table.html");
		
	WebElement table = d.findElement(By.id("Books"));
	
	System.out.println("======data======");
	List<WebElement> dl = table.findElements(By.tagName("td"));
	int count = 0;
	int num = 0;
	for(WebElement e:dl) {
	try {
	num = Integer.parseInt(e.getText());
	System.out.println(num);
	} catch(NumberFormatException ex) {}
}
	
	if(num%2==0) {
	count+=num;
	System.out.println(count);
	}
	System.out.println("===============");
	System.out.println("Total value caluculated in table =" + num);
	System.out.println("Total value calculated to verify the table Total = " +  count);
	System.out.println("===============");
	
	if(num == count)
	System.out.println("PASS :: TOTAL IS CORRECT");
	else
	System.out.println("FAIL :: TOTAL IS INCORRECT");
	d.quit();
	}
}