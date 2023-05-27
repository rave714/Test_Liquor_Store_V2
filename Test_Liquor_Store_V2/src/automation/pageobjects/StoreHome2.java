package automation.pageobjects;
import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.runtime.Command;


public class StoreHome2 extends Command {

	  
	  

	  By ele_lblValidationText = By.xpath("//*[@id=\"banner-text\"]");
	  
	  
	  
		public void navigatehomepage (WebDriver driver,String url) throws IOException {
			open(driver, url);
			
			
		
			
		}
		
		
		public void Homepage_verify(WebDriver driver, String expectedText) throws IOException   {
			//verifyByText(driver, ele_lblValidationText, expectedText);
			verifyByText(driver, ele_lblValidationText, expectedText);
		}
	
}
