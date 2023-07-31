package dependenciesInTestng;

import org.testng.annotations.Test;

public class Dependent {

	@Test(dependsOnMethods = "OpenBrowser", alwaysRun = false)
	public void ASignIn() {
		System.out.println("This will execute second (SignIn)");
	}

	@Test()
	public void OpenBrowser() {
		System.out.println("This will execute first (Open Browser)");
		int div = 6 / 0;
	}
}
