package automation.tests;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.URL;

import org.testng.annotations.Test;

import automation.pageobjects.StoreHome;
import automation.pageobjects.Store_login;
import automation.utils.Helper;

public class StoreLoginTest extends Helper {
	
	
	@Test()
	public void test011() throws IOException {
		
		
	
		Store_login Loginpage =new Store_login();
			Loginpage.storeRLogin_link(driver, "http://localhost/liquor-store-app-main/index.php");
			
			Loginpage.store_loginToApp(driver, "lable305@gmail.com", "lable305");
			Loginpage.Loginpage_verify(driver, "Welcome to Liquor Store!");
			
			
			
	
			
			
		
		
		}
	
		
}
	
	



