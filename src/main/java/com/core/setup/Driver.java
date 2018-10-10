package com.core.setup;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public class Driver {
    private Logger log = Logger.getLogger("AD");
    private AppiumDriver appiumDriver;
    private String osName = System.getProperty("osName");

    private Driver() {
    }

    private static Driver instance = new Driver();

    public static Driver getInstance() {
        return instance;
    }

    private ThreadLocal<AppiumDriver> threadLocal = new ThreadLocal<AppiumDriver>() {

        protected AppiumDriver initialValue() {
            DesiredCapabilities capabilities;

            if (appiumDriver == null) {
                switch (osName) {
                    case "android":

                        capabilities = DesiredCapabilities.android();

                        capabilities.setCapability("appium-version", "1.9.0");
                        capabilities.setCapability("platformName", "Android");
                        capabilities.setCapability("platformVersion", "5.1");
                        capabilities.setCapability("deviceName", "Google Nexus 10");
                        capabilities.setCapability("app", "/Users/uptechmacbook_air/IdeaProjects/appium-cucumber/app/test.apk");
                try {
                    appiumDriver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
                    appiumDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                    log.info("Create instance of Android Driver");


                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    log.info("Instance of Android Driver is not created");};


                        break;

                    case "iOS":

                        capabilities = DesiredCapabilities.android();

                        capabilities.setCapability("appium-version", "1.9.0");
                        capabilities.setCapability("platformName", "iOS");
                        capabilities.setCapability("platformVersion", "11.0");
                        capabilities.setCapability("deviceName", "iphoneX");
                        capabilities.setCapability("app", "/Users/uptechmacbook_air/IdeaProjects/appium-cucumber/app/test.apk");
                try {
                    appiumDriver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
                    appiumDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                    log.info("Create instance of iOS Driver");

                } catch (MalformedURLException e) {
                    e.printStackTrace();
                    log.info("Instance of iOS Driver is not created");
                }
                        break;
                }
            } return appiumDriver;

        }

    };

    public AppiumDriver getAppiumDriver() {

        return threadLocal.get();
    }

    public void removeDriver() {
        appiumDriver = threadLocal.get();
        try {
            appiumDriver.quit();
        } finally {
            threadLocal.remove();
        }
        appiumDriver.close();
    }


}
