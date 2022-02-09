/**
 * 
 */
package com.swaglab.productcarttest;

import org.testng.annotations.Test;
import com.swaglab.functions.CheckoutPageFunction;
import com.swaglab.functions.IndexPageFunction;
import com.swaglab.functions.LastPageFunction;
import com.swaglab.functions.ProductCartPageFunction;
import com.swaglab.functions.ProductOverviewPageFunction;
import com.swaglab.functions.ProductPageFunction;
import com.swaglab.functions.SubmitPageFunction;

import CoreIntegration.CoreTestIntegration;

/**
 * @author aakash.soni
 *
 */
public class ProcuctCartTest extends CoreTestIntegration {
	
	IndexPageFunction login;
	ProductPageFunction product;
	ProductCartPageFunction cart;
	CheckoutPageFunction checkout;
	ProductOverviewPageFunction overview;
	SubmitPageFunction complete;
	LastPageFunction removal;
	
	@Test(priority = 1)
	public void function() {
		
		login = new IndexPageFunction(test);
		product = new ProductPageFunction(test);
		cart = new ProductCartPageFunction(test);
		checkout = new CheckoutPageFunction (test);
		overview = new ProductOverviewPageFunction(test);
		complete = new SubmitPageFunction(test);
		removal= new LastPageFunction(test);
	}
	@Test(priority = 2)
    public void Case1_verify_site() throws InterruptedException{   	
		 login.verifySite();
    	Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void Case2_login() throws InterruptedException{   	
    	login.enterUsernamesList();  // For username, password and login
    	Thread.sleep(2000);
    }

    @Test(priority = 4)
    public void Case3_Add_item()throws InterruptedException{   	
    	product.clickOnAddToCart();
    	Thread.sleep(2000);
    }

    @Test(priority = 5)
    public void Case4_Cart_verify_item()throws InterruptedException {
    	product.clickOnCart();
    	cart.nameCheck();
    	cart.priceCheck();
    	cart.clickOnCheckOut();
    	Thread.sleep(2000);
    }
    
    @Test(priority = 6)
    public void Case5_fill_form() throws InterruptedException {
    	checkout.enterFirstName("Aakash");
    	Thread.sleep(2000);
    	checkout.enterLastName("Soni");
    	Thread.sleep(2000);
    	checkout.enterPostalCode("841226");
    	Thread.sleep(2000);
    	checkout.clickOnContinue();
    	Thread.sleep(2000);

    }
    @Test(priority = 7)
    public void Case6_finish() throws InterruptedException {
    	overview.ClickOnFinish();
    	Thread.sleep(2000);

    }
    
    @Test(priority = 8)
    public void Case7_Homebtn() throws InterruptedException {
    	complete.ClickOnHome();
    	Thread.sleep(2000);

    }
    //Issue
    @Test(priority = 9)
    public void Case8_removed() {
    	removal.clickOnCart();
    	removal.checkitem();
    }
}
