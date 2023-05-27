package automation.tests;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import automation.pageobjects.StoreRegister;
import automation.utils.Helper;



public class RegisterTest extends Helper {
	
//StoreHome
	/*
	 * @DataProvider public Object[][] dt_test001(){ return new Object[][] { new
	 * Object[] { "lable305@gmail.com","lable305"}, //new Object[] {
	 * "aaa","aaa","Paris", "New York", "September", "Blue Skies Airlines",
	 * "After flight finder - No Seats Avaialble"},
	 * 
	 * }; }
	 */

		
		@DataProvider
		public Object[][] dt_test01(){
			return new Object[][] {
			      new Object[]{ "Yoma","Rthna", "lyomal5@gmail.com", "305", "305","Welcome to Liquor Store!"},
			      
			      //new Object[] { "aaa","aaa","Paris", "New York", "September", "Blue Skies Airlines", "After flight finder - No Seats Avaialble"},
			};
	}

	
	
	
	////registerPage
	
	@Test(dataProvider = "dt_test01")
	public void test01 (String fname,String lname,String email,String password,String cpassword, String expectedValue) throws IOException {
		

		StoreRegister registerPage = new StoreRegister();
	
		registerPage.storeRegister_link(driver,"http://localhost/liquor-store-app-main/index.php");
		
		//registerPage.navigateRegister(driver);
		
		registerPage.storeRegister_details(driver, fname, lname, email, password, cpassword);
		registerPage.storeRegister_verifydetails(driver, expectedValue);
		
		
		//
		//Homepage.store_login(driver, "http://localhost/liquor-store-app-main/browse.php?drink=whiskey1", useremail, userpass);
		//registerPage.opensite(driver, "http://localhost/liquor-store-app-main/browse.php?drink=whiskey1");
		//registerPage.storeRegister_details(driver, fname, lname, email, password, cpassword, expectedValue);
		
		//registerPage.storeRegister_details(driver, expectedValue);
	
}
}