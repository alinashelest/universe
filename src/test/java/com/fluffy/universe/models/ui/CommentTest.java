package com.fluffy.universe.models.ui;// Generated by Selenium IDE

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.Map;
public class CommentTest {
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
  public void comment() {
    driver.get("http://127.0.0.1:7000/");
    driver.manage().window().setSize(new Dimension(1038, 655));
    driver.findElement(By.linkText("Sign in")).click();
    driver.findElement(By.id("sign-in__email")).sendKeys("alyashelya@gmail.com");
    driver.findElement(By.id("sign-in__password")).sendKeys("fEhCJixR65FrTDe!");
    driver.findElement(By.id("sign-in__email")).click();
    driver.findElement(By.cssSelector(".form__button")).click();
    driver.findElement(By.linkText("New post")).click();
    driver.findElement(By.cssSelector(".post-form__title")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".post-form__title"));
      js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'post title'}", element);
    }
    driver.findElement(By.cssSelector(".post-form__description")).click();
    {
      WebElement element = driver.findElement(By.cssSelector(".post-form__description"));
      js.executeScript("if(arguments[0].contentEditable === 'true') {arguments[0].innerText = 'post body'}", element);
    }
    driver.findElement(By.cssSelector(".post-form__button:nth-child(2)")).click();
    driver.findElement(By.cssSelector(".alert__button")).click();
    driver.findElement(By.linkText("Read more")).click();
    driver.findElement(By.cssSelector(".comment-form__textarea")).click();
    driver.findElement(By.cssSelector(".comment-form__textarea")).sendKeys("comment added");
    driver.findElement(By.cssSelector(".comment-form__button:nth-child(1)")).click();

    driver.findElement(By.xpath("/html/body/main/div/div/div/div/p[text()='comment added']"+"")).isDisplayed();
  }
}
