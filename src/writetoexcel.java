import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.examples.CreateCell;

public class writetoexcel {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream f1 = new FileInputStream("C:\\Users\\usern\\Desktop\\Interview\\Selenium\\Newfolder\\TestSelenium\\test-data\\test1.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(f1);
			XSSFSheet sh = wb.getSheetAt(0);
			int ro = sh.getLastRowNum();
			System.out.println("number of rows are:" + ro);

				Row r1 = sh.getRow(1);
				Cell c1 = r1.createCell(2);
				c1.setCellValue("Success");
				System.out.println("Success");
			FileOutputStream f2 = new FileOutputStream("C:\\Users\\usern\\Desktop\\Interview\\Selenium\\Newfolder\\TestSelenium\\test-data\\test1.xlsx");
			wb.write(f2);
			f2.close();
			
			
		} catch (Exception e) {
			
		}
		
	}
}
