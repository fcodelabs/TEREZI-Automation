package com.fcodelabs.qe.uipges.web;

import com.fcodelabs.qe.playwright.WebPageBase;
import com.microsoft.playwright.Page;

public class SecureAreaPage extends WebPageBase {

    String lblSuccessfulLoginMsg = "xpath=//div[@id='flash']";
    String btnLogout = "xpath=//a[@class='button secondary radius']";

    public SecureAreaPage(Page page) {
        super(page);
    }

    public String isSuccessfulLoginMsgDisplayed() {
        return hasText(lblSuccessfulLoginMsg);
    }

    public void logoutUser(){
        clickElement(btnLogout);
    }
}
