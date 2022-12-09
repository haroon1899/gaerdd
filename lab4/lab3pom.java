package lab3;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class lab3pom {
	
	//step1
	@FindBy (xpath="//textarea[@id='ta1']")
	WebElement fieldone;
	
	@FindBy (xpath="//textarea[contains(text(), 'The cat was playing in the garden.')]")
	WebElement description;
	
	
	//step2
	
	@FindBy (xpath="//*[@id='table1']")
	WebElement table;
	
	public void fetchtable() throws InterruptedException {
		
		List<WebElement> rows=table.findElements(By.tagName("tr"));
		List<WebElement> heads=table.findElements(By.tagName("th"));
		for(int i=0;i<heads.size();i++) {
			System.out.print(heads.get(i).getText() + "      ");
		}
		Thread.sleep(2000);
		
		for(int r=0;r<rows.size();r++) {
			List<WebElement>  columns= rows.get(r).findElements(By.tagName("td"));
			for(int c=0;c<columns.size();c++) {
				System.out.print(columns.get(c).getText() + "    ");
			}
			System.out.println("  ");
		}
	}
	
	
	@FindBy (xpath="//form[contains(text(),'Username: ')]//child::input[@type='text']")
	WebElement UsernameOne;
	@FindBy (xpath="//form[contains(text(),'Username: ')]//child::input[@type='password']")
	WebElement PasswordOne;
	@FindBy (xpath="//button[@value='LogIn']")
	WebElement loginOne;
	
	// step3
	
	
	public void scroll(WebDriver driver)
	{
		Actions action=new Actions(driver);
		action.sendKeys(Keys.PAGE_DOWN).build().perform();
	}
	public String currentWindow(WebDriver driver)
	{
		String currentwindow=driver.getWindowHandle();
		return currentwindow;
	}
	
	@FindBy (xpath="//iframe[@id='iframe1']")
	WebElement frameOne;
	@FindBy (xpath="//iframe[@id='iframe2']")
	WebElement frameTwo;
	
	@FindBy (xpath="//input[@name='userid' ]")
	WebElement UsernameTwo;
	@FindBy (xpath="//input[@name='pswrd' ]")
	WebElement PasswordTwo;
	@FindBy (xpath="//input[@value='Login' ]")
	WebElement loginTwo;
	
	public void alert(WebDriver driver)
	{
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Assert.assertEquals(driver.getTitle(), "omayo (QAFox.com)");
	}
	
	@FindBy (xpath="//option[@value='Hyundaix']")
	WebElement Hyundaix;
	@FindBy (xpath="//select[@id='drop1']")
	WebElement dropdown;
	
	
	public void doc3() throws InterruptedException
	{
		Select option= new Select(dropdown);
		Thread.sleep(3000);
		option.selectByVisibleText("doc 3");
		Thread.sleep(2000);
	}
	@FindBy (xpath="//input[@name='fname']")
	WebElement text;
	
	
	public void clear() throws InterruptedException
	{
		
		text.clear();
		text.sendKeys("Selenium");
		Thread.sleep(2000);
	}
	
	@FindBy (xpath="//button[@id='but2']")
	WebElement button;
	
	
	@FindBy (xpath="//button[contains(text(),'Submit')]")
	WebElement submit;
	
	
	@FindBy (xpath="//button[contains(text(),'Login')]")
	WebElement login;
	
	
	@FindBy (xpath="//button[contains(text(),'Register')]")
	WebElement register;
	
	@FindBy (xpath="//input[@id='alert2']")
	WebElement alerttwo;
	
	@FindBy (xpath="//a[contains(text(),'Open a popup window')]")
	WebElement popup;
	
	@FindBy (xpath="//button[contains(text(),'Try it')]")
	WebElement tryit;
	
	@FindBy (xpath="//button[contains(text(),'Double click Here')]")
	WebElement doubleclick;
	
	@FindBy (xpath="//button[contains(text(),'Check this')]")
	WebElement checkthis;
	
	@FindBy (xpath="//input[@id='dte']")
	WebElement dte;
	
	
	
	
	// step5 
	
	@FindBy (xpath="//input[@id='radio1']")
	WebElement radio;
	
	@FindBy (xpath="//input[@id='alert1']")
	WebElement alert1;
	
	
	@FindBy (xpath="//input[@id='checkbox2']")
	WebElement checkbox2;
	
	
	@FindBy (xpath="//input[@id='checkbox1']")
	WebElement checkbox1;
	
	
	@FindBy (xpath="//input[@id='rotb']")
	WebElement rotb;
	
	
	@FindBy (xpath="//input[@id='prompt']")
	WebElement prompt;
	
	
	@FindBy (xpath="//input[@id='confirm']")
	WebElement confirm;
	
	@FindBy (xpath="//div[@id='HTML24']/child::div/input[@class='classone']")
	WebElement HTML24;
	

	@FindBy (xpath="//div[@id='HTML28']/child::div/input[@class='classone']")
	WebElement HTML28;
	
	@FindBy (xpath="//input[@value='Car']")
	WebElement car;
	
	@FindBy (xpath="//input[@value='Book']")
	WebElement Book;
	
	
	@FindBy (xpath="//input[@value='Bag']")
	WebElement Bag;
	
	
	@FindBy (xpath="//button[@class='dropbtn']")
	WebElement dropbtn;
	
	
	@FindBy (xpath="//a[contains(text(),'Facebook')]")
	WebElement Facebook;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
		
	
	
	

}
