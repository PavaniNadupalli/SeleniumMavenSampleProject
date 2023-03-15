package seleniumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchChrome {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		 
	 	driver.manage().window().maximize();
	 	
	 	driver.get("https://www.google.com/");
	 	Thread.sleep(4000);
	 	
	 	driver.close();
	 	
	}

}
