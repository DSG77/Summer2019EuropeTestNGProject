package com.cybertek.tests.day7_testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssetionsDemo {
    @Test
    public void test1(){
        System.out.println("First Assertion");
        Assert.assertEquals(1,1);

        System.out.println("Second Assertion");
        Assert.assertEquals("one", "ome");

        System.out.println("after second assertion");


    }
    @Test
    public void test2(){
        //verify that title starts with c
        String actualTitle = "Cybertek";
        String expectedTitleBeginning ="C";
        System.out.println("Second test first assertion");
        Assert.assertTrue(actualTitle.startsWith(expectedTitleBeginning),"Verify title starts with C ");

        //verify that email includes @ sign
        Assert.assertTrue("yasinmail".contains("@"),"verify @ in email");

    }
    @Test
    public void test3(){

        Assert.assertNotEquals("one","one", "one shouldn't be equal to two");

    }
    @Test
    public void test4(){
        Assert.assertFalse(1>0);
    }

}

