package com.abhibus.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GeneralActionsOnWebelement {

	public WebElement findELementByxpath(String path, WebDriver driver) {
		WebElement element =driver.findElement(By.xpath(path));
		return element;
		
	}
	public WebElement findELementByid(String path, WebDriver driver) {
		WebElement element =driver.findElement(By.id(path));
		return element;
		
	}
	public WebElement findELementByname(String path, WebDriver driver) {
		WebElement element =driver.findElement(By.name(path));
		return element;
		
	}
	public WebElement findELementBytagName(String path, WebDriver driver) {
		WebElement element =driver.findElement(By.tagName(path));
		return element;
		
	}
	public WebElement findElementBylinkText(String path, WebDriver driver) {
		WebElement element =driver.findElement(By.linkText(path));
		return element;
		
	}
	public WebElement findElementByPartialLinkText(String path, WebDriver driver) {
		WebElement element =driver.findElement(By.partialLinkText(path));
		return element;
		
	}
	public WebElement findElementByClassName(String path, WebDriver driver) {
		WebElement element =driver.findElement(By.className(path));
		return element;
		
	}
	public WebElement findELementByCssSelector(String path, WebDriver driver) {
		WebElement element =driver.findElement(By.cssSelector(path));
		return element;
		
	}
	public void elementClick(WebElement element) {
		
		element.click();
		
	}
public void elementSendKeys(WebElement element) {
		
		element.sendKeys();
		
	}
public void elementGetText(WebElement element) {
	
	element.getText();
	
}
	
}
