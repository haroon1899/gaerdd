package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class assinment1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\4383\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.way2automation.com/");
		WebElement Allcourses=driver.findElement(By.id("menu-item-27580"));
		Actions action=new Actions(driver);
		action.moveToElement(Allcourses).perform();
		WebElement Selenium=driver.findElement(By.cssSelector("#menu-item-27582 > a > span.menu-text"));
		action.moveToElement(Selenium).perform();
		WebElement Seleniumwithjava=driver.findElement(By.cssSelector("#menu-item-27583 > a > span.menu-text"));
        Seleniumwithjava.click();
		
	}

}
