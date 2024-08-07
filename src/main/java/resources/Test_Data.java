package resources;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;

public class Test_Data 
{
	public static String firstName, lastName, dob, mobileNo, email, pwd, invalidpwd, invalidMobNo, invalidemail;
	public void data_fetching() throws EncryptedDocumentException, IOException
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\admin\\eclipse-workspace-mkt\\final_Project2\\Utilities\\Airline.xlsx");
		Workbook wb= WorkbookFactory.create(f1);
		firstName=wb.getSheet("cred").getRow(1).getCell(0).getStringCellValue();
		lastName=wb.getSheet("cred").getRow(1).getCell(1).getStringCellValue();
		dob=NumberToTextConverter.toText(wb.getSheet("cred").getRow(1).getCell(2).getNumericCellValue());
		mobileNo =NumberToTextConverter.toText(wb.getSheet("cred").getRow(1).getCell(3).getNumericCellValue());
		email=wb.getSheet("cred").getRow(1).getCell(4).getStringCellValue();
		pwd=wb.getSheet("cred").getRow(1).getCell(5).getStringCellValue();
		invalidpwd=wb.getSheet("cred").getRow(2).getCell(5).getStringCellValue();
		invalidMobNo =NumberToTextConverter.toText(wb.getSheet("cred").getRow(1).getCell(6).getNumericCellValue());
		invalidemail=wb.getSheet("cred").getRow(2).getCell(4).getStringCellValue();
	}
}
