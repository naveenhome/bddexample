package test.java;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.input.CharSequenceReader;
import org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.deps.com.thoughtworks.xstream.converters.extended.CharsetConverter;

public class TestSelenium {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "http://ata123456789123456789.appspot.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void testUntitled() throws Exception {
   
    driver.get("http://ata123456789123456789.appspot.com/");
    driver.findElement(By.id("ID_nameField1")).clear();
    driver.findElement(By.id("ID_nameField1")).sendKeys("30");
    driver.findElement(By.id("ID_nameField2")).clear();
    driver.findElement(By.id("ID_nameField2")).sendKeys("40");
    driver.findElement(By.id("gwt-uid-1")).click();
    driver.findElement(By.id("ID_calculator")).click();
  }

  @After
  public void tearDown() throws Exception {
    //driver.quit();
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
