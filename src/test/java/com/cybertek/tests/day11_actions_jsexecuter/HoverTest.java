package com.cybertek.tests.day11_actions_jsexecuter;

import com.cybertek.utilities.WebDriverFactory;
//import jdk.swing.interop.SwingInterOpUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoverTest {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1() {
        driver.get("http://practice.cybertekschool.com/hovers");
        WebElement img = driver.findElement(By.tagName("img"));

        Actions actions = new Actions(driver);

        actions.moveToElement(img).perform();

        WebElement text = driver.findElement(By.xpath("//h5[.='name: user1']"));

        Assert.assertTrue(text.isDisplayed());
    }
    @Test
    public void test2() throws InterruptedException {

        for (int i = 1; i <4 ; i++) {
        driver.get("http://practice.cybertekschool.com/hovers");
        //creating dynamic xpath using i
        String imageXpath = "(//img)["+i+"]";
        System.out.println("imageXpath: "+imageXpath);
        //passing xpath to weblement
        WebElement img = driver.findElement(By.xpath(imageXpath));

        //creating actions object
        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        //hovering over on the image
        actions.moveToElement(img).perform();

        //creating dynamic xpath for the text
        String textXpath = "//h5[.='name: user"+i+"']";
        System.out.println("textXpath : " + textXpath);

        //passing xpath to webelement
        WebElement text = driver.findElement(By.xpath(textXpath));
        //verifying text is displayed
        Assert.assertTrue(text.isDisplayed());
        }
        }
        @Test
        public void StaleTest(){
            driver.get("http://google.com");
            WebElement input = driver.findElement(By.name("q"));
            input.sendKeys("Selenium" + Keys.ENTER);
            WebElement results = driver.findElement(By.id("resultStats"));
            Assert.assertTrue(results.isDisplayed());
            //go to google second time
            driver.navigate().back();
            input = driver.findElement(By.name("q"));
            input.sendKeys("Java"+Keys.ENTER);

        }

}