package automation.pageobjects;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
;

public class loog {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\DELL\\eclipse-workspace\\ONLINE_liquor_store\\libraries\\chromedriver.exe");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testHomepage() throws Exception {
    driver.get("http://localhost/liquor-store-app-main/browse.php?drink=whiskey1");
    driver.findElement(By.linkText("SIGN IN")).click();
    driver.get("http://localhost/liquor-store-app-main/login.php");
    driver.findElement(By.name("useremail")).click();
    driver.findElement(By.name("useremail")).clear();
    driver.findElement(By.name("useremail")).sendKeys("lable305@gmail.com");
    driver.findElement(By.name("userpass")).click();
    driver.findElement(By.name("userpass")).clear();
    driver.findElement(By.name("userpass")).sendKeys("lable305");
    driver.findElement(By.name("submit")).click();
    driver.get("http://localhost/liquor-store-app-main/index.php");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("//div[@id='user-area']/ul")).click();
    driver.findElement(By.linkText("MY ACCOUNT")).click();
    driver.get("http://localhost/liquor-store-app-main/account.php");
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1] | ]]
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).click();
    assertEquals(driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='LOG OUT'])[1]/following::h1[1]")).getText(), "My Account");
  }

  @AfterClass(alwaysRun = true)
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
