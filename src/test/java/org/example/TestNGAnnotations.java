package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class TestNGAnnotations {

    // 1. Suite-level annotations (runs before/after entire suite)
    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Before Suite - Runs once before all tests in the suite");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("After Suite - Runs once after all tests in the suite");
    }

    // 2. Test-level annotations (runs before/after a <test> tag in testng.xml)
    @BeforeTest
    public void beforeTest() {
        System.out.println("Before Test - Runs before any test method in a <test> tag");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("After Test - Runs after all test methods in a <test> tag");
    }

    // 3. Class-level annotations (runs before/after all methods in a class)
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before Class - Runs once before any method in this class");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("After Class - Runs once after all methods in this class");
    }

    // 4. Method-level annotations (runs before/after each test method)
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Before Method - Runs before every @Test method");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("After Method - Runs after every @Test method");
    }

    // 5. Actual Test Cases
    @Test(priority = 1, groups = {"smoke"})
    public void testCase1() {
        System.out.println("Test Case 1 - Smoke Test");
    }

    @Test(priority = 2, groups = {"regression"})
    public void testCase2() {
        System.out.println("Test Case 2 - Regression Test");

    }

    @Test
    public void testAssertion() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.getTitle();
        Assert.assertEquals(driver.getTitle(), "Google");

        //Hard assertions
        Assert.assertTrue(true);
        Assert.assertFalse(false);
        System.out.println("Test 1 done");

        //Soft assertions
        SoftAssert softAssert = new SoftAssert();

        System.out.println("Send keys");

        softAssert.assertEquals(1, 1);
        System.out.println("Click on element");

        softAssert.assertFalse(true);
        System.out.println("Visible");

        softAssert.assertTrue(true);
        softAssert.assertAll();
    }
}
