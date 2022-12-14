package home_task;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class hometaskpom {
	WebDriver driver;
	@FindBy(xpath = "//ul[@id='menu-all-departments-1']//child::a[@title='Laptops']")
	WebElement laptop;
	
	@FindBy(xpath = "//i[@class='departments-menu-v2-icon fa fa-list-ul']")
	WebElement products;
	
	@FindBy(xpath = "//ul[@id='menu-all-departments-1']//child::a[@title='Tablet/Watches']")
	WebElement tabletButton;
	
	@FindBy(xpath = "//div[@class='product-loop-body product-item__body']//child::h2[@class='woocommerce-loop-product__title']")
	List<WebElement> tabletNames;
	
	@FindBy(xpath = "//div[@class='product-loop-body product-item__body']//child::div[@class='product-short-description']")
	List<WebElement> tabletDescription;
	
	@FindBy(xpath = "//div[@class='product-loop-footer product-item__footer']//child::span[@class='woocommerce-Price-amount amount']")
	List<WebElement> tabletPrices;

	

	public hometaskpom(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	

	   ArrayList<String> Tnames=new ArrayList<String>(); 
	   List<WebElement> Tabletnames=driver.findElements(By.xpath("//h2[@class='woocommerce-loop-product__title']"));
	   for(WebElement e:Tabletnames) {
		   String names=e.getText();
		   Tnames.add(names);
		  
	   }
	
	

}
