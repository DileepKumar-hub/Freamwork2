package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowHandling {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "//C:\\Selenium\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		driver.get("http://www.google.com");
		
        driver.switchTo().newWindow(windowType, TAB);		
		Set<String> handles = driver.getWindowHandles();
		
		List<String> ls = new ArrayList<String>(handles);
		String parentWindowId = ls.get(0);
		String childWindowId = ls.get(1);
		
		System.out.println(parentWindowId);
		System.out.println(childWindowId);
		
		System.out.println("after switching title is:" + driver.getTitle());
		
		driver.get("https://www.facebook.com/");
		System.out.println("after swithcing title is:" + driver.getTitle());
		
		driver.close();
		driver.switchTo().window(parentWindowId);
		
		System.out.println("parent widow title is:" + driver.getTitle());
		
		
		
		

	}

}
