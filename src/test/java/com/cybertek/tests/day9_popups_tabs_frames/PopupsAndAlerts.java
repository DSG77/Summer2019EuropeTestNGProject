package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PopupsAndAlerts {

    WebDriver driver; //we assigned the WebDriver driver one time to clear errors(or red corrections) of driver words following methods

    @BeforeMethod
    public void setUpMethod(){
       driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
    @Test
    public void test1() {
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
        //locating and clicking on one line //  //*[.='Destroy the World'] thisis to locate destroy the world popup things
        driver.findElement(By.xpath("//*[.='Destroy the World']")).click();
        //locating No button and clicking it  //*[text()='No']
        driver.findElement(By.xpath("//*[text()='No']")).click();
    }
    @Test
    public void test2() throws InterruptedException {
     driver.get("http://practice.cybertekschool.com/javascript_alerts");

    //click for JS alert
        driver.findElement(By.xpath("//button[1]")).click();
        //controlling alert by using with Alert Class
        Alert alert = driver.switchTo().alert();
        Thread.sleep(2000);
        //accepting alert clicking ok in the alerts
        alert.accept();
        Thread.sleep(2000);
        //clicking JS Confirm
        driver.findElement(By.xpath("//button[2]")).click();
        Thread.sleep(2000);
        alert.dismiss();
        //clicking JS Prompt
        driver.findElement(By.xpath("//button[3]")).click();
        //SendKeys()  to send some keys
        Thread.sleep(1000);
        alert.sendKeys("Mike Smith");
        //When we send the text, we might not see the text in the inputbox.
        Thread.sleep(500);
        alert.accept();







    }
}
