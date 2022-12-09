package lab3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class lab3 {
WebDriver driver;
lab3pom obj=new lab3pom();

	
	@BeforeMethod
	public void Step0() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omayo.blogspot.com/");
	}
	
	@Test()
public void Step1() throws InterruptedException {
	
	
		
		obj.fieldone.sendKeys("Haroon Butt");
		obj.description.sendKeys("hii there.. I'm Haroon");
		Assert.assertNotNull(obj.fieldone);
}
	
	@Test()
	
	public void Step2() throws InterruptedException {
		

	
		obj.fetchtable();
		obj.UsernameOne.sendKeys("Haroon BUTT");
		obj.PasswordOne.sendKeys("@@@@***###");
		Thread.sleep(2000);
		obj.loginOne.click();
		
		
	}
	
	@Test
	public void Step3() throws InterruptedException {
		
		obj.scroll(driver);
		String currentwindow=obj.currentWindow(driver);
		
		driver.switchTo().frame(obj.frameOne);
		driver.switchTo().window(currentwindow);
		driver.switchTo().frame(obj.frameTwo);
		driver.switchTo().window(currentwindow);
		
		obj.UsernameTwo.sendKeys("Haroon Butt ");
		obj.PasswordTwo.sendKeys("12345678");
		obj.loginTwo.click();
		Thread.sleep(4000);
		obj.alert(driver);
		
}
	
	@Test
	
public void Step4() throws InterruptedException {
		
		
		String currentwindow=driver.getWindowHandle();
		obj.Hyundaix.click();
		Thread.sleep(2000);
		obj.doc3();
		obj.clear();
		obj.button.click();
		Thread.sleep(1000);
		obj.submit.click();
		Thread.sleep(1000);
		obj.login.click();
		Thread.sleep(1000);
		obj.register.click();
		Thread.sleep(1000);
		obj.alerttwo.click();
		Thread.sleep(1000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		obj.popup.click();
		java.util.Set<String> handles=driver.getWindowHandles();
		for(String handle:handles) {
			if(!handle.equals(currentwindow)) {
				driver.switchTo().window(handle);
				String popedtext=driver.findElement(By.xpath("//body")).getText();
				System.out.println(popedtext);
				driver.close();
			}
			
		}
		driver.switchTo().window(currentwindow);
		obj.tryit.click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		 
		Thread.sleep(2000);
		action.doubleClick(obj.doubleclick).perform();
		Thread.sleep(2000);
		Alert newalert=driver.switchTo().alert();
		newalert.accept();
		obj.checkthis.click();
		Thread.sleep(15000);
		obj.dte.click();
		
	}
	@Test
	
public void Step5() throws InterruptedException {
		
		obj.radio.click();
		obj.alert1.click();
		Thread.sleep(2000);
		Alert alert=driver.switchTo().alert();
		alert.accept();
		obj.checkbox2.click();
		Thread.sleep(2000);
		obj.checkbox1.click();
		Thread.sleep(2000);
		String str=obj.rotb.getText();
		System.out.println(str);
		Thread.sleep(2000);
		obj.prompt.click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("Cure MD");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		obj.confirm.click();
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		obj.HTML24.sendKeys(" Cure MD");
		Thread.sleep(3000);
		obj.HTML28.sendKeys("Haroon Butt");
		Thread.sleep(3000);
		obj.car.click();
		//select bag
		obj.Bag.click(); 
		//select book
		obj.Book.click();
		//deselect book
		obj.Book.click();
		//dropdown
		obj.dropbtn.click();
		//Facebook
		Thread.sleep(6000);
		obj.Facebook.click();
		
		
		
		driver.close();
		
	}

	
	
	
	

}
