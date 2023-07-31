package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class DriverUtils {

	public static String getPropertyvalue(String key) throws IOException {

		Properties prop = new Properties();

		File file = new File(
				"D:\\eclipse-workspace\\com.seleniumprograms\\src\\main\\resources\\resources\\config.properties");
		InputStream input = new FileInputStream(file);
		prop.load(input);

		String value = prop.getProperty(key);

		input.close();
		return value;

	}

	public static void setPropertyvalue(String key, String value) throws IOException {

		Properties prop = new Properties();

		File file = new File(
				"D:\\eclipse-workspace\\com.seleniumprograms\\src\\main\\resources\\resources\\samplepro.properties");
		InputStream input = new FileInputStream(file);
		OutputStream output = new FileOutputStream(file);
		// FileWriter filewriter=new FileWriter(file);
		prop.load(input);

		prop.setProperty(key, value);
		prop.store(output, "setted");

		input.close();
		output.close();

	}

}
