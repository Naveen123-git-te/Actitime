package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class filelib {
	public String readPropertyData(String key) throws IOException {
		FileInputStream fil=new FileInputStream("./myresume/commondata.property");
		Properties pro=new Properties();
		pro.load(fil);
		String data=pro.getProperty(key);
		return data;
		}
	public String readExcelData(String sheetName ,int row,int cell ,String value) throws EncryptedDocumentException, IOException {
		FileInputStream fil=new FileInputStream("./myresume/testscript.xlsx");
		Workbook wb = WorkbookFactory.create(fil);
	    String data= wb.getSheet("createCustomer").getRow(1).getCell(3).getStringCellValue();
		return data;
	}
}
