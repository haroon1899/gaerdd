package home_task;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class hometask {
	
	WebDriver driver;
	hometaskpom obj;
	
	@Test

	public void main() throws Exception {
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://galaxy.pk/");
		 PropertyConfigurator.configure("log4j.properties");

		obj=new hometaskpom(driver);
		
		
	}
	
	

}