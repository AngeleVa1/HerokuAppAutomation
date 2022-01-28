package com.HerokuApp.Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
    WebDriver driver;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(linkText = "Multiple Windows")
    WebElement linkMultipleWindows;

    public void pressFirst() {
      //  WebDriverWait wait = new WebDriverWait(driver, 20);
        linkMultipleWindows.click();
    }

}
