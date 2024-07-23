package resources;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Test_Data 
{
	public static String mobileNo,invalidMobNo,name,un_email,pwd;
   public void data_fetching() throws EncryptedDocumentException, IOException
   {
	   FileInputStream f1=new FileInputStream("C:\\Users\\admin\\eclipse-workspace-mkt\\final_Project\\Resources\\Amazon.xlsx");
	   Workbook wb= WorkbookFactory.create(f1);
	    mobileNo =NumberToTextConverter.toText(wb.getSheet("cred").getRow(1).getCell(1).getNumericCellValue());
	    invalidMobNo =NumberToTextConverter.toText(wb.getSheet("cred").getRow(1).getCell(4).getNumericCellValue());
	    name=wb.getSheet("cred").getRow(1).getCell(0).getStringCellValue();
	    pwd=wb.getSheet("cred").getRow(1).getCell(3).getStringCellValue();
	    un_email=wb.getSheet("cred").getRow(1).getCell(2).getStringCellValue();
	   
   }
}
