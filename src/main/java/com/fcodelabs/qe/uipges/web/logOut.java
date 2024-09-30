package com.fcodelabs.qe.uipges.web;

import com.fcodelabs.qe.playwright.WebPageBase;
import com.microsoft.playwright.Page;

public class logOut extends WebPageBase {

    public String avatar = "xpath=//div[@id='avatar']";
    public String btnLogOut = "xpath=//div[@class='MuiBox-root css-muxfrw']";



    public logOut(Page page) {
        super(page);
    }
}
