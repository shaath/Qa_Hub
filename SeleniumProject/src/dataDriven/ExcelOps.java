package dataDriven;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOps {

	public static void main(String[] args) throws IOException {
		
		String xlPath = "D:\\QAHub_Training\\Workspace\\SeleniumProject\\src\\com\\SeleniumProject\\testdata\\TestData.xlsx";
		
		FileInputStream fi = new FileInputStream(xlPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
		XSSFRow r = ws.getRow(4);
		XSSFCell c = r.getCell(0);
		
		System.out.println(c.getStringCellValue());
		
		

	}

}
