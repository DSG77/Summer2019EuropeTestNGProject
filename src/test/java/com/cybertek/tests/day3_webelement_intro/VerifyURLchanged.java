package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLchanged {

    /**
     * Verify URL changed
     * open browser
     * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     * enter any email
     * click on Retrieve password
     * verify that url changed to http://practice.cybertekschool.com/email_sent
     */
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");


        //enter any email

        WebElement emailInput = driver.findElement(By.name("email"));

        //sendKeys() send keydoards actions to webelement /enters given text
        emailInput.sendKeys("email@gmail.com");

        //locate to Password button
        WebElement retrivePasswordButton = driver.findElement(By.id("form_submit"));

        //click on retrive Password button
        retrivePasswordButton.click();

        //take the url
        String expectedUrl="http://practice.cybertekschool.com/email_sent";

        String actualUrl= driver.getCurrentUrl();

        if(expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedUrl =" + expectedUrl);
            System.out.println("actualUrl = " +  actualUrl);
        }
        driver.quit();

    }
}
