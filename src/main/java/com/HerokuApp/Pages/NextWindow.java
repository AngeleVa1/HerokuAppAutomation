package com.HerokuApp.Pages;

import com.HerokuApp.Base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;

public class NextWindow {
    ArrayList<String> newTab;
    WebDriver driver;

    public NextWindow(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".example > h3:nth-child(1)")
    WebElement newTabHeadline;

    public void pressClickHere() {
        driver.findElement(By.linkText("Click Here")).click();
        newTab = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(newTab.get(1));

    }

    public String newWindow() {
        return newTabHeadline.getText();

    }

    public void navigateToMainTab() {
        driver.switchTo().window(newTab.get(0));
    }

    public String secondAssert() {
        return driver.findElement(By.className("example")).getText();
    }

}