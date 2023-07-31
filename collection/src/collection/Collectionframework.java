package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.Spliterator;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.SkipException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
class Customdataprovider{
	
}

public class Collectionframework {
	@Test(dataProvider="LoginDataprovider",dataProviderClass=Custom.class)
	public void LoginTest(String email,String pwd) {
		System.out.println(email+ "  "+ pwd);
		system.out.println(" email is updated");
		
	}
	

	     
		}



