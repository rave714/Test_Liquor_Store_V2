package automation.pageobjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.runtime.Command;

public class register02 extends Command {

	By lnk_register = By.xpath("//a[text()='REGISTER']");	
    By tf_fname = By.xpath("//input[@name='fname']");
    By tf_lname = By.xpath("//input[@name='lname']");
    By rdo_gender = By.xpath("(//input[@name='gender'])[2]");
    By tf_email = By.xpath("//input[@name='email']");
    By tf_password = By.xpath("//input[@name='password']");
    By tf_cpassword = By.xpath("//input[@name='cpassword']");
    By btn_submit = By.xpath("//input[@name='submit']");
    
    By ele_ValidationText = By.xpath("//div[@class='banner']/p");
   // By ele_lblValidationText = By.xpath("//*[@id="welcome"]/p/text()");
		
    public void Register_link (WebDriver driver,String url ) throws IOException {
    	
		open(driver, url);
		
		
}

/*
 * public void navigateRegister(WebDriver driver) throws IOException {
 * click(driver, lnk_register); }
 */
    
		public void storeRe_details (WebDriver driver, String fname, String lname, String email, String password, String cpassword  ) throws IOException {
	
			click(driver, lnk_register);
			type(driver, tf_fname,fname);
			type(driver, tf_lname,lname);
			click(driver, rdo_gender);
			type(driver, tf_email,email);
			type(driver,tf_password,password);
			type(driver,tf_cpassword,cpassword);
			click(driver, btn_submit);
			
}
		
		
		public void store_verifydetails(WebDriver driver, String expectedText) throws IOException   {
			
			verifyByText(driver, ele_ValidationText, expectedText);
		}
		
		
}