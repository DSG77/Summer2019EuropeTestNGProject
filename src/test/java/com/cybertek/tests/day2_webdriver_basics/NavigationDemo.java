package com.cybertek.tests.day2_webdriver_basics;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationDemo {

    public static void main(String[] args) throws InterruptedException{

        //setting up the browsers
        WebDriverManager.chromedriver().setup();

        //import class CMD+Enter or ALT+enter or Control +Space
        //selenium object
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(3000);

        driver.navigate().to("https://www.facebook.com");
        //goes back to previous webpage
        driver.navigate().back();
        Thread.sleep(2000);



        //goes forward after goes back
        driver.navigate().forward();

        //refresh the page
        driver.navigate().refresh();
    }




}
