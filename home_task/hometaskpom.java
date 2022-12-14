package home_task;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class hometaskpom {
	WebDriver driver;

	Logger log=Logger.getLogger("hometaskpom");
	@FindBy(xpath = "//ul[@id='menu-all-departments-1']//child::a[@title='Laptops']")
	WebElement laptop;

	@FindBy(xpath = "//i[@class='departments-menu-v2-icon fa fa-list-ul']")
	WebElement products;

	@FindBy(xpath = "//div[@class='product-loop-body product-item__body']//child::h2[@class='woocommerce-loop-product__title']")
	List<WebElement> laptopName;

	@FindBy(xpath = "//div[@class='price-add-to-cart']//child::span[@class='woocommerce-Price-amount amount']")
	List<WebElement> laptopPrices;

	@FindBy(xpath = "//div[@class='product-short-description']")
	List<WebElement> laptopDescription;

	@FindBy(xpath = "//select[@name='ppp']")
	WebElement showPerPage;

	public hometaskpom(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void check() throws InterruptedException, IOException {
		products.click();
		log.info("click on product");
		Thread.sleep(3000);
		laptop.click();
		log.info("click on laptop button");
		Thread.sleep(3000);

		Select laptops = new Select(showPerPage);
		laptops.selectByVisibleText("Show All");
		log.info("show all page");
		Thread.sleep(2000);

		ArrayList<String> descriptions = new ArrayList<String>();

		for (WebElement e : laptopName) {
			String description = e.getText();
			descriptions.add(description);
			System.out.println(description);

		}
		log.info("descriptions are printed on console");

		ArrayList<String> laptopnames = new ArrayList<String>();

		for (WebElement e : laptopDescription) {
			String names = e.getText();
			laptopnames.add(names);
			System.out.println(names);

		}
		log.info("names are printed on console");

		ArrayList<String> laptopprices = new ArrayList<String>();

		for (WebElement e : laptopPrices) {
			String prices = e.getText();
			laptopprices.add(prices);
			System.out.println(prices);

		}
		log.info("prices are printed on console");

		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("haroon");

		for (int r = 0; r < laptopprices.size(); r++) {
			XSSFRow row = sheet.createRow(r);

			int c = 0;
			XSSFCell cell = row.createCell(c);
			Object prices = laptopprices.get(r);

			// prices added in excel

			if (prices instanceof String)
				cell.setCellValue((String) prices);
			if (prices instanceof Integer)
				cell.setCellValue((Integer) prices);
			if (prices instanceof Boolean)
				cell.setCellValue((Boolean) prices);

			// names are added in excel

			XSSFCell cell2 = row.createCell(c + 1);
			Object names = laptopnames.get(r);
			if (names instanceof String)
				cell2.setCellValue((String) names);
			if (names instanceof Integer)
				cell2.setCellValue((Integer) names);
			if (names instanceof Boolean)
				cell2.setCellValue((Boolean) names);

			// descriptions are added in excel

			XSSFCell cell3 = row.createCell(c + 2);
			Object description = descriptions.get(r);
			if (names instanceof String)
				cell3.setCellValue((String) description);
			if (names instanceof Integer)
				cell3.setCellValue((Integer) description);
			if (names instanceof Boolean)
				cell3.setCellValue((Boolean) description);

		}
		File file = new File("C:\\Users\\DELL\\eclipse-workspace\\excelfiles\\haroon.xlsx");
		log.info("check excel file in your directory");
		// String filePath = ".\\datafiles\\haroon.xlsx";
		FileOutputStream outstream = new FileOutputStream(file);
		workbook.write(outstream);
		outstream.close();

	}
}