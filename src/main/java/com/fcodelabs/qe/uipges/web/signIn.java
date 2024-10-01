package com.fcodelabs.qe.uipges.web;

import com.fcodelabs.qe.playwright.WebPageBase;
import com.microsoft.playwright.Page;

public class signIn extends WebPageBase {

    String txtEmail = "xpath=//input[@id='i0116']";
    String txtPassword = "xpath=//input[@id='i0118']";
    String btnNext = "xpath=//input[@id='idSIButton9']";
    String btnSignIn = "xpath=//input[@id='idSIButton9']";
    String btnYes = "xpath= //input[@id='idSIButton9']";
    String wrongEmail = "xpath=//div[@id='usernameError']";
    String wrongPassword = "xpath=//div[@id='passwordError']";
    String avatar = "xpath=//div[@id='avatar']";
    String btnLogOut = "xpath=//div[@class='MuiBox-root css-muxfrw']";

    public signIn(Page page) {
        super(page);
    }

    // Method to enter password and click sign in and then click Yes`
    public void signInSuccessful(String email, String password) {
        typeText(txtEmail, email);
        clickElement(btnNext);
        typeText(txtPassword, password);
        clickElement(btnSignIn);
        clickElement(btnYes);
    }

    public void signInUnsuccessfulWrongEmail(String email, String password){
        typeText(txtEmail, email);
        isElementVisible(wrongEmail);
    }

    public void signInUnsuccessfulWrongPassword(String email, String password){
        typeText(txtEmail, email);
        clickElement(btnNext);
        typeText(txtPassword, password);
        clickElement(btnSignIn);
        isElementVisible(wrongPassword);
    }

    public void signOut(){
        clickElement(avatar);
        clickElement(btnLogOut);
    }



}
