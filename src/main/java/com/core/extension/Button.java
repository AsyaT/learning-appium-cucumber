package com.core.extension;

import com.core.controls.MobileControlImp;
import org.openqa.selenium.WebElement;

public class Button extends MobileControlImp {

    private WebElement element;

    public Button(WebElement element) {
        super(element);
    }

}