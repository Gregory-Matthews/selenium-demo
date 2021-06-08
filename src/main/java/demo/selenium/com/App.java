package demo.selenium.com;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.*;
import org.testng.annotations.Test;
public class App
{
 @Test

 public static void main(String[] args) {


 System.setProperty("webdriver.gecko.driver","./geckodriver");
 FirefoxOptions options = new FirefoxOptions();
 WebDriver driver = new FirefoxDriver(options);

 System.out.println("Hi, Welcome to Edureka's YouTube Live session on Selenium WebDriver");


 driver.get("http://localhost:3001");
 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
 //driver.findElement(By.className("v-button")).click();
 driver.findElement(By.name("login")).click();
 driver.findElement(By.name("login")).sendKeys("su");
 driver.findElement(By.name("password")).sendKeys("gw");
 driver.findElement(By.name("click")).click();
 }
}
