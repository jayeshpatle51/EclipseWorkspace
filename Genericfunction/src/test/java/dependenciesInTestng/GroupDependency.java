package dependenciesInTestng;

import org.testng.annotations.Test;

public class GroupDependency {
	@Test(dependsOnGroups = { "SignIn" }, alwaysRun = false)
	public void ViewAcc() {
		System.out.println("SignIn Successful");
	}

	@Test(groups = { "SignIn" })
	public void LogIn() {

		int div = 7 / 0;
		System.out.println("Logging In Success");
	}

//	@Test( groups = { "SignIn" })
//	public void openBrowser() {
//		System.out.println("Open browser");
//	}
}
