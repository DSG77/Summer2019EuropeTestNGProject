package com.cybertek.tests.day5_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AmazonTest {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        //navigete to amazon
        driver.get("https://amazon.com");
        //locate searchBox
        WebElement searchBox = driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));


        searchBox.sendKeys("selenium");

        Thread.sleep(1000);

        //locate searchButton
        WebElement searchButton = driver.findElement(By.xpath("//input[@value='Go']"));
        searchButton.click();

       // WebElement takeText =driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
        //System.out.println(takeText.getText());

       // String resultMessage = driver.findElement(By.xpath("//span[contains(text(),'results for')]"));
        //System.out.println(resultMessage);


    }

}