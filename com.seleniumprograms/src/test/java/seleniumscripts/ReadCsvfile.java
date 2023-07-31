package seleniumscripts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

import org.testng.annotations.Test;

import com.opencsv.CSVReader;

public class ReadCsvfile {

	@Test(enabled = false)
	public static void getCsvUsingscanner() throws FileNotFoundException {

		Scanner sc = new Scanner(new File("D:\\JsProject\\UserData.csv"));
		sc.useDelimiter(",");
		while (sc.hasNext())
		{
			System.out.print(sc.next());
		}
		sc.close(); // closes the scanner
	}

	@Test(enabled = true)
	public static void readusingOpenCsv() {

		CSVReader reader = null;
		try {
			// parsing a CSV file into CSVReader class constructor
			reader = new CSVReader(new FileReader("D:\\JsProject\\UserData.csv"));
			String[] nextLine;
			// reads one line at a time
			while ((nextLine = reader.readNext()) != null) {
				for (String token : nextLine) {
					System.out.print(token);
				}
				System.out.print("\n");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
