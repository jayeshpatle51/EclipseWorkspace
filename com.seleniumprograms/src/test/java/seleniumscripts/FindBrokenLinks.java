package seleniumscripts;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FindBrokenLinks extends Setup {

	@Test
	public void findBrokenLinks() {

		// https://demoqa.com/broken
		String homePage = "https://demoqa.com/broken";
		String url = "";

		driver.get(homePage);

		List<WebElement> links = driver.findElements(By.tagName("a"));

		Iterator<WebElement> it = links.iterator();

		while (it.hasNext()) {

			url = it.next().getAttribute("href");

			// System.out.println(url);


			verifyLinks(url);
		}

	}

	public static void verifyLinks(String linkUrl) {
		try {
			URL url = new URL(linkUrl);

			// Now we will be creating url connection and getting the response code
			HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();

			httpURLConnect.setConnectTimeout(5000);
			httpURLConnect.connect();
			if (httpURLConnect.getResponseCode() >= 400) {

				System.out.println(linkUrl + " - " + httpURLConnect.getResponseCode() + " "
						+ httpURLConnect.getResponseMessage() + "is a broken link");
			}

			// Fetching and Printing the response code obtained
			else {
				System.out.println(linkUrl + " - " + httpURLConnect.getResponseMessage());
			}
		} catch (Exception e) {

			System.out.println(linkUrl + "  url is not valid");
		}
	}
}
