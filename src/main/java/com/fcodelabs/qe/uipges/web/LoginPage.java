package com.fcodelabs.qe.uipges.web;

import com.fcodelabs.qe.playwright.WebPageBase;
import com.microsoft.playwright.Page;

public class LoginPage extends WebPageBase {

    String txtUserName = "#username"; //id
    String txtPassword = "xpath=//input[@name='password']"; //xpath
    String btnLogin = "xpath=//button[@type ='submit']";
    String lblPageHeader = "xpath=//div[@id='content']/div/h2";

    public LoginPage(Page page) {
        super(page);
    }

    public void userLogin(String userName, String password) {
        typeText(txtUserName, userName);
        typeText(txtPassword, password);
        clickElement(btnLogin);
    }

    public Boolean isLoginPageVisible() {
        return isElementVisible(lblPageHeader);
    }
}
