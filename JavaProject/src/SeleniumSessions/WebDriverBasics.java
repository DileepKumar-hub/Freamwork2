package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverBasics {

	public static void main(String[] args) {
		
      System.setProperty("webdriver.chrome.driver","//C:\\Selenium\\chromedriver_win32\\chromedriver.exe");
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.manage().deleteAllCookies();
	  driver.get("http://www.google.com");
	  String title = driver.getTitle();
	  System.out.println(title);
	  
	  if(title.equals("Google")){
		  System.out.println("Correct title");
	  }
	  else{
		  System.out.println("Incorrect title");
		  
	  }
	  
	  System.out.println(driver.getCurrentUrl());
	  
	  driver.quit();
		
	}

}
