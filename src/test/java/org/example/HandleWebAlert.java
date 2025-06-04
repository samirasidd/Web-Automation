package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class HandleWebAlert extends DriverSetup {

    @Test
    public void interactWithAlert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(2000);

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Thread.sleep(2000);
        alertText = alert.getText();
        System.out.println(alertText);
        alert.dismiss();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Thread.sleep(2000);
        alertText = alert.getText();
        System.out.println(alertText);
        alert.sendKeys("Hi");
        Thread.sleep(2000);
        alert.accept();
        Thread.sleep(3000);

    }
}
