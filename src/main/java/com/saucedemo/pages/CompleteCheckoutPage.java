package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CompleteCheckoutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CompleteCheckoutPage.class.getName());
    public CompleteCheckoutPage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = ".complete-header")
    WebElement thanksMessage;

    public String verifyMessage(){
        log.info("Getting confirmation text to confirm Order "+thanksMessage.toString());
        return thanksMessage.getText();
    }
}


