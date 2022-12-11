package lab8;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab8 {
	WebDriver driver;
	lab8pom obj;
	

	public void main() throws Exception {
		
		driver=new ChromeDriver();
		driver.get("https://trello.com/u/haroonhafeez2/boards");

		obj=new lab8pom(driver);
		obj.login();
		
	}

}
