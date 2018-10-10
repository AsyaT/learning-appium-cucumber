package com.core.extension;

import com.core.controls.MobileControlImp;
import org.openqa.selenium.WebElement;

public class Label extends MobileControlImp {
    private WebElement element;

    public Label(WebElement element) {
        super(element);
    }

    public static String getText(MobileControlImp mobileControl) {
        if (mobileControl != null) {
            String containerValue = mobileControl.getText();
            return containerValue;
        }
        return null;

    }
}
