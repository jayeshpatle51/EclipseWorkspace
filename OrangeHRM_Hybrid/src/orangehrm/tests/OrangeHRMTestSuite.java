package orangehrm.tests;

import org.testng.annotations.Test;
import java.io.IOException;



import orangehrm.library.Employee;
import orangehrm.library.LoginPage;
import orangehrm.library.User;
import utils.AppUtils;
import utils.XLUtils;

public class OrangeHRMTestSuite extends AppUtils 
{

	String keywordfile = "C:\\Users\\SPURGE\\eclipse-workspace\\OrangeHRM_Hybrid\\keywordfiles\\OrangeHRMKeywords.xlsx"; 
	String tcsheet = "TestCases";
	String tssheet = "TestSteps";
	
	
	@Test
	public void checkOrangeHRM() throws IOException, InterruptedException
	{
	
			int tccount = XLUtils.getRowCount(keywordfile, tcsheet);
			int tscount = XLUtils.getRowCount(keywordfile, tssheet);
		
			String tcexeflag,tcid,tstcid,keyword,tsres,tcres;
			 			
			String adminuid,adminpwd;
			String fname,lname;
			String role,empname,empuid,emppwd;			
			
			boolean res = false;
			
			LoginPage lp = new LoginPage();
			Employee emp = new Employee();
			User us = new User();
			
			for(int i=1;i<=tccount;i++)
			{
				tcexeflag = XLUtils.getStringCellData(keywordfile, tcsheet, i, 2);
				if(tcexeflag.equalsIgnoreCase("y"))
				{
					tcid = XLUtils.getStringCellData(keywordfile, tcsheet, i, 0);
					for(int j=1;j<=tscount;j++)
					{
						tstcid = XLUtils.getStringCellData(keywordfile, tssheet, j, 0);
						if(tcid.equalsIgnoreCase(tstcid))
						{
							keyword = XLUtils.getStringCellData(keywordfile, tssheet, j, 4);
							switch (keyword.toLowerCase()) 
							{
							case "adminlogin":
								
								adminuid = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
								adminpwd = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
								lp.login(adminuid, adminpwd);
								res = lp.isAdminModuleDisplayed();
								break;
							case "logout":
								res = lp.logout();
								break;
							case "newempreg":
								fname = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
								lname = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
								res = emp.addEmployee(fname, lname);
								break;
							case "newuserreg":
								role = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
								empname = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
								empuid = XLUtils.getStringCellData(keywordfile, tssheet, j, 7);
								emppwd = XLUtils.getStringCellData(keywordfile, tssheet, j, 8);
								us.navigateToUserRegPage();
								res = us.addUser(role, empname, empuid, emppwd);
								break;
							case "emplogin":
								empuid = XLUtils.getStringCellData(keywordfile, tssheet, j, 5);
								emppwd = XLUtils.getStringCellData(keywordfile, tssheet, j, 6);
								lp.login(empuid, emppwd);
								res = lp.isEmployeeModuleDisplayed();
								break;
							}
							
							// Code to update Test Step Result
							if(res)
							{
								tsres = "Pass";
								XLUtils.setCellData(keywordfile, tssheet, j, 3, tsres);
								XLUtils.fillGreenColor(keywordfile, tssheet, j, 3);
							}else
							{
								tsres = "Fail";
								XLUtils.setCellData(keywordfile, tssheet, j, 3, tsres);
								XLUtils.fillRedColor(keywordfile, tssheet, j, 3);
							}
							
							// Code to update Test Case Result
							tcres = XLUtils.getStringCellData(keywordfile, tcsheet, i, 3);
							if(!tcres.equalsIgnoreCase("fail"))
							{
								XLUtils.setCellData(keywordfile, tcsheet, i, 3, tsres);
							}
							
							//To fill Colors
							tcres = XLUtils.getStringCellData(keywordfile, tcsheet, i, 3);
							if(tcres.equalsIgnoreCase("pass"))
							{
								XLUtils.fillGreenColor(keywordfile, tcsheet, i, 3);
							}else
							{
								XLUtils.fillRedColor(keywordfile, tcsheet, i, 3);
							}
							
						}
					}
					
				}else
				{
					XLUtils.setCellData(keywordfile, tcsheet, i, 3, "Blocked");
					XLUtils.fillRedColor(keywordfile, tcsheet, i, 3);
				}
			}		
		
	}	
	
}
