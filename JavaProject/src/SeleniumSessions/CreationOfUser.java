package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CreationOfUser {

	public static void main(String[] args){

		System.setProperty("webdriver.chrome.driver","//C:\\Selenium\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://sarasdemo.excelindia.com/CPv29xC/CL6/Login.aspx?enc=xcHdK4tEoaZOxKZ7rbYAuKd5ovrLIxj7FtTLF7xY2r7ONHP1/+O9NE0Ii/olxw6m");
		
		
		
		//action.moveToElement(driver.findElement(By.id("ddllanguage"))).doubleClick();
		
		//driver.findElement(By.)
		
		
		driver.findElement(By.xpath("//input[@name='txtName']")).sendKeys("Shankar");
		driver.findElement(By.xpath("//input[@name='txtPwd']")).sendKeys("Excel123");
		driver.findElement(By.xpath("//input[@name='SignIn']")).click();
		
		driver.findElement(By.xpath("//i[@id='ctl00_header_ButtonClick']")).click();
		
		Actions action = new Actions(driver);
		
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Administrative Section']"))).build().perform();
		action.moveToElement(driver.findElement(By.xpath("//a[@title='Manage User']"))).build().perform();
		driver.findElement(By.xpath("//a[@title='Manage User']")).click();
		
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
		
		driver.findElement(By.id("ctl00_CPH_lnkbtnCreateUser")).click();
		driver.findElement(By.id("ctl00_CPH_AddUser1_txtFirstName")).sendKeys("Manojj");
		
		Select select = new Select(driver.findElement(By.id("ctl00_CPH_AddUser1_ddlgender")));
		select.selectByVisibleText("Male");
		
		
		driver.findElement(By.id("ctl00_CPH_AddUser1_txtEmail")).sendKeys("Manojj@excel.com");
		
		Select select1 = new Select(driver.findElement(By.id("ctl00_CPH_AddUser1_lblManager")));
		select1.selectByVisibleText("Adishesha");

		
		driver.findElement(By.id("ctl00_CPH_AddUser1_txtUserName")).sendKeys("Manojj");
		driver.findElement(By.id("ctl00_CPH_AddUser1_txtPassword")).sendKeys("Excel123");
		driver.findElement(By.id("ctl00_CPH_AddUser1_txtConfirmPwd")).sendKeys("Excel123");
		
		
		
		//action.moveToElement(driver.findElement(By.xpath("//a[@title='Manage User']"))).click();
		
				
		
		//driver.close();
		
				
		
	}

}
