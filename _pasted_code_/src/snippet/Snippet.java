package snippet;

public class Snippet {
	public static void scrolldowntoelement(WebDriver driver,WebElement element) {
	    	JavascriptExecutor js=((JavascriptExecutor)driver);
	    	js.executeScript("arguments[0].scrollIntoView();",element);
	    }
}

