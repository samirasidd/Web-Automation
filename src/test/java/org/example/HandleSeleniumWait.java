package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class HandleSeleniumWait extends DriverSetup {

    @Test
    public void testDelayElement(){

        driver.get("https://qavbox.github.io/demo/delay/");
        driver.findElement(By.xpath("//input[@name='commit1']")).click();

        //Implicit Wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement h2 = driver.findElement(By.xpath("//h2[@id='delay']"));
        System.out.println(h2.getText());

        //Explicit Wait
        driver.findElement(By.xpath("//input[@name='commit']")).click();

        h2 = driver.findElement(By.xpath("//h2[@id='two']"));
        //Element is present, waiting for text. For the previous ones, element was not present either.

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.textToBePresentInElement(h2, "I am here"));
        System.out.println("Text: " + h2.getText());

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement h2El = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='oneMore']//h2[1]")));
        System.out.println("Element: " + h2El.getText());

    }
}
