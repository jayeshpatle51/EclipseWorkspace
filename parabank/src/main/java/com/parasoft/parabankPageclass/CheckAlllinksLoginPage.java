package com.parasoft.parabankPageclass;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.util.TestUtil;

import baseclass.TestBase;

public class CheckAlllinksLoginPage extends TestBase {
	
	@FindBy(xpath="//a")
	 List<WebElement> Alllinks; 
	
	public CheckAlllinksLoginPage() {
		
		PageFactory.initElements(driver, this);
	}

	public boolean checkvalidlinks() throws MalformedURLException,IOException {
		boolean b=false;
		for(int i=0;i<Alllinks.size();i++) {
			String str=Alllinks.get(i).getAttribute("href");
			TestUtil testlinks=new TestUtil();
			System.out.println(str);
			 b= testlinks.verifylink(str);
			
		}
		return b;
	}
	
}
