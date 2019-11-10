package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {

        //open web page
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //navigate to page
        driver.get("https://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.name("full_name"));

        fullNameInput.sendKeys("Mike Smith");

        //enter e mail
        WebElement EmailInput = driver.findElement(By.name("email"));
        EmailInput.sendKeys("gmail@gmail.com");

        //clicking signup button
        WebElement SignUpButton = driver.findElement(By.name("wooden_spoon"));
        SignUpButton.click();

        //verify getting Message
        WebElement SignUpMessage = driver.findElement(By.name("signup_message"));
        String actualMessage = SignUpMessage.getText();

        //expected message "Thank you for signing up. Click the button below to return to the home page."
        String expectedMessage = "Thank you for signing up. Click the button below to return to the home page.";
                if (expectedMessage.equals(actualMessage)){
                    System.out.println("PASS");
                }else{
                    System.out.println("FAIL");
                    System.out.println("expectedMessage = " + expectedMessage);
                    System.out.println("actualMessage = " + actualMessage);

                }

//close browser
        driver.quit();


    }
}
