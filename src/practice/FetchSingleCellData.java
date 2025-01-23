package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchSingleCellData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		
	FileInputStream file=new FileInputStream("C:\\Users\\Hp\\Workspace1\\SauceLab\\TestData\\ExtractData.xlsx");
	Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
	  String data1=sh.getRow(0).getCell(0).getStringCellValue();
	  System.out.println(data1);
	  String data=sh.getRow(0).getCell(1).getStringCellValue();
	  System.out.println(data);

	}

}
