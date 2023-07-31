package com.Ecommerce;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.Ecommerce.Pages.NewUserRegistrationpage;

import BaseClasses.Baseclass;

public class NewUserRegistration extends Baseclass {

	NewUserRegistrationpage page;

	@BeforeTest
	public void launchBrowser() throws IOException {

		Baseclass.initialization();
		page = new NewUserRegistrationpage(driver);
	}

	@Test(dataProvider="UserData")
	public void newUserRegistration(String arr[]) throws InterruptedException {

		page.newUserRegistration(arr);

		Thread.sleep(5000);
	}

	@AfterTest
	public void closeBrowser() {
		Baseclass.closebrowser();

	}

	@DataProvider(name="UserData")
	public String[][] dataProvider() {
		String  arr [][]=new String[6][1];
		
			
		arr[0][0]="Jon";
		arr[0][1]="Patel";
	    arr[0][2]="jon123@gmail.com";
		arr[0][3]="9823245097";
		arr[0][1]="902177Jit#";
		arr[0][1]="902177Jit#";
		
		return arr;
	}
}
