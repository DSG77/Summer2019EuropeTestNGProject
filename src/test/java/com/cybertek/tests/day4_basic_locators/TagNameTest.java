package com.cybertek.tests.day4_basic_locators;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TagNameTest {
    public static void main(String[] args) {

        //open web page
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        //navigate to page
        driver.get("https://practice.cybertekschool.com/sign_up");

        WebElement fullNameInput = driver.findElement(By.tagName("input"));

        fullNameInput.sendKeys("Mike Smith");

        //enter e mail
        WebElement EmailInput = driver.findElement(By.name("email"));
        EmailInput.sendKeys("gmail@gmail.com");

        //clicking signup button

        WebElement SignUpButton = driver.findElement(By.tagName("button"));
        SignUpButton.click();

        //verify getting Message

        WebElement SignUpMessage = driver.findElement(By.tagName("h3"));
        String actualMessage = SignUpMessage.getText();
        System.out.println(actualMessage);

        //one shot
       // System.out.println(driver.findElement(By.tagName("h3")).getText());
        /*
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
*/
    }
}
