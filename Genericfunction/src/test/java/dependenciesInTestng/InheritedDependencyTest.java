package dependenciesInTestng;

import org.testng.annotations.Test;

class SuperClass
{
    @Test
    public void OpenBrowser() {
        System.out.println("BrowserOpened");
    }
}
 
public class InheritedDependencyTest extends SuperClass
{
    @Test(dependsOnMethods = { "OpenBrowser" })
    public void LogIn() {
        System.out.println("Logged In");
    }
}
