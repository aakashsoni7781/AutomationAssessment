/**
 * 
 */
package CoreIntegration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.swaglab.basic.Test;

/**
 * @author aakash.soni
 *
 */
public class CoreTestIntegration {
	  protected WebDriver test;
	    protected static final String URL = "https://www.saucedemo.com/";

	    @BeforeClass
	    public void openBrowser() {
	    	System.setProperty("webdriver.chrome.driver",".\\driver\\chromedriver.exe");
			test = new Test().getTest();
	        test.get(URL);
	        test.manage().window().maximize();
	        test.manage().deleteAllCookies();
	    }

	    @AfterClass
	    public void closeBrowser() {
	        test.quit();
	    }
}
