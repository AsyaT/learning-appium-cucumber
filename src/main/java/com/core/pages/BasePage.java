package com.core.pages;

import com.core.setup.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

public abstract class BasePage {

    protected Logger log = Logger.getLogger("AD");
    protected Wait<AppiumDriver> wait;

    public BasePage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getInstance().getAppiumDriver()), this);
    }

    public boolean waitForControl(WebElement mobileControl) {
        log.info("Wait for get control of element");
        wait = getWait(120);
        return wait.until(appiumDriver -> mobileControl != null && mobileControl.isEnabled() && mobileControl.isDisplayed());
    }

    public void waitElementToClick(WebElement mobileElement){
        waitForControl(mobileElement);
        wait.until(ExpectedConditions.elementToBeClickable(mobileElement));
    }


    private FluentWait getWait(int timeout) {
        return new FluentWait<>(Driver.getInstance().getAppiumDriver())
                .withTimeout(timeout, TimeUnit.SECONDS)
                .pollingEvery(2, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
    }

    public String getScreenTitle(){
        String title = Driver.getInstance().getAppiumDriver().getTitle();
        log.info("Title of current screen: " + title);
        return title;
    }


}
