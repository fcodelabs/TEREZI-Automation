package com.fcodelabs.qe.uipges.web;

import com.fcodelabs.qe.playwright.WebPageBase;
import com.microsoft.playwright.Page;

public class createProject extends WebPageBase {

    public String btnCreateProject = "xpath= //button[normalize-space()='Create Project']";
    public String formCreateProject = "xpath=//div[@class='MuiBox-root css-1jp4s0u']";

    public void ClickCreateProject(){
        clickElement(btnCreateProject);
    }

    public void CheckTheCreateFormContent(){
        isElementVisible(formCreateProject);
    }

    public createProject(Page page) {
        super(page);
    }
}
