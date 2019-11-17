package com.cybertek.tests.day7_types_of_elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {
    @Test
    public void radioButton(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/radio_buttons");
        WebElement blueRadioButton = driver.findElement(By.id("blue"));
        WebElement redRadioButton = driver.findElement(By.id("red"));

        // ho w to check radio button selected or not?

        System.out.println("Is blue selected: " +  blueRadioButton.isSelected() );
        System.out.println("Is red selected: "  + redRadioButton.isSelected() );
        //verify that blue radio button selected
        Assert.assertTrue(blueRadioButton.isSelected(), "Verify that blue radio button selected");
        //verify that red radio button is not selected
        Assert.assertFalse(redRadioButton.isSelected(), "that red radio button is not selected");

        //how to select radio button
        System.out.println("Clicking red radio button");

        redRadioButton.click(); //bu satiri commented yaparsan line 39 dan hata alacaksin****

        System.out.println("Is blue selected: " +  blueRadioButton.isSelected() );
        System.out.println("Is red selected: "  + redRadioButton.isSelected() );

        //verify that blue radio button is not selected
        Assert.assertFalse(blueRadioButton.isSelected(),"//verify that blue radio button is not selected");

        //verify that red radio button is selected
        Assert.assertTrue(redRadioButton.isSelected(), "//verify that red radio button is selected");

        driver.quit();

    }

}
