package com.cybertek.tests.day9_popups_tabs_frames;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class iframes {
    WebDriver driver; //we assigned the WebDriver driver one time to clear errors(or red corrections) of driver words following methods

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
    }

    @AfterMethod
    public void tearDownMethod() throws InterruptedException {
        Thread.sleep(3000);
      //  driver.quit();
    }

    @Test
    public void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/iframe");

        //HOW TO SWITCH FRAMES
        driver.switchTo().frame("mce_0_ifr");

        //clear the text inside box
        driver.findElement(By.id("tinymce")).clear();
       //locate and send text
        driver.findElement(By.id("tinymce")).sendKeys("We used name or ID");

        //go back to first frame, useful when we have switched multiple frames
        driver.switchTo().defaultContent();
        Thread.sleep(2000);

        //2. second way to switch using index
        driver.switchTo().frame(0);
        //clear the text inside box
        driver.findElement(By.id("tinymce")).clear();
        //locate and send text
        driver.findElement(By.id("tinymce")).sendKeys("We used index here");

        // go back to first frame , only to parent
        driver.switchTo().parentFrame();

        //3. using WebElement
        WebElement frameElement = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frameElement);

        driver.findElement(By.id("tinymce")).clear();
        //locate and send text
        driver.findElement(By.id("tinymce")).sendKeys("We located with WebElement");



    }
    @Test
    public void multipleFrames(){
        driver.get("http://practice.cybertekschool.com/nested_frames");
        //switching to frame top
        driver.switchTo().frame("frame-top");
        //frame top has 3 childen frame , left middle and right
        //switching to middle frame
        driver.switchTo().frame("frame-middle");
        //get the middle text and print it
        System.out.println(driver.findElement(By.id("content")).getText());
        //go back to parent (top frame) to switch right
        driver.switchTo().parentFrame();
        //switching right using index
        driver.switchTo().frame(2);
        //print right from right frame
        System.out.println(driver.findElement(By.tagName("body")).getText());
        //go up to top level html directly
        driver.switchTo().defaultContent();
        //switch to frame bottom
        driver.switchTo().frame(1);
        System.out.println(driver.findElement(By.tagName("body")).getText());



    }
}