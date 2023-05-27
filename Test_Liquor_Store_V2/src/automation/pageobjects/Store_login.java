package automation.pageobjects;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import automation.runtime.Command;

public class Store_login extends Command {

	//input[@name='useremail']
	//input[@name='userpass']
	
	By lnk_signIn = By.xpath("//a[text()='SIGN IN']");
	By tf_UserName = By.xpath("//input[@name='useremail']");
	By tf_Password = By.xpath("//input[@name='userpass']");
	By btn_signIn = By.xpath("//input[@name='submit']");
	
	//div[@id='welcome']/h1
	
	//*[@id="welcome"]/h1
    By lValidationText = By.xpath("//*[@id=\"welcome\"]/h1");
		
    public void storeRLogin_link (WebDriver driver,String url ) throws IOException {
    	
		open(driver, url);
		
		
}
    
    public void store_loginToApp(WebDriver driver,String userName,String password) throws IOException {
		//open(driver, url);
    	click(driver, lnk_signIn);
		type(driver, tf_UserName, userName);
		type(driver, tf_Password, password);
		click(driver,btn_signIn);
	}
    

	public void Loginpage_verify(WebDriver driver, String expectedText) throws IOException   {
		//verifyByText(driver, ele_lblValidationText, expectedText);
		verifyByText(driver, lValidationText, expectedText);
	}

		
	/*
	 * public void storeRegister_verifydetails(WebDriver driver, String
	 * expectedText) throws IOException {
	 * 
	 * verifyByText(driver, ele_lblValidationText, expectedText); }
	 */
		
		
}