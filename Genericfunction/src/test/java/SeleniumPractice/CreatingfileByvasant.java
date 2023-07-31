package SeleniumPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Baseclass.BaseTest;

public class CreatingfileByvasant {

	WebDriver driver;
	By yearBy = By.xpath(
			"(//table[@class='table table-striped table-bordered table-hover table-condensed table-list'])[1]//tr/td[1]");
	By papulatioBy = By.xpath(
			"(//table[@class='table table-striped table-bordered table-hover table-condensed table-list'])[1]//tr/td[2]");
	By moveTableBy = By.xpath("//h2[text()='World Population (2020 and historical)']");
	List<WebElement> listYear;
	List<WebElement> listPopulation;
	Map<String, String> map;
	String path = "\\src\\test\\java\\worldPopulation\\years\\";
	String base;
	File file1;

	@Test
	void mainMethod() throws IOException {
		moveTheElement(moveTableBy);
		createFolders(yearBy);
		// mapset();
		// createTextFile();
		BaseTest.closeDriver();
	}

	void createFolders(By xpath) throws IOException {

		listYear = driver.findElements(xpath);
		listPopulation = driver.findElements(papulatioBy);

		for (int i = 0; i < listYear.size(); i++) {
			Properties prop = new Properties();

			String year = listYear.get(i).getText();

			base = System.getProperty("user.dir");
			// base.replace("\\","\");
			File file2 = new File(base + path + year);
			System.out.println(base + path + year);
			file2.mkdirs();

			file1 = new File(file2.getAbsolutePath() + "\\demo.properties");
			System.out.println(file2.getAbsolutePath() + "\\demo.properties");
			// file1.mkdirs();
			file1.createNewFile();

//			FileWriter myWriter = new FileWriter("filename.txt");// create text file object
//			myWriter.write("population " + listPopulation.get(i).getText());
//			myWriter.close();
			// String base = System.getProperty("user.dir") +
			// "/src/test/java/worldPopulation/years/";
			FileInputStream fci = new FileInputStream(file1);

			prop.load(fci);
			prop.put("Population", listPopulation.get(i).getText());
			FileOutputStream fco = new FileOutputStream(file1);
			prop.store(fco, "comment");
			fci.close();
			fco.close();

		} // for
	}// createFolders method

	void moveTheElement(By xpath) {
		BaseTest.launchBrowser("chrome");
		driver = BaseTest.driver;
		driver.get("https://www.worldometers.info/world-population/");
		WebElement element = driver.findElement(xpath);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}// moveTheElement method

	void createTextFile() throws IOException {
		Properties prop = new Properties();
		for (int i = 0; i < listYear.size(); i++) {
			String yearNumber = listYear.get(i).getText();

			file1 = new File(base + path + yearNumber + "\\demo.properties");
			System.out.println(base + path + yearNumber + "\\demo.properties");
			file1.createNewFile();

			// String base = System.getProperty("user.dir") +
			// "/src/test/java/worldPopulation/years/";
			FileInputStream fci = new FileInputStream(file1);

			prop.load(fci);
			prop.put("Population", map.get(yearNumber));
			FileOutputStream fco = new FileOutputStream(file1);
			prop.store(fco, "comment");
			fci.close();
			fco.close();

		} // for

	}// method

	void mapset() {
		map = new HashMap<>();
		listPopulation = driver.findElements(papulatioBy);
		// listYear=driver.findElements(yearBy);//need to comment
		for (int i = 0; i < listYear.size(); i++) {
			map.put(listYear.get(i).getText(), listPopulation.get(i).getText());
//            System.out.println(map.toString());

		}
	}// map

}
