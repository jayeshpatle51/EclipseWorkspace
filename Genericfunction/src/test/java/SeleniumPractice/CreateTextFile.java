package SeleniumPractice;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.BaseTest;

public class CreateTextFile {

	public static void main(String[] args) {

		BaseTest.launchBrowser("chrome");
		WebDriver driver = BaseTest.driver;

		driver.get("https://www.worldometers.info/world-population/");

		List<WebElement> populationcol = driver
				.findElements(By.xpath("(//table[contains(@class,'table table-striped')])[1]//tr//td[2]"));

		List<WebElement> yearscol = driver
				.findElements(By.xpath("(//table[contains(@class,'table table-striped')])[1]//tr//td[1]"));
		System.out.println(yearscol.size());

		for (int k = 0; k < yearscol.size(); k++) {
			String year = yearscol.get(k).getText();
			String population = populationcol.get(k).getText();
			// System.out.println(year + " " + population);

			try {
				File myObj = new File("D:\\Users\\Year_and_Population\\" + year);
				if (myObj.mkdir()) {
					System.out.println("Folder Created successfully for year : " + myObj.getName());
					myObj = new File("D:\\Users\\Year_and_Population\\" + year + "\\population.txt");
					if (myObj.createNewFile()) {
						System.out.println("File created: " + myObj.getName());

						// FileWriter fileWritter = new FileWriter(myObj.getPath(), true);
						BufferedWriter bw = new BufferedWriter(new FileWriter(myObj.getPath(), true));
						bw.write("Population in year " + year + " is :-  " + population);
						bw.close();

						System.out.println("Done");
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
