package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
	

		public String getPropertyData(String key) throws IOException {
		FileInputStream f= new FileInputStream("./data/commondata.property");
		Properties p= new Properties();
		p. load(f);
		String data = p.getProperty(key);
		return data ;
		}
		public String getExceIData(String sheetname,int row, int cell) throws EncryptedDocumentException, IOException {
		FileInputStream f=new FileInputStream("./data/testScript.xlsx");
		Workbook wb = WorkbookFactory.create(f);
		String data = wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
		}
}
