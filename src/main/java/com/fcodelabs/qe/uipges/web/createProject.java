package com.fcodelabs.qe.uipges.web;

import com.fcodelabs.qe.playwright.WebPageBase;
import com.microsoft.playwright.Page;

public class createProject extends WebPageBase {

    public String btnCreateProject = "xpath= //button[normalize-space()='Create Project']";
    public String formCreateProject = "xpath=//div[@class='MuiBox-root css-1jp4s0u']";
    public String InputFieldProjectName = "xpath=//input[@id=':ri:']";
    public String InputFieldClientName = "xpath=//input[@id=':rj:']";
    public String InputFieldProjectTypeFTFC = "xpath=//div[normalize-space()='Fixed-Time Fixed-Cost Project']";
    public String InputFieldProjectTypeTM = "xpath=//li[normalize-space()='Time & Material Project']";
    public String InputFieldProjectTypeTMCap = "xpath=//li[normalize-space()='Time & Material with Budget Cap']";
    public String InputFieldTentativeStart = "xpath=//input[@id=':rl:']";
    public String InputFieldTentativeEnd = "xpath=//input[@id=':rn:']";
    public String InputFieldHypercarePeriod = "xpath=//input[@id=':rp:']";
    public String InputFieldProjectManager = "xpath=//input[@id=':rq:']";
    public String btnCancel = "xpath=//input[@id=':rq:']";
    public String btnSave = "xpath=//button[normalize-space()='Save']";

    public void ClickCreateProject(){
        clickElement(btnCreateProject);
    }

    public void CheckCreateFormAvailability(){
        isElementVisible(formCreateProject);
    }

    public void CheckCreateProjectFormContent(){
        isElementVisible(InputFieldProjectName);
        isElementVisible(InputFieldClientName);
        isElementVisible(InputFieldProjectTypeFTFC);
        isElementVisible(InputFieldProjectTypeTM);
        isElementVisible(InputFieldProjectTypeTMCap);
        isElementVisible(InputFieldTentativeStart);
        isElementVisible(InputFieldTentativeEnd);
        isElementVisible(InputFieldHypercarePeriod);
        isElementVisible(InputFieldProjectManager);
        isElementVisible(btnSave);
        isElementVisible(btnCancel);
    }

    public createProject(Page page) {
        super(page);
    }
}
