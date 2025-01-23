package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchCell {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
       FileInputStream file=new FileInputStream("C:\\Users\\Hp\\Workspace1\\SauceLab\\TestData\\ExtractData.xlsx");
       Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
       
       int rowSize=sh.getLastRowNum();
       for(int i=0;i<=rowSize;i++)
       {
    	   String data=sh.getRow(i).getCell(0).getStringCellValue();
    	   System.out.println(data);
       }
       
	}

}
