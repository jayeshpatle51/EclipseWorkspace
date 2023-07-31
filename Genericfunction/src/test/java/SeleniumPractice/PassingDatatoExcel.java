package SeleniumPractice;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class PassingDatatoExcel {

	public static void main(String[] args) throws IOException {

//		File f = new File("D:\\eclipse-workspace\\Genericfunction\\Population.xlsx");
//		f.createNewFile();
		FileInputStream file = new FileInputStream("D:\\eclipse-workspace\\Genericfunction\\Population.xlsx");
		XSSFWorkbook workbook1 = new XSSFWorkbook(file);
		XSSFSheet sheet1 = workbook1.getSheet("ListOfPopulation");

		Row row = sheet1.createRow(1);
		Cell cell = row.createCell(1);
		// cell.setCellType(cell.CELL_TYPE_STRING);
		cell.setCellValue("SoftwareTestingMaterial.com");
		FileOutputStream fos = new FileOutputStream("D:\\eclipse-workspace\\Genericfunction\\Population.xlsx");
		workbook1.write(fos);
		workbook1.close();
		file.close();
		fos.close();

	}

}
