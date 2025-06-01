package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class InteractingWithWebElements extends DriverSetup {

    @Test
    public void interactingWithElements() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement head = driver.findElement(By.xpath("//h1[normalize-space()='Practice Page']"));
        String headText = head.getText();
        System.out.println(headText);

        WebElement radioBtn2 = driver.findElement(By.cssSelector("input[value='radio2']"));
        radioBtn2.click();
        Thread.sleep(3000);

        WebElement name = driver.findElement(By.cssSelector("#name"));
        name.sendKeys("Bleh");
        name.clear();
        Thread.sleep(3000);

        String placeholderText = name.getAttribute("placeholder");
        System.out.println(placeholderText);

        WebElement openTab = driver.findElement(By.cssSelector("#opentab"));
        String colour = openTab.getCssValue("background-color");
        System.out.println(colour);

        WebElement radioBtn1 = driver.findElement(By.cssSelector("input[value='radio1']"));
        System.out.println(radioBtn1.isSelected());
        System.out.println(radioBtn2.isSelected());

        WebElement showHideBox = driver.findElement(By.xpath("//input[@id='displayed-text']"));
        System.out.println(showHideBox.isDisplayed());

        WebElement hideBtn = driver.findElement(By.xpath("//input[@id='hide-textbox']"));
        hideBtn.click();

        System.out.println(showHideBox.isDisplayed());

        System.out.println("checkBox state: " + driver.findElement(By.cssSelector("#checkBoxOption1")).isEnabled());
        Thread.sleep(3000);
    }
}