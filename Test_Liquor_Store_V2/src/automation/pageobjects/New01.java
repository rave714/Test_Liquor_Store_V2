package automation.pageobjects;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;


public class New01 {
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
  public void testNewTestCase() throws Exception {
    driver.get("http://localhost/liquor-store-app-main/");
    driver.findElement(By.linkText("REGISTER")).click();
    driver.findElement(By.name("fname")).click();
    driver.findElement(By.name("fname")).clear();
    driver.findElement(By.name("fname")).sendKeys("Kawidu");
    driver.findElement(By.name("lname")).click();
    driver.findElement(By.name("lname")).clear();
    driver.findElement(By.name("lname")).sendKeys("Fareelo");
    driver.findElement(By.xpath("//input[2]")).click();
    driver.findElement(By.name("email")).click();
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("kawid1i@gmail.com");
    driver.findElement(By.name("password")).click();
    driver.findElement(By.name("password")).clear();
    driver.findElement(By.name("password")).sendKeys("123");
    driver.findElement(By.name("cpassword")).click();
    driver.findElement(By.name("cpassword")).clear();
    driver.findElement(By.name("cpassword")).sendKeys("123");
    driver.findElement(By.name("submit")).click();
    driver.findElement(By.xpath("//div[@id='welcome']/h1")).click();
    driver.findElement(By.xpath("//div[@id='welcome']/h1")).click();
    driver.findElement(By.xpath("//div[@id='welcome']/h1")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='welcome']/h1 | ]]
    driver.findElement(By.xpath("//div[@id='welcome']/h1")).click();
    driver.findElement(By.xpath("//div[@id='welcome']/h1")).click();
    driver.findElement(By.xpath("//div[@id='welcome']/h1")).click();
    driver.findElement(By.xpath("//div[@id='welcome']/h1")).click();
    driver.findElement(By.xpath("//div[@id='welcome']/h1")).click();
    //ERROR: Caught exception [ERROR: Unsupported command [doubleClick | xpath=//div[@id='welcome']/h1 | ]]
    driver.findElement(By.xpath("//div[@id='welcome']/h1")).click();
    assertEquals(driver.findElement(By.xpath("//div[@id='welcome']/h1")).getText(), "Welcome to Liquor Store!");
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
