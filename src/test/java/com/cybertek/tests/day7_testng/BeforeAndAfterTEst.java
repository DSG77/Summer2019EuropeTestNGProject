package com.cybertek.tests.day7_testng;

import com.cybertek.utilities.WebDriverFactory;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.testng.annotations.*;

public class BeforeAndAfterTEst {

    @Test
    public void test1(){
        System.out.println(" This is test 1");

        // begenning of the each test
        //WebDriver code
        //open browser
        //driver.get
        //maximize window (some settings before test)

        //after each test
        //close browser

    }
    @Ignore
    @Test
    public void test2() {
        System.out.println(" This is test 2");
    }
         @Test
         public void test3(){
         System.out.println(" This is test 3");
     }

    @BeforeMethod
    public  void  setupMethod(){

        System.out.println("BEFORE METHOD");
        System.out.println("OPENING THE BROWSER");
        // begenning of the each test
        //WebDriver code
        //open browser
        //driver.get
        //maximize window (some settings before test)



    }
    @AfterMethod
    public void tearDown(){
        System.out.println("AFTER METHOD");
        System.out.println("CLOSE BROWSER");
    }

    @BeforeClass
    public  void  beforeClass(){
        System.out.println("BEFORE CLASS CODE");
    }

    @AfterClass
    public  void afterClass(){
        System.out.println("AFTER CLASS CODE");
        System.out.println("REPORTING");
    }
}
