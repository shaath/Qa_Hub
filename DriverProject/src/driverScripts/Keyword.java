package driverScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import methods.BusinessMethodsEg;

public class Keyword {

	public static void main(String[] args) throws IOException, InterruptedException {
				//		D:\\QAHub_Training\\Workspace\\SeleniumProject
		String xlPath = System.getProperty("user.dir")+"\\src\\com\\DriverProject\\TestData\\Keyword.xlsx";
		String xlOut = System.getProperty("user.dir")+"\\src\\com\\DriverProject\\Results\\KeyResSuite.xlsx";
		
		BusinessMethodsEg bm = new BusinessMethodsEg();
		String res = null;
		
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
						
						switch (key) {
						case "Launch":
							String br = Td_Sht.getRow(1).getCell(0).getStringCellValue();
							String url = Td_Sht.getRow(1).getCell(1).getStringCellValue();
							res = bm.orgLaunch(br, url);
							break;
						case "login":
							String u = Td_Sht.getRow(1).getCell(2).getStringCellValue();
							String p = Td_Sht.getRow(1).getCell(3).getStringCellValue();
							res = bm.orgLogin(u, p);
							break;
						case "logout":
							res = bm.orgLogout();
							bm.orgClose();
							break;
						case "Empreg":
							String f = Td_Sht.getRow(1).getCell(4).getStringCellValue();
							String l = Td_Sht.getRow(1).getCell(5).getStringCellValue();
							String eid = Td_Sht.getRow(1).getCell(6).getStringCellValue();
							res = bm.orgEmpReg(f, l, eid);
							break;
						case "Usereg":
							String ename = Td_Sht.getRow(1).getCell(7).getStringCellValue();
							String uname =Td_Sht.getRow(1).getCell(8).getStringCellValue();
							String pwd = Td_Sht.getRow(1).getCell(9).getStringCellValue(); 
							res = bm.orguserReg(ename, uname, pwd);
							break;
						case "Ulogin":
							String un =Td_Sht.getRow(1).getCell(8).getStringCellValue();
							String pswd = Td_Sht.getRow(1).getCell(9).getStringCellValue(); 
							res = bm.orgLogin(un, pswd);
							break;
						default:
							System.out.println("Please provide proepr keyword names");
							break;
						}
						
						//Results update in Test steps sheet
						Ts_Sht.getRow(j).createCell(4).setCellValue(res);
						
						//TestCase results update
						if(!Tc_Sht.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							Tc_Sht.getRow(i).getCell(3).setCellValue(res);
						}
						
					}
				}
				
			}
			else{
				Tc_Sht.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
		}
		
		FileOutputStream fo = new FileOutputStream(xlOut);
		wb.write(fo);
		wb.close();
	}

}
