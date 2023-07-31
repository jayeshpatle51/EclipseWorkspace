package dependenciesInTestng;

import org.testng.annotations.Test;

public class DependsOnTest {
	@Test(dependsOnMethods = { "OpenBrowser" })
	public void SignIn() throws Exception {
		System.out.println("User has signed in successfully");

	}

	@Test(enabled = false)
	public void OpenBrowser() {
		System.out.println("The browser is opened");
	}

	@Test(dependsOnMethods = { "OpenBrowser" })
	public void LogOut() throws Exception {
		System.out.println("The user logged out successfully");
	}
}