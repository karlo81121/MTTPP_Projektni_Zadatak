package com.example.FunctionalitySuite;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.testng.annotations.*;
import static org.testng.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.io.File;
import org.apache.commons.io.FileUtils;

public class ItemCheckout {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
  private JavascriptExecutor js;

  @BeforeClass(alwaysRun = true)
  public void setUp() throws Exception {
    System.setProperty("webdriver.chrome.driver", "");
    driver = new ChromeDriver();
    baseUrl = "https://www.google.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    js = (JavascriptExecutor) driver;
  }

  @Test
  public void testItemCheckout() throws Exception {
    driver.get("http://demowebshop.tricentis.com/");
    driver.findElement(By.xpath("//div[3]/div/div/a/img")).click();
    driver.findElement(By.id("add-to-cart-button-31")).click();
    driver.findElement(By.xpath("//li[@id='topcartlink']/a/span")).click();
    driver.findElement(By.id("termsofservice")).click();
    driver.findElement(By.id("checkout")).click();
    driver.findElement(By.id("Email")).clear();
    driver.findElement(By.id("Email")).sendKeys("adzic@gmail.com");
    driver.findElement(By.id("Password")).clear();
    driver.findElement(By.id("Password")).sendKeys("12345678");
    driver.findElement(By.xpath("//input[@value='Log in']")).click();
    driver.findElement(By.id("checkout")).click();
    driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Terms of service'])[1]/following::button[1]")).click();
    driver.findElement(By.id("termsofservice")).click();
    driver.findElement(By.id("checkout")).click();
    driver.findElement(By.xpath("//input[@value='Continue']")).click();
    driver.findElement(By.xpath("//div[@id='shipping-buttons-container']/input")).click();
    driver.findElement(By.xpath("//div[@id='shipping-method-buttons-container']/input")).click();
    driver.findElement(By.xpath("//div[@id='payment-method-buttons-container']/input")).click();
    driver.findElement(By.xpath("//div[@id='payment-info-buttons-container']/input")).click();
    driver.findElement(By.xpath("//input[@value='Confirm']")).click();
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
