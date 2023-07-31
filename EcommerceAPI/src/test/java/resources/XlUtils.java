package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XlUtils 
{
	File f;
	FileInputStream fi; 
	Workbook wb;
	Sheet s;
	Row r;
	Cell c;
	String location;
	//= "C:\\Users\\SPURGE\\Desktop\\Selenium\\ParaBank\\Book1.xlsx"
	public String readStringData(String fileLocation, String sheet, int row, int coloumn) throws IOException
	{
		getSheet(fileLocation);
		s = wb.getSheet(sheet);
		r = s.getRow(row);
		c = r.getCell(coloumn);
		String data = c.getStringCellValue();
		return data;
		//"C:\\Users\\SPURGE\\Desktop\\Selenium\\ParaBank\\Book1.xlsx"
	}

	public String readStringData(String sheet,int row, int coloumn) throws IOException
	{
		
		s = wb.getSheet(sheet);
		r = s.getRow(0);
		c = r.getCell(coloumn);
		String data = c.getStringCellValue();
		return data;
		//"C:\\Users\\SPURGE\\Desktop\\Selenium\\ParaBank\\Book1.xlsx"
	}
	
	public double readNumericData(String sheet, int row, int coloumn) throws IOException
	{
		
		s = wb.getSheet(sheet);
		r = s.getRow(row);
		c = r.getCell(coloumn);
		double data = c.getNumericCellValue();
		return data;
		//"C:\\Users\\SPURGE\\Desktop\\Selenium\\ParaBank\\Book1.xlsx"
	}
	
	public void getSheet(String fileLocation) throws IOException
	{
		f= new File(fileLocation);
		fi = new FileInputStream(f);
		wb = new XSSFWorkbook(fi);
	}
	
	public ArrayList<String> getdata(String sheet, int string) throws IOException
	{
		String data="";
		long NumData=0;
		ArrayList<String> al = new ArrayList<String>();
		s = wb.getSheet(sheet);
		r = s.getRow(string);
		int lastCell = r.getLastCellNum();
		for (int i = 0; i < lastCell; i++)
		{
			try
			   {
				    data = readStringData(sheet, string, i);	
				    al.add(data);
			   } catch (Exception e) 
			   {
				 NumData = (long) readNumericData(sheet, string, i);
				 al.add(Long.toString(NumData));
			   }
		}
		return al;
	}
	
}
