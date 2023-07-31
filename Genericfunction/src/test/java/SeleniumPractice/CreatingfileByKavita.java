package SeleniumPractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.BaseTest;

public class CreatingfileByKavita {

	public static void main(String[] args) {

		BaseTest.launchBrowser("chrome");
		WebDriver driver = BaseTest.driver;

		driver.get("https://www.worldometers.info/world-population/");

		// driver.get(URL);
		WebElement ele = driver.findElement(By.name("table-historical"));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele);
		// table[contains(@class,'table-list')][1]
//		WebElement table = driver.findElement(By.xpath("(//table[contains(@class,'table-list')])[1]"));
//
//		List<WebElement> rows = table.findElements(By.tagName("tr"));
//		System.out.println(rows.size());
		List<WebElement> yearlist = driver
				.findElements(By.xpath("(//table[contains(@class,'table-list')])[1]//tr//td[1]"));

		List<WebElement> populnamelist = driver
				.findElements(By.xpath("(//table[contains(@class,'table-list')])[1]//tr//td[2]"));

		for (int i = 0; i < yearlist.size(); i++) {
			// List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			// System.out.println(cols.size());
			//
			// for (int j = 0; j < cols.size(); j++) {
			// int m = 0;

//				String data = cols.get(j).getText();
//				String[] arr = data.split(" ");
//				// System.out.println(Arrays.toString(arr));
//				System.out.print(data + " ");
//
//			    String file = year;
//				try {
//                     File fi=new File("D:\\Users\\Year_and_Population\\"+year);
//                     fi.mkdir();
//					FileWriter fw = new FileWriter("D:\\Users\\Year_and_Population\\" + file + ".txt");
//					BufferedWriter WriteFileBuffer = new BufferedWriter(fw);
//					WriteFileBuffer.write(name);
//					WriteFileBuffer.close();
//
//					FileReader fr = new FileReader("D:\\Users\\Year_and_Population\\" + file + ".txt");
//					BufferedReader ReadFileBuffer = new BufferedReader(fr);
//
//					// System.out.println(ReadFileBuffer.readLine());
//
//					ReadFileBuffer.close();
//				} catch (IOException Ex) {
//					System.out.println(Ex.getMessage());
//				}
			// m++;
			// ReadAndWrite(file);
			// }
//			System.out.println();
			String year = yearlist.get(i).getText();
			String name = populnamelist.get(i).getText();
			try {
				File myObj = new File("D:\\Users\\Year_and_Population\\" + year);
				if (myObj.mkdir()) {
					System.out.println("Folder Created successfully for year : " + myObj.getName());
					myObj = new File("D:\\Users\\Year_and_Population\\" + year + "\\population.txt");
					if (myObj.createNewFile()) {
						System.out.println("File created: " + myObj.getName());

						FileWriter fileWritter = new FileWriter(myObj.getPath(), true);
						BufferedWriter bw = new BufferedWriter(fileWritter);
						bw.write(name);
						bw.close();

						System.out.println("population data submitted");
					} else {
						System.out.println("File already exists.");
					}
				} else {
					System.out.println("Folder not created for year : " + year);
				}
			} catch (IOException e) {
				System.out.println("An error occurred.");
				e.printStackTrace();
			}
		}

		BaseTest.closeDriver();

	}
}