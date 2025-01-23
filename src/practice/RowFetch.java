package practice;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RowFetch {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		// TODO Auto-generated method stub
		FileInputStream file=new FileInputStream("C:\\\\Users\\\\Hp\\\\Workspace1\\\\SauceLab\\\\TestData\\\\ExtractData.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet1");
		
		int cellSize=sh.getRow(0).getLastCellNum();
		
		for(int i=0;i<cellSize;i++)
		{
			String data=sh.getRow(0).getCell(i).getStringCellValue();
			System.out.print(data+"|");
		}
	}

}
