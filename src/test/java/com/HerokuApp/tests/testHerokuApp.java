package com.HerokuApp.tests;

import com.HerokuApp.Pages.HomePage;
import com.HerokuApp.Base.BaseTest;
import com.HerokuApp.Pages.NextWindow;
import org.testng.Assert;
import org.testng.annotations.Test;


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
        Assert.assertEquals(nextWindow.newWindow(), "New Window", "Test not passed");
        nextWindow.navigateToMainTab();
        Assert.assertEquals(nextWindow.secondAssert(), "Opening a new window\n" + "Click Here", "Test not passed");
    }
}

