package com.fcodelabs.qe.uipges.web;

import com.fcodelabs.qe.playwright.WebPageBase;
import com.microsoft.playwright.Page;

public class signIn extends WebPageBase {

    String txtEmail = "xpath=//input[@id='i0116']"; // id
    String txtPassword = "xpath=//input[@id='i0118']"; // xpath
    String btnNext = "xpath=//input[@id='idSIButton9']"; // xpath
    String btnSignIn = "xpath=//input[@id='idSIButton9']"; // xpath
    String btnYes = "xpath= //input[@id='idSIButton9']";

    public signIn(Page page) {
        super(page);
    }

    // Method to enter email and click Next
    public void enterEmail(String email) {
        typeText(txtEmail, email);
        clickElement(btnNext);
    }


    public void signIn(String password) {
        typeText(txtPassword, password);
        clickElement(btnSignIn);
        clickElement(btnYes);
    }

}
