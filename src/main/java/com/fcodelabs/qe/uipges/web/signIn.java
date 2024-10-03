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
    String pickAccountToSignOut = "xpath=//div[@class='tile-container']";
    String useOtherAccountToSignIn = "xpath=//div[@id='otherTile']";
    String btnLogOut = "xpath=//div[@class='MuiBox-root css-muxfrw']";

    public void signOut() {
        // Check if the avatar is visible before signing out
        try {
            Thread.sleep(8000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (isElementVisible(avatar)) {
            clickElement(avatar);
            clickElement(btnLogOut);
            clickElement(pickAccountToSignOut);
            clickElement(useOtherAccountToSignIn);
        } else {
            System.out.println("Avatar is not visible. No sign out action performed.");
        }
    }

    public signIn(Page page) {
        super(page);
    }

    // Method to enter password and click sign in and then click Yes`
    public void signInSuccessful(String email, String password) {
        signOut();
        typeText(txtEmail, email);
        clickElement(btnNext);
        typeText(txtPassword, password);
        clickElement(btnSignIn);
        clickElement(btnYes);
    }

    public void signInUnsuccessfulWrongEmail(String email, String password){

        signOut();
        typeText(txtEmail, email);
        isElementVisible(wrongEmail);
    }

    public void signInUnsuccessfulWrongPassword(String email, String password){
        signOut();
        typeText(txtEmail, email);
        clickElement(btnNext);
        typeText(txtPassword, password);
        clickElement(btnSignIn);
        isElementVisible(wrongPassword);
    }
}
