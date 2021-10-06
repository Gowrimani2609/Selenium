package webdrivermethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tester13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		
		Dimension dim= driver.manage().window().getSize();
		System.out.println("width=" + dim.getWidth());
		System.out.println("height=" + dim.getHeight());
		

	}

}
