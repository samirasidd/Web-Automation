package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators2 extends DriverSetup{


    @Test
    public void testLocators2() throws InterruptedException {
        driver.get("https://www.freecodecamp.org/");
        Thread.sleep(5000);
        WebElement searchBox;

       // searchBox = driver.findElement(By.className("ais-SearchBox-input"));
        searchBox = driver.findElement(By.cssSelector("input.ais-SearchBox-input"));
        searchBox.sendKeys("articles");

        Thread.sleep(3000);
        searchBox.clear();
        Thread.sleep(3000);

    }
}

