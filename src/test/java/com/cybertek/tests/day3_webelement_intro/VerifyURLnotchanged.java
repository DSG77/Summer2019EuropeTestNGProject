package com.cybertek.tests.day3_webelement_intro;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyURLnotchanged {

    /**
     * Verify URL not changed
     * open chrome
     * go to http://practice.cybertekschool.com/forgot_password Links to an external site.
     * click on Retrieve password
     * verify that url did not change
     * @param args
     */
    public static void main(String[] args) {

        //open chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");

        // go to http://practice.cybertekschool.com/forgot_password links to extern site
        driver.get("http://practice.cybertekschool.com/forgot_password");

        // save URL to string variable
        String expectedUrl = driver.getCurrentUrl();

        //click on Retrieve password
        //WebElement is a class that represents elements on the webpage
        //findElement is method used to find element on a page
        WebElement retrievePasswordButton = driver.findElement(By.id("form_submit"));

        //click()  is clicking WebElement
        retrievePasswordButton.click();

        //save url after clicking button
        String actualUrl = driver.getCurrentUrl();

        //verify that url is not changed
        if (expectedUrl.equals(actualUrl)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }

        //close the browser
        driver.quit();


    }
}
