package lab8;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class lab8pom {
	WebDriver driver;

	@FindBy(xpath = "//input[@class='suETmwkWYk2Tcl en8b0gypeeOoyj Ts+YceGnvTbKoG _4y7Skbm3OXlhNV d3VddHWjHgldJq JIXQq8gDYY04N6']")
	WebElement create;
	
	
	
	@FindBy(xpath = "//input[@class='K1gOL3o+6WYdD5']")
	WebElement createBoard;
	

	@FindBy(xpath = "//input[@class='nch-textfield__input Hj0IB7nx8rs7UO Hj0IB7nx8rs7UO ysTE7s-UXRkpYP']")
	WebElement boardTitle;

//
//	@FindBy(xpath = "//button[contains(text(),'Login')]")
//	WebElement Login;
//
//	@FindBy(xpath = "//iframe[@id='fra_Menu_CureMD']")
//	WebElement frameOne;
	
	public lab8pom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	
	public void login() throws Exception {
		
		Thread.sleep(2000);
		create.click();
		Thread.sleep(2000);
		createBoard.click();
		Thread.sleep(2000);
		boardTitle.sendKeys("hello");

	}

}
