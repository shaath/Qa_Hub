package driverScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Keyword {

	public static void main(String[] args) throws IOException {
				//		D:\\QAHub_Training\\Workspace\\SeleniumProject
		String xlPath = System.getProperty("user.dir")+"\\src\\com\\SeleniumProject\\testdata\\Keyword.xlsx";
		
		FileInputStream fi = new FileInputStream(xlPath);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet Tc_Sht = wb.getSheet("Testcase");
		XSSFSheet Ts_Sht = wb.getSheet("Teststeps");
		XSSFSheet Td_Sht = wb.getSheet("TestData");
		
		int Tc_Sht_Lri = Tc_Sht.getLastRowNum();
		int Ts_Sht_Lri = Ts_Sht.getLastRowNum();
		
		
		for (int i = 1; i <= Tc_Sht_Lri; i++) {
			Tc_Sht.getRow(i).createCell(3);
			String exe = Tc_Sht.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y")) {
				String Tc_Sht_Tc_Id = Tc_Sht.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= Ts_Sht_Lri; j++) {
					String Ts_Sht_Tc_Id = Ts_Sht.getRow(j).getCell(0).getStringCellValue();
					
					if (Tc_Sht_Tc_Id.equalsIgnoreCase(Ts_Sht_Tc_Id)) {
						String key = Ts_Sht.getRow(j).getCell(3).getStringCellValue();
						System.out.println(key);
					}
				}
				
			}
			else{
				Tc_Sht.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
		}
	}

}
