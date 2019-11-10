package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathTest {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //driver.get("https://practice.cybertekschool.com/sign_up");
        //WebElement homeLink = driver.findElement(By.xpath("//*[.='Sign Up']"));
        //homeLink.click();

        WebElement SignUpText = driver.findElement(By.xpath("//h2[.='Sign Up Page']"));
        SignUpText.getText();
        System.out.println(SignUpText);



    }
}
