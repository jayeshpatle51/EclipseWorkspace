package practiceprograms;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testng {

	public void createFacebook(String firstname, String lastname, String mobile, String pass, String date, String month,
			String year, String gender) throws IOException, InterruptedException {
		// System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		// WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com");
		driver.findElement(By.linkText("Create New Account")).click();

//        System.out.println(firstName+" "+lastName+" "+mob);
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		// driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(firstname);
		// driver.findElement(By.xpath("//input[@name='lastname']")).clear();
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(lastname);
		// driver.findElement(By.xpath("//input[@name='reg_email__']")).clear();
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys(mobile);
		// driver.findElement(By.xpath("//input[@name='reg_passwd__']")).clear();
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys(pass);
		Select dt = new Select(driver.findElement(By.xpath("//*[@id='day']")));
		dt.selectByValue(date);

		Select mon = new Select(driver.findElement(By.xpath("//*[@id='month']")));
		mon.selectByVisibleText(month);

		Select yr = new Select(driver.findElement(By.xpath("//*[@id='year']")));
		yr.selectByVisibleText(year);

		WebElement gen = driver.findElement(By.xpath("//label[text()='" + gender + "']"));

		if (!gen.isSelected()) {
			gen.click();
		}
		Thread.sleep(3000);
		driver.quit();

	}

	SoftAssert as;

	@Test
	public void Method1() {
		as = new SoftAssert();
		System.out.println("This is method 1.");
		as.assertEquals("jayesh", "Jayesh");
		as.assertAll();
	}

	@Test
	public void Method2() {
		as = new SoftAssert();
		System.out.println("This is method 2.");
		as.assertEquals("Jitendra", "Sandhya");
		as.assertAll();
	}

	@Test
	public void Method3() {
		as = new SoftAssert();
		System.out.println("This is method 3.");
		as.assertEquals("jon", "jon");
		as.assertAll();
	}
//	@BeforeMethod()
//	public void beforemethod() {
//		System.out.println("This is before method");
//	}
//	@AfterMethod
//	public void afterMethod() {
//		System.out.println("This is after method");
//	}
//
//	@BeforeClass
//	public void beforeclass() {
//		System.out.println("This is before class");
//	}
//
//	@AfterClass
//	public void afterclass() {
//		System.out.println("This is after class");
//	}
//
//	@BeforeTest
//	public void beforeTest() {
//		System.out.println("This is before Test");
//	}
//
//	@AfterTest
//	public void afterTest() {
//		System.out.println("This is After Test");
//	}
//
//	@BeforeSuite
//	public void beforeSuite() {
//		System.out.println("This is Before Suite");
//	}
//
//	@AfterSuite
//	public void afterSuite() {
//		System.out.println("This is After Suite");
//	}
//

//   @Factory()
//	public Object[] getTestClasses() {
//		Object[] tests = new Object[2];
//		tests[0] = new Testng();
//
//		return tests;
//	}

	public void registrationfacebook(String firstname, String lastname, String mobile, String pass, String date,
			String month, String year, String gender) {
		System.out.println(firstname + " " + lastname + " " + mobile + " " + pass + " " + date + " " + month + " "
				+ year + " " + gender);
	}

	@DataProvider(name = "data")
	public String[][] dataprovider() throws IOException {

		String file = "C:\\Users\\SPURGE\\Downloads\\excelDriven.xlsx";
		FileInputStream input = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(input);
		XSSFSheet sheet = workbook.getSheet("Sheet2");
		int rows = sheet.getLastRowNum();
		System.out.println(rows);
		// XSSFRow ro=sheet.getRow(rows);
		Row r = sheet.getRow(0);

		int col = r.getLastCellNum();
		System.out.println(col);
		String arr[][] = new String[rows + 1][col - 1];
		for (int i = 0; i < rows + 1; i++) {
			for (int j = 0; j < col - 1; j++) {
				Row r1 = sheet.getRow(i);
				Cell cell = r1.getCell(j);
				arr[i][j] = cell.toString();
			}

		}
		input.close();
		workbook.close();
		return arr;
	}

	@DataProvider(name = "excelDriveFacebook")
	public String[][] getDataFromExcelFacebook() throws IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\SPURGE\\Downloads\\excelDriven.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet = wb.getSheet("Sheet2");
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println(rowCount);
		Row row = sheet.getRow(0);
		int colCount = row.getLastCellNum();
		System.out.println(colCount);
		String[][] data = new String[rowCount - 1][colCount - 1];
		for (int i = 0; i < rowCount - 1; i++) {
			// row=sheet.getRow(i+1);
			for (int j = 0; j < colCount - 1; j++) {
				Row r1 = sheet.getRow(i + 1);
				Cell cell = r1.getCell(j);

				DataFormatter d = new DataFormatter();
				data[i][j] = d.formatCellValue(cell);
//               switch (cell.getCellType()) {
//				case STRING:
//					data[i][j]=cell.getStringCellValue();
//					break;
//				case BOOLEAN:
//					Boolean b=cell.getBooleanCellValue();
//					data[i][j] =b.toString();
//				case NUMERIC:
//					long l=(long)cell.getNumericCellValue();
//					data[i][j]=String.valueOf(l);
//				default:
//					break;
//				}
//
			}
		}
		wb.close();
		fis.close();
		return data;

	}
}
