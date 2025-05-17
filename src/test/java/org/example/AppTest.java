package org.example;

import org.testng.annotations.Test; // Import TestNG's @Test annotation for creating tests


public class AppTest extends DriverSetup{ // Creates a test class that inherits from DriverSetup

    @Test
    public void testWebPageLoad(){
        driver.get("http://www.google.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void testWebPageTitle(){
        driver.get("http://www.google.com");
        System.out.println(driver.getTitle()); 
    }
}
