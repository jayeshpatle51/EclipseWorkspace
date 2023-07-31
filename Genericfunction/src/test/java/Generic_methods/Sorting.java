package Generic_methods;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import utils.XLUtils;
class subclass extends Sorting{
	static final String str="jayesh";
	
	public void sortingExcelData(String s, String v) {
		System.out.println(str);
	}
}
public class Sorting {
	
	public void sortingExcelData(String xlfile, String sheet,String shortby) throws IOException {

		int rows = XLUtils.getRowCount(xlfile, sheet);
      
		int firstrowno = XLUtils.ws.getFirstRowNum();
		int columns = XLUtils.getColumnCount(xlfile, sheet, firstrowno);
		int lastrowno = XLUtils.ws.getLastRowNum();
		Row row3=XLUtils.ws.getRow(firstrowno);
		short firstcellno = row3.getFirstCellNum();
		System.out.println(firstcellno);
		short lastcellno = row3.getLastCellNum();
		System.out.println(lastcellno);
		String[][] sort = new String[rows][columns];
		int ind1 = 0;

		for (int i = firstrowno; i <= lastrowno; i++) {
			int ind2 = 0;
			for (int j = firstcellno; j < lastcellno; j++) {

				sort[ind1][ind2] = XLUtils.getStringCellData(xlfile, sheet, i, j);
				if (!sort[ind1][ind2].isEmpty()) {
					System.out.print(sort[ind1][ind2] + "   ");
				} else {

					double d = XLUtils.getNumericCellData(xlfile, sheet, i, j);
					int k = (int) d;
					sort[ind1][ind2] = String.valueOf(k);
					System.out.print(sort[ind1][ind2] + " ");
				}
				ind2++;

			}
			ind1++;
			System.out.println();
		}
		List<String> sortlist = new ArrayList<>();
		// int f=sort.length;
		// System.out.println(f);
	    
		int shortindex=0; 
		for(int i=0;i<sort[i].length;i++) {
		
		if(sort[0][i].equals(shortby)) {
			shortindex=i;
			break;
		}
		
		}
		
		for (int n = 1; n < sort.length; n++) {
			sortlist.add(sort[n][shortindex]);
		}
		System.out.println(sortlist);
		Collections.sort(sortlist);
		System.out.println(sortlist);
		for (int i = 0; i < sortlist.size(); i++) {
			boolean b = false;
			int index = 0;
			for (int j = 1; j < sort.length; j++) {
				if (sortlist.get(i).equals(sort[j][shortindex])) {
					index = j;
					b = true;
				}
			}
			if (b) {
				String stm = sort[index][1];
				char[] c = new char[7];
				for (int j = 0; j < 7; j++) {
					if (j < stm.length()) {
						c[j] = stm.charAt(j);
					} else {
						c[j] = ' ';
					}
				}
				String newstr = "";
				for (int j = 0; j < c.length; j++) {
					newstr = newstr + c[j];
				}
				System.out.println(newstr + " | " + sort[index][0] + " | " + sort[index][2]);
			}
		}

	}

	public static void main(String[] args) throws IOException {
		String xlfile="C:\\Users\\SPURGE\\Documents\\StudentsData.xlsx";
		String sheet="Sheet1";
		Sorting st=new Sorting();
		
		st.sortingExcelData(xlfile, sheet, "Name");
		
		
		
	}

}
