package com.saucedemo.pages;

import com.saucedemo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Utility {


        private static final Logger log = LogManager.getLogger(LoginPage.class.getName());
    public LoginPage() {
        PageFactory.initElements(driver, this);
    }


        @FindBy(css = "#user-name")
        WebElement username;

        @FindBy(id = "password")
        WebElement password;

        @FindBy(id = "login-button")
        WebElement loginButton;

        public void enterUsernamePassword(String user, String pass) {
            sendTextToElement(username, user);
            sendTextToElement(password, pass);
            log.info(" Enter username " + user + " to the field" + username.toString() + "And Password " + pass + " to the field" + password.toString());

        }

        public void clickLoginButton() {
            clickOnElement(loginButton);
            log.info("Clicking On login Button :" + loginButton.toString());
        }
    }

