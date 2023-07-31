package ExecelInput;

import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.XLUtils;

public class SampleExcelData {
	
	String XLfile="C:\\Users\\SPURGE\\Documents\\StudentsData.xlsx";
	String XLSheet="Sheet1";
	@Test(dataProvider="UserData")
	public void getExcelData(String name,String Marks, String Grade,String MobileNumber) {
		
		System.out.println(name +" | "+Marks+" | "+Grade+" | "+ MobileNumber);
	}

	static Object str;
	static Object b;
	static Object in;
	@DataProvider(name="UserData")
	public String[][] dataProvider() throws IOException{
		
		int rows=XLUtils.getRowCount(XLfile, XLSheet);
		int cols=XLUtils.getColumnCount(XLfile, XLSheet, 0);
		String[][] obj=new String[rows-1][cols];
		for(int i=0;i<obj.length;i++) {
			for(int j=0;j<obj[i].length;j++) {
				
				Cell c =XLUtils.getCellvalue(XLfile, XLSheet, i+1, j);
//			    switch (c.getCellType()) {
//				case STRING:
//					obj[i][j]=c.getStringCellValue();
//					break;
//				case BOOLEAN:
//					Boolean b=c.getBooleanCellValue();
//					obj[i][j] =b.toString();
//				case NUMERIC:
//					long l=(long)c.getNumericCellValue();
//					obj[i][j]=String.valueOf(l);
//				default:
//					break;
//				}
				DataFormatter data= new DataFormatter();
			obj	[i][j] =data.formatCellValue(c);
			}
		}
		return obj;
	}
}
