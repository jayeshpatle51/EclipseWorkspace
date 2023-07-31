package collection;

import org.testng.annotations.DataProvider;

public class Custom {
	 @DataProvider(name="LoginDataprovider")
     public Object[][] getData(){
   	 Object[][] data= {{"abc@gmail.com", "abc"},{"xyz@gmail.com","xyz"}};
   	 return data;
     }
}
