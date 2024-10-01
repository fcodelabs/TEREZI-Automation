package com.fcodelabs.qe.uipges.web;

import com.fcodelabs.qe.playwright.WebPageBase;
import com.microsoft.playwright.Page;

public class signOut extends WebPageBase {

    public String avatar = "xpath=//div[@id='avatar']";
    public String btnLogOut = "xpath=//div[@class='MuiBox-root css-muxfrw']";

public void signOut(){
    clickElement(avatar);
    clickElement(btnLogOut);
}

    public signOut(Page page) {
        super(page);
    }
}
