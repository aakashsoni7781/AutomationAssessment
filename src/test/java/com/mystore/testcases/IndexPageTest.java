/**
 * 
 */
package com.mystore.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.mystore.base.BaseClass;
import com.mystore.pageobjects.IndexPage;



/**
 * @author aakash.soni
 *
 */
public class IndexPageTest extends BaseClass {
	private IndexPage indexPage;
    
	@Parameters("browser")
	@BeforeMethod
	public void setup(String browser) {
		launchApp(browser); 
		
	}
	
	@AfterMethod
	public void tearDown() {
		getDriver().quit();
	}
	
	@Test
	public void verifyLogo() throws Throwable {
		
		indexPage= new IndexPage();
		boolean result=indexPage.validateLogo();
		Assert.assertTrue(result);
	
	}
	
	@Test
	public void verifyTitle() {
	
		String actTitle=indexPage.getMyStoreTitle();
		Assert.assertEquals(actTitle, "My Store1");
		
	}

	
}