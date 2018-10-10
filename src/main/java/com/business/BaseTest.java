package com.business;

import io.appium.java_client.AppiumDriver;
import org.junit.BeforeClass;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.logging.Logger;

public class BaseTest {
    private AppiumDriver appiumDriver;
    private WebDriverWait wait;
    Logger log = Logger.getLogger("AD");

    @BeforeClass
    public void setUp() {

        wait = new WebDriverWait(appiumDriver, 15);
    }

    @BeforeClass
    public void  tearDown() {
        appiumDriver.close();
    }

}
