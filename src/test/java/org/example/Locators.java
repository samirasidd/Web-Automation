package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Locators extends DriverSetup{


    @Test
    public void testLocators() throws InterruptedException {
        driver.get("http://www.google.com");

        WebElement searchArea;
        //searchArea = driver.findElement(By.id("APjFqb"));
        //searchArea = driver.findElement(By.name("q"));
        //searchArea = driver.findElement(By.tagName("textarea"));
        //searchArea = driver.findElement(By.className("gLFyf"));

        searchArea = driver.findElement(By.className("gLFyf"));

        searchArea.sendKeys("Bangladesh");
        Thread.sleep(3000);
        searchArea.clear();
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("কাজ করে")).click();
        Thread.sleep(3000);

        driver.navigate().back();

        driver.findElement(By.linkText("Gmail")).click();
        Thread.sleep(3000);


    }
}

