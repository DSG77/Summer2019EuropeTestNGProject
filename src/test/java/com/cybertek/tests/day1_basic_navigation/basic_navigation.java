package com.cybertek.tests.day1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class basic_navigation {

    public static void main(String[] args) {
        //we have to setup webdriver based on the browser that we gonna use
        WebDriverManager.chromedriver().setup();
       // WebDriverManager.firefoxdriver().setup();

        //making object for using selenium driver
        WebDriver driver= new ChromeDriver();
       // WebDriver driver2= new FirefoxDriver();

        //open browser
        driver.get("http://amazon.com");


        //get the title print it
        System.out.println(driver.getTitle());



    }
}
