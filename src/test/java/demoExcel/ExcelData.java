package demoExcel;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExcelData
{
	//@Test
	public static String getCellData(String Path,String sheet,int row,int cell)
	{
		String v="";
		try
		{
			FileInputStream fis=new FileInputStream(Path);
			Workbook wb = WorkbookFactory.create(fis);
			 Cell c = wb.getSheet(sheet).getRow(row).getCell(cell);
			v=c.getStringCellValue();	
		}
		catch (Exception e)
		{
			Reporter.log("Invalid path",true);
		}
		System.out.println(v);
		return v;
		
	}
}

