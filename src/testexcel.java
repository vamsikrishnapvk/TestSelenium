import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class testexcel {

	public static void main(String[] args) throws IOException {
		try {
			FileInputStream f1 = new FileInputStream("C:\\Users\\usern\\Desktop\\Interview\\Selenium\\Newfolder\\TestSelenium\\test-data\\test.xlsx");
			XSSFWorkbook wb = new XSSFWorkbook(f1);
			XSSFSheet sh = wb.getSheetAt(0);
			int ro = sh.getLastRowNum();
			System.out.println("number of rows are:" + ro);
			
			for(int i=1;i<=ro;i++){
				XSSFRow r = sh.getRow(i);
				int ce = r.getLastCellNum();
				System.out.println("number of columns are:" + ce);
				for(int j=0;j<r.getLastCellNum();j++){
					XSSFCell c = r.getCell(j);
					System.out.println(c.getStringCellValue());
				}
			}
			
			for (int i=1;i<=ro;i++){
				XSSFRow r1 = sh.getRow(i);
				XSSFCell c1 = r1.getCell(2);
				c1.setCellValue("Success");
				
			}
			FileOutputStream f2 = new FileOutputStream("C:\\Users\\usern\\Desktop\\Interview\\Selenium\\Newfolder\\TestSelenium\\test-data\\test.xlsx");
			wb.write(f2);
			f2.close();
			System.out.println("Success");
			/*Iterator rows = sh.rowIterator();
			while(rows.hasNext()){
				XSSFRow r = (XSSFRow) rows.next();
				Iterator cells = r.cellIterator();
				System.out.println(cells);
				while(cells.hasNext()){
					XSSFCell c = (XSSFCell) cells.next();
					System.out.println(c.getStringCellValue());
				}
			}*/
			
			
		} catch (Exception e) {
			
		}
		
	}

}
