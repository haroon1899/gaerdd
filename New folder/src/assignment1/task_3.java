package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_3 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\4383\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://sso.teachable.com/secure/673/identity/login");
		driver.findElement(By.linkText("Sign Up")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("user_name")).sendKeys("Haroon Butt");
		driver.findElement(By.id("user_email")).sendKeys("haroonbutt12161@gmail.com");
		driver.findElement(By.id("password")).sendKeys("qwerty12345@");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.name("commit")).click();

	}

}
