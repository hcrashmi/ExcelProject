package demoExcel;

import org.testng.annotations.Test;

public class ExecuteExceltest extends ExcelData
{
	@Test
	public void data()
	{
		
		//getCellData("C://Users/TYSS/Desktop/RASHMI/ExcelProject/src/test/resources/Excel/data.xlsx","Sheet1",1,0);
		getCellData("./src/test/resources/Excel/data1.xls","Sheet1",1,0);
		
	}
}
