package com.core.extension;

import com.core.controls.MobileControlImp;
import org.openqa.selenium.WebElement;

public class Input extends MobileControlImp {

    private WebElement element;

    public Input(WebElement element) {
        super(element);
    }

    public void setText(String text) {
        element = getWrappedElement();
        element.clear();
        element.sendKeys(text);
    }

    public String getText() {
        return getWrappedElement().getAttribute("value");
    }
}
