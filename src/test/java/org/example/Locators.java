package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.List;

public class Locators extends DriverSetup{


    @Test
    public void testLocators() throws InterruptedException {
        driver.get("http://www.google.com");

        WebElement searchArea;
        //searchArea = driver.findElement(By.id("APjFqb"));
        //searchArea = driver.findElement(By.name("q"));
        //searchArea = driver.findElement(By.tagName("textarea"));
        //searchArea = driver.findElement(By.className("gLFyf"));

       // searchArea = driver.findElement(By.className("gLFyf"));

      //  searchArea = driver.findElement(By.cssSelector("textarea[class ='gLFyf']"));
        searchArea = driver.findElement(By.xpath("//textarea[@class = 'gLFyf']"));

        searchArea.sendKeys("Bangladesh");
        Thread.sleep(3000);
        searchArea.clear();

        List<WebElement> children = driver.findElements(By.cssSelector("div[class = 'KxwPGc AghGtd']>a"));

        for (WebElement child:children){
            System.out.println(child.getText());
        }



    }
}

