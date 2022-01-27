package com.HerokuApp.tests;

import com.HerokuApp.Pages.HomePage;
import com.HerokuApp.Base.BaseTest;
import com.HerokuApp.Pages.NextWindow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ThreadGuard;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class testHerokuApp extends BaseTest {
    HomePage homePage;
    NextWindow nextWindow;


    @Test(priority = 1)
    public void HomePage()  {
        HomePage homePage = new HomePage(driver);
        homePage.pressFirst();
    }

    @Test(priority = 2)
    public void NextWindow() {
        NextWindow nextWindow = new NextWindow(driver);
        nextWindow.pressClickHere();
        System.out.println(nextWindow.newWindow());
        Assert.assertEquals(nextWindow.newWindow(), "New Window", "Test not passed");
        nextWindow.navigateToMainTab();
        System.out.println(nextWindow.secondAssert());
        Assert.assertEquals(nextWindow.secondAssert(), "Opening a new window\n" + "Click Here", "Test not passed");

    }
}

