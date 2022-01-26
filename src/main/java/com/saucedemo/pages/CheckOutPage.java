package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPage extends Utility {

    private static final Logger log = LogManager.getLogger(CheckOutPage.class.getName());
    public CheckOutPage() {
        PageFactory.initElements(driver, this);
    }


    @FindBy(id = "first-name")
    WebElement firstName;

    @FindBy(id = "last-name")
    WebElement lastName;

    @FindBy(id = "postal-code")
    WebElement postCode;

    @FindBy(css = ".cart_button")
    WebElement finishBtn;

    @FindBy(css = "[type='submit']")
    WebElement continueBtn;

    public void enterContactDetails(String fName, String lName, String pCode) {
        sendTextToElement(firstName, fName);
        sendTextToElement(lastName, lName);
        sendTextToElement(postCode, pCode);

    }
    public  void clickContinueBtn() {
        clickOnElement(continueBtn);
        log.info("Clicking On Continue Button :" +continueBtn.toString());

    }
    public  void clickFinishBtn() {
        clickOnElement(finishBtn);
        log.info("Clicking On Finish Button :" +finishBtn.toString());

    }

}
