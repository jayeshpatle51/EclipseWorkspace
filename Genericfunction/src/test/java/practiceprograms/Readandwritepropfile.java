package practiceprograms;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class Readandwritepropfile {

	public static void main(String[] args) throws IOException {

		File f = new File("D:\\eclipse-workspace\\Genericfunction\\src\\test\\java\\readandwrite.propeties");

		InputStream fi = new FileInputStream(f);

		Properties prop = new Properties();
		prop.load(fi);

		System.out.println(prop.getProperty("name"));
		prop.setProperty("name", "Vasant");
		prop.setProperty("status", "Active");
		prop.put("id", "234");

		OutputStream op = new FileOutputStream(f);
		prop.store(op, "");

		fi.close();
		op.close();
		System.out.println(prop.getProperty("name"));
	}

}
