package com.fluffy.universe.models.ui;// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class ProfileTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hedg3\\Downloads\\universe\\universe-master\\src\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void profile() {
    driver.get("http://127.0.0.1:7000/");
    driver.manage().window().setSize(new Dimension(1472, 1161));
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("sign-in__email")).sendKeys("alyashelya@gmail.com");
    driver.findElement(By.id("sign-in__password")).sendKeys("fEhCJixR65FrTDe!");
    driver.findElement(By.cssSelector(".form__button")).click();
    driver.findElement(By.cssSelector(".logo__img")).click();
    driver.findElement(By.cssSelector(".dropdown__icon")).click();
    driver.findElement(By.linkText("My profile")).click();
    driver.findElement(By.id("account__first-name")).click();
    driver.findElement(By.id("account__first-name")).sendKeys("Alina");
    driver.findElement(By.id("account__last-name")).click();
    driver.findElement(By.id("account__last-name")).click();
    driver.findElement(By.id("account__last-name")).sendKeys("Shelest");
    driver.findElement(By.id("account__gender")).click();
    {
      WebElement dropdown = driver.findElement(By.id("account__gender"));
      dropdown.findElement(By.xpath("//option[. = 'Female']")).click();
    }
    driver.findElement(By.id("account__birthday")).click();
    driver.findElement(By.id("account__birthday")).sendKeys("2001-02-26");
    driver.findElement(By.id("account__address")).click();
    driver.findElement(By.id("account__address")).sendKeys("street Sirka 37");
    driver.findElement(By.id("account__website")).click();
    driver.findElement(By.id("account__website")).sendKeys("https://alineriia");
    driver.findElement(By.cssSelector(".account-form")).click();
    driver.findElement(By.cssSelector(".button--fluid")).click();
    driver.findElement(By.cssSelector(".alert__button")).isDisplayed();
  }
}
