package org.example;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class HandleIFrame extends DriverSetup {

    @Test
    public void interactWithIFrameElement() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice");


        driver.switchTo().frame("courses-iframe");

        driver.findElement(By.xpath("//a[normalize-space()='Register']"));

        driver.switchTo().defaultContent();

        driver.findElement(By.xpath("//legend[normalize-space()='iFrame Example']"));


    }
}
