package AppStudents;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Instant;
import java.util.Date;
import java.util.UUID;

public class AppStudentsTest {
    WebDriver driver;
    String uniqueName;
    String unixTimeStampPhone;
    long unixTimeStamp;
    @Test
    public void checkMethod(){
    System.setProperty("webdriver.chrome.driver","c:/testing/chromedriver.exe");
    driver = new ChromeDriver();
    unixTimeStamp = Instant.now().getEpochSecond();
    uniqueName = UUID.randomUUID().toString();
    unixTimeStampPhone = Long.toString(unixTimeStamp);
    driver.get("http://151.80.70.42:3000/");
    driver.findElement(By.cssSelector("i.mdi-content-add")).click();
    driver.findElement(By.cssSelector("div.main-content input#icon_prefix")).clear();
    driver.findElement(By.cssSelector("div.main-content input#icon_prefix")).sendKeys(uniqueName);
    driver.findElement(By.cssSelector("div.main-content input#icon_telephone")).clear();
    driver.findElement(By.cssSelector("div.main-content input#icon_telephone")).sendKeys(unixTimeStampPhone);
    driver.findElement(By.cssSelector("div.col>a.btn")).click();
    }
//    just in case
//    @AfterClass
//    public void afterMethod(){
//    driver.quit();
//    }
}
