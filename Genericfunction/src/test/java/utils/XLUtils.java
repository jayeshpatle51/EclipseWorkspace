package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtils 
{

	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFWorkbook wb;
	public static XSSFSheet ws;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static CellStyle style; 
	
	
	
	public static int getRowCount(String xlfile,String xlsheet) throws IOException
	{
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		int firstrowno=ws.getFirstRowNum();
		
		int lastrowno =  ws.getLastRowNum();
		int rowcount=lastrowno+1-firstrowno;
		
		wb.close();
		fi.close();
		return rowcount;		
	}	
	
	public static short getColumnCount(String xlfile,String xlsheet,int rownum) throws IOException
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		       short firstcellno=row.getFirstCellNum();
		short lastcellno =  row.getLastCellNum();
		short colcount=(short) (lastcellno-firstcellno);
		wb.close();
		fi.close();
		return colcount;
	}
	
	public static String getStringCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		
		String data;
		try 
		{
			cell = row.getCell(colnum);
			data = cell.getStringCellValue();
			
		} catch (Exception e) {
			data = "";
			//System.out.println("No data found!");
		}
		wb.close();
		fi.close();
		return data;		
	}
	
	public static double getNumericCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		
		double data;
		try 
		{
			cell = row.getCell(colnum);
			data = cell.getNumericCellValue();
			
		} catch (Exception e) {
			data = 0.0;
			
		}
		wb.close();
		fi.close();
		return data;		
	}
	
	public static boolean getBooleanCellData(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		
		boolean data;
		try 
		{
			cell = row.getCell(colnum);
			data = cell.getBooleanCellValue();
			
		} catch (Exception e) {
			data = false;
			System.out.println("No data found!");
		}
		wb.close();
		fi.close();
		return data;		
	}
	
	public static Cell getCellvalue(String xlfile,String xlsheet,int rownum,int colnum) throws IOException {
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		Cell cell=row.getCell(colnum);
		
		wb.close();
		fi.close();
		return cell;
		
	}
	
	public static void setCellData(String xlfile,String xlsheet,int rownum,int colnum,String data) throws IOException
	{
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		 //ws=wb.createSheet(xlsheet);
		ws = wb.getSheet(xlsheet);
		//row=ws.createRow(rownum);
		row = ws.getRow(rownum);
		cell = row.createCell(colnum);
		cell.setCellValue(data);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();	
		fo.close();
		
	}
	
	public static void fillGreenColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell = row.getCell(colnum);
		
		style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();		
	}
	
	
	public static void fillRedColor(String xlfile,String xlsheet,int rownum,int colnum) throws IOException
	{
		
		fi = new FileInputStream(xlfile);
		wb = new XSSFWorkbook(fi);
		ws = wb.getSheet(xlsheet);
		row = ws.getRow(rownum);
		cell = row.getCell(colnum);
		
		style = wb.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		cell.setCellStyle(style);
		fo = new FileOutputStream(xlfile);
		wb.write(fo);
		wb.close();
		fi.close();
		fo.close();		
	}

}
