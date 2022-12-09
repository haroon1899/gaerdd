package excel;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excel {
	@SuppressWarnings("unused")
	public static void main(String[] args) throws IOException {
		@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("haroon");
		Object empdata[][]= {  {"id","name"},
							   {1,"haroon"},
							   {2,"hassan"}
		                     };
		int rows =empdata.length;
		int cols=empdata[0].length;
		System.out.println("TOTAL ROWS ARE "+ rows);
		System.out.println("TOTAL COLS per ROWS ARE "+ cols);
		System.out.println("TOTAL COLS ARE "+ cols*rows);
		
		for(int r=0;r<rows;r++) {
			XSSFRow row = sheet.createRow(r);
			for(int c=0;c<cols;c++)
			{
				XSSFCell cell=row.createCell(c);
				Object value=empdata[r][c];
				if(value instanceof String)
					cell.setCellValue((String)value);
				if(value instanceof Integer)
					cell.setCellValue((Integer)value);
				if(value instanceof Boolean)
					cell.setCellValue((Boolean)value);
			}
		}
		File file=new File("C:\\Users\\4383\\eclipse-workspace\\Excelfiles\\haroon.xlsx");
		//String filePath = ".\\datafiles\\haroon.xlsx";
		FileOutputStream outstream = new FileOutputStream(file);
		workbook.write(outstream);
		outstream.close();
		
	}

}