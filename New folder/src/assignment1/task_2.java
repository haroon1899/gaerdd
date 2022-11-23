package assignment1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task_2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\4383\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.way2automation.com/way2auto_jquery/frames-and-windows.php#load_box");
		String parent=driver.getWindowHandle();
		//Frame one
		driver.switchTo().frame(0);
		driver.findElement(By.cssSelector("body > div > p > a")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		//Frame two
		driver.findElement(By.xpath(".//a[contains(text(),'Open Seprate New Window')]")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath(".//a[contains(text(),'Open New Seprate Window')]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		//Frame three
		driver.findElement(By.xpath(".//a[contains(text(),'Frameset')]")).click();
		driver.switchTo().frame(2);
		driver.findElement(By.xpath(".//a[contains(text(),'Open Frameset Window')]")).click();
		Thread.sleep(2000);
		driver.switchTo().window(parent);
		//Frame four
		driver.findElement(By.xpath(".//a[contains(text(),'Open Multiple Windows')]")).click();
		driver.switchTo().frame(3);
		driver.findElement(By.xpath(".//a[contains(text(),'Open multiple pages')]")).click();
		
		
		

	}

}
