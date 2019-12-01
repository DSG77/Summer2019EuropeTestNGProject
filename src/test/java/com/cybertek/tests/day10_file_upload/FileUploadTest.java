package com.cybertek.tests.day10_file_upload;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileUploadTest{
    WebDriver driver; //we assigned the WebDriver driver one time to clear errors(or red corrections) of driver words following methods

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
    }
    @AfterMethod
    public void tearDownMethod() throws InterruptedException {

        driver.quit();
    }
    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/upload");
        //file path unique for each computer
        driver.findElement(By.name("file")).sendKeys("C:\\Users\\admin\\Desktop\\file.txt");
        //clicking the upload button
        driver.findElement(By.id("file-submit")).click();
        //getting text of WebElement
        String actualFilename = driver.findElement(By.id("uploaded-files")).getText();
        //verify the file name is displayed in the next page
        Assert.assertEquals(actualFilename,"file.txt","Verify zhe file name");

}
    @Test
        public void test2(){
        driver.get("http://practice.cybertekschool.com/upload");

        String projectPath =System.getProperty("user.dir");
        String relativePath = "/src/test/resources/testfile.txt";

        String filePath = projectPath+"/"+relativePath;

        driver.findElement(By.name("file")).sendKeys(filePath);
        //clicking the upload button
        driver.findElement(By.id("file-submit")).click();
        //getting text of webelement
        String actualFilename = driver.findElement(By.id("uploaded-files")).getText();
        //verify file name is displayed in the next page
        Assert.assertEquals(actualFilename,"testfile.txt","Verify the file name");


    }


}
