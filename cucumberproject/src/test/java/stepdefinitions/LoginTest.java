package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilsclasses.ExcelReader;


public class LoginTest {
	
//	WebDriver driver=BaseClass.driver;
//	LoginPage lp=new LoginPage(driver);;
		

		

	
	

	
	
	@Given("I have given a {string}")
	public void i_have_given_a(String string) {
		// driver.get(string);
		System.out.println("URL is given " + string);
	}

	@Given("Provided username and password")
	public void provided_username_and_password(DataTable table) throws InterruptedException {
		List<Map<String,String>> list =table.asMaps();
		
		for(int i=0;i<list.size();i++) {
			//System.out.println(list.get(i).get("username")+" "+list.get(i).get("password"));
			System.out.println(list.get(i).get("username") + " " + list.get(i).get("password"));
//			lp.Login(list.get(i).get("username"),list.get(i).get("password"));
//			Thread.sleep(3000);
//			lp.loginbtnclick();
//			lp.Logout();
//			driver.switchTo().alert().accept();
//			driver.switchTo().defaultContent();
		}
	}
	@Given("Provided username1 and password2")
	public void provided_username1_and_password2(DataTable table) throws InterruptedException {
		List<List<String>> list=table.asLists();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).get(0) + " " + list.get(i).get(1));

//			lp.Login(list.get(i).get(0),list.get(i).get(1));
//			Thread.sleep(3000);
		}
	}
	@And("Provided {string} and {string}")
	public void provided_username_and_password(String username,String password) {
		// lp.Login(username, password);
		System.out.println("Given username and password " + username + " " + password);
	}
	
	@Given("To Provide login Data from given {string} and {int}")
	public void to_provide_login_data_from_given_and(String sheetname, int rowno) throws IOException, InvalidFormatException {
	   //lp.Login(sheetname,rowno);
		//System.out.println(sheetname+" "+rowno);
		ExcelReader reader= new ExcelReader();
		List<Map<String,String>> logindata=reader.getData("D:\\excel\\DemoBankingSite.xlsx", sheetname);
		System.out.println(logindata.size());
		System.out.println(logindata);
		String username=logindata.get(rowno).get("UserName");
		String password=logindata.get(rowno).get("Password");
		// lp.Login(username, password);
		System.out.println(username+" "+password);
	}
	
	@Given("Provided username and password as {string}")
	public void provided_username_and_password(String str,DataTable dataTable) {
		
	  List<String> list=dataTable.values();
	   System.out.println(list.size());
	   System.out.println(list.get(0)+" "+list.get(1));
	   System.out.println(list);
	}
	
	
	
	@When("I click the login button")
	public void i_click_the_login_button() {
		
//		lp.loginbtnclick();
//		
//		if(GeneralActions.alertisPresent(driver)==true) {
//			driver.switchTo().alert().accept();
//			driver.switchTo().defaultContent();
//			Assert.assertTrue(false);
//			//asert.assertTrue(false);
//			// logger.warn("login failed");
//
//		}else {
//			//logger.info("login passed");
//			Assert.assertTrue(true);
//			
//		}
	}

	@Then("I should able to see User dashBoard")
	public void i_should_able_to_see_user_dash_board() {
		//Assert.assertTrue(lp.verifydashboard());
		//asert.assertTrue(lp.verifydashboard());
	}
	@When("I click on logout button")
	public void i_click_on_logout_button() {
//		lp.Logout();
//		driver.switchTo().alert().accept();
//		driver.switchTo().defaultContent();
	}

	@Then("I should see login page")
	public void i_should_see_login_page() {

		//Assert.assertTrue(lp.verifyLoginpage());
		//asert.assertTrue(lp.verifyLoginpage());
	}


}
