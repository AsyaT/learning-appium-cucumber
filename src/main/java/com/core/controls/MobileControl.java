package com.core.controls;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.internal.Locatable;
import org.openqa.selenium.internal.WrapsElement;

public interface MobileControl extends WebElement,WrapsElement,Locatable {

    default boolean elementWired (WebElement element) {
        return (element != null);
    }
}
