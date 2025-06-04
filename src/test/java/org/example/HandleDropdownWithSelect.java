package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Queue;

public class HandleDropdownWithSelect extends DriverSetup {


    @Test
    public void dropdownSelect() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");

        WebElement selectEl = driver.findElement(By.id("dropdown-class-example"));
        Select select = new Select(selectEl);
        selectEl.click();
        Thread.sleep(2000);
        select.selectByIndex(2);
        Thread.sleep(2000);
        select.selectByValue("option3");
        Thread.sleep(2000);
        select.selectByVisibleText("Option1");
        Thread.sleep(2000);

        WebElement selectedOption = select.getFirstSelectedOption();
        System.out.println(selectedOption.getText());

        List<WebElement> all_options = select.getOptions();
        System.out.println("Total options: " + all_options.size());

        for (WebElement option: all_options){
            System.out.println("Option: " + option.getText());
        }

        // 1. Select and "deselect" Option 2
        select.selectByIndex(2);
        System.out.println("Selected: " + select.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        select.selectByIndex(0); // "Deselect" by selecting the default empty option
        System.out.println("Deselected - Now selected: " + select.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        // 2. Select and "deselect" Option 3
        select.selectByIndex(3);
        System.out.println("Selected: " + select.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        select.selectByIndex(0); // "Deselect" again
        System.out.println("Deselected - Now selected: " + select.getFirstSelectedOption().getText());
    }
}
