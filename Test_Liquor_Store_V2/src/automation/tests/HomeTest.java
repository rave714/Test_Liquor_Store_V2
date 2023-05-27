package automation.tests;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import automation.pageobjects.StoreHome;

import automation.utils.Helper;



public class HomeTest extends Helper {
	

		
		
	

	@Test()
	public void test1()throws IOException  {
		
		
	
		StoreHome Homepage =new StoreHome();
		//Homepage.openCalculatorHome(driver, "http://localhost/liquor-store-app-main/browse.php?drink=whiskey1");
		Homepage.navigatehomepage(driver, "http://localhost/liquor-store-app-main/index.php");
		Homepage.Homepage_verify(driver, "Welcome to Liquor Store, Sri Lanka's premier destination for premium wines and spirits. Our website serves as a gateway to our concierge service and retail chain, both of which are dedicated to providing you with an unparalleled selection of the finest alcoholic beverages from around the world.");

}
	
	
	
		
	
}
