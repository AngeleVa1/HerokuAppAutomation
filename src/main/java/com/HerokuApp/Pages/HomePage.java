package com.HerokuApp.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void pressFirst() {
      //  WebDriverWait wait = new WebDriverWait(driver, 20);
        driver.findElement(By.linkText("Multiple Windows")).click();
    }

}
