package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginCRM {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","//C:\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://freecrm.com/");
		
		driver.findElement(By.xpath("//a[@class='btn btn-primary btn-xs-2 btn-shadow btn-rect btn-icon btn-icon-left']")).click();
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("talktodil@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Yoga@6969");
        driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
	}

}
