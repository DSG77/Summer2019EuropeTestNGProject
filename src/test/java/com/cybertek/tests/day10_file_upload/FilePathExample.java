package com.cybertek.tests.day10_file_upload;

import org.testng.annotations.Test;

public class FilePathExample {

    @Test
    public void test1(){
        System.out.println(System.getProperty("user.dir"));
        //C:\Users\admin\IdeaProjects\Summer2019EuropeTestNGProject bunu verir bize
        String projectPath =System.getProperty("user.dir");
        String relativePath = "/src/test/resources/testfile.txt";
                // src/test/resources/testfile.txt   relative path
        String filePath = projectPath+"/"+relativePath;
        System.out.println(filePath);

    }
}
