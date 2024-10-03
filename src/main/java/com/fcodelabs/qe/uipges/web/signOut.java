package com.fcodelabs.qe.uipges.web;

import com.fcodelabs.qe.playwright.WebPageBase;
import com.microsoft.playwright.Page;

public class signOut extends WebPageBase {

    public String avatar = "xpath=//div[@id='avatar']";
    public String btnLogOut = "xpath=//div[@class='MuiBox-root css-muxfrw']";

    public void signOut() {
        // Check if the avatar is visible before signing out
        if (isElementVisible(avatar)) {
            clickElement(avatar);
            clickElement(btnLogOut);
        } else {
            System.out.println("Avatar is not visible. No sign out action performed.");
        }
    }

    public signOut(Page page) {
        super(page);
    }
}
