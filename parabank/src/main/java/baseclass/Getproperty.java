package baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Getproperty {
	public  Properties prop;
	
//	public Getproperty(){
//		try {
//			prop = new Properties();
//			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/resources/config_properties/config.properties");
//			prop.load(ip);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		String str=prop.getProperty("browser");
//		System.out.println(str);
//	}
	public void method1() {
		try {
			prop = new Properties();
			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/resources/config_properties/config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String str=prop.getProperty("browser");
		System.out.println(str);
	}
	public static void main(String[] args) {
		Getproperty get= new Getproperty();
//		String str=get.prop.getProperty("browser");
//		System.out.println(str);
		get.method1();
//		try {
//			prop = new Properties();
//			FileInputStream ip = new FileInputStream(System.getProperty("user.dir")+ "/src/main/resources/config_properties/config.properties");
//			prop.load(ip);
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		String str=prop.getProperty("browser");
//		System.out.println(str);
	}

}
