package practiceprograms;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class Bursa {

	String code;
	String Name;
	double Lastdone;
	String Change;
	long Vol;

	Bursa(String code, String Name, double Lastdone, String Change, long Vol) {
		this.code = code;
		this.Name = Name;
		this.Lastdone = Lastdone;
		this.Change = Change;
		this.Vol = Vol;
	}

	@Override
	public String toString() {

		return "\n" + code + "  |  " + Name + "  |  " + Lastdone + "  |  " + Change + "   | " + Vol;

	}
}

class SortByChange implements Comparator<Bursa> {

	@Override
	public int compare(Bursa o1, Bursa o2) {
		try {
			if (Double.parseDouble(o1.Change) > Double.parseDouble(o2.Change)) {
				return 1;
			} else if (Double.parseDouble(o1.Change) < Double.parseDouble(o2.Change)) {
				return -1;
			} else {
				return 0;
			}
		} catch (Exception e) {
			return -1;
		}
	}
}

class SortByVol implements Comparator<Bursa> {

	@Override
	public int compare(Bursa o1, Bursa o2) {
		if (o1.Vol > o2.Vol) {
			return 1;
		} else if (o1.Vol < o2.Vol) {
			return -1;
		} else {
			return 0;
		}
	}

}

class SortByCode implements Comparator<Bursa> {

	@Override
	public int compare(Bursa o1, Bursa o2) {
		if (o1.code.compareTo(o2.code) >= 1) {
			return 1;
		} else if (o1.code.compareTo(o2.code) < 0) {
			return -1;
		} else {
			return 0;
		}
	}

}

public class Bursamalasiya {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		driver.get("https://www.bursamalaysia.com/");

		By code = By.xpath("//div[@id='pills-active']//tbody//tr//td[1]");
		By Name = By.xpath("//div[@id='pills-active']//tbody//tr//th//a");
		By Lastdone = By.xpath("//div[@id='pills-active']//tbody//tr//td[2]");
		By Change = By.xpath("//div[@id='pills-active']//tbody//tr//td[3]");
		By Vol = By.xpath("//div[@id='pills-active']//tbody//tr//td[4]");

		List<WebElement> Codelist = driver.findElements(code);
		List<WebElement> NameList = driver.findElements(Name);
		List<WebElement> Lastdonelist = driver.findElements(Lastdone);
		List<WebElement> Changelist = driver.findElements(Change);
		List<WebElement> Vollist = driver.findElements(Vol);
		List<Bursa> bursalist = new ArrayList<Bursa>();
		List<String> dash = new ArrayList<String>();

		for (int i = 0; i < Codelist.size(); i++) {
			try {
				bursalist.add(new Bursa(Codelist.get(i).getText(), NameList.get(i).getText(),
						Double.parseDouble(Lastdonelist.get(i).getText()), Changelist.get(i).getText(),
						Long.parseLong(Vollist.get(i).getText().replace(",", ""))));
			} catch (Exception e) {
				dash.add(Changelist.get(i).getText());
			}
		}

		System.out.println("Before sorting Table : ");
		for (int j = 0; j < bursalist.size(); j++) {
			System.out.println(bursalist.get(j));
		}

		Collections.sort(bursalist, new SortByChange());

		System.out.println("\nAfter sorting Table : ");
		for (int j = 0; j < bursalist.size(); j++) {
			System.out.println(bursalist.get(j));
		}

		Thread.sleep(1000);
		driver.quit();

	}

}
