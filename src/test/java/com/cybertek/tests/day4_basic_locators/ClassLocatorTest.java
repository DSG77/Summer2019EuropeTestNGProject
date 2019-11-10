package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {
    public static void main(String[] args) {


        //open web page
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //navigate to page
        driver.get("https://practice.cybertekschool.com/sign_up");

        WebElement homeLink = driver.findElement(By.className("nav-link"));

        homeLink.click();

        driver.get("https://practice.cybertekschool.com/multiple_buttons");

        //proper way
        WebElement messageElement = driver.findElement(By.className("h3"));
        String message = messageElement.getText();
        System.out.println(message);


        //lazy way
        System.out.println(driver.findElement(By.className("h3")).getText());

        //enter e mail
      //  WebElement EmailInput = driver.findElement(By.name("email"));
       // EmailInput.sendKeys("gmail@gmail.com");
    }
}
