package seleniumscripts;

import java.io.IOException;

public class Orangehrmlive {
	public static void m1(String str) {

		System.out.println("String");
	}

	public static void m1(Object o) {
		System.out.println("Object");
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		int n = 'A';
		m1(n);

		// WebDriver driver = null;
		// BaseTest.launchBrowser();
		//
		// driver = BaseTest.driver;
		//
		// driver.get("https://opensource-demo.orangehrmlive.com");
		//
		// driver.findElement(By.name("username")).sendKeys("Admin");
		// driver.findElement(By.name("password")).sendKeys("admin123");
		//
		// driver.findElement(By.xpath("//button[@type='submit']")).click();
		//
		// // Thread.sleep(2000);
		// BaseTest.quitbrowser();
	}

}
