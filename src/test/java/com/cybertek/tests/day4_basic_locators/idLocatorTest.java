package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class idLocatorTest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize(); //maximezes page when open it.we doo it so

        driver.get("https://practice.cybertekschool.com/multiple_buttons");
        //click to the don't click button
        WebElement dontClickButton = driver.findElement(By.id("disappearing_button"));
        dontClickButton.click();
        //close the browser
        driver.quit();





    }
}
