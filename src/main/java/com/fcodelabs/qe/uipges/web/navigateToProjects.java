package com.fcodelabs.qe.uipges.web;

import com.fcodelabs.qe.playwright.WebPageBase;
import com.microsoft.playwright.Page;

public class navigateToProjects extends WebPageBase
{
    public String resourceAllocation = "xpath=//span[normalize-space()='Resource Allocation']";
    public String projects = "xpath=//div[@id='project']";
    public String notification = "xpath=//div[@id='notification']";
    public String pendingAction = "xpath=//div[@id='pending_action']";
    public String toolsAndTech = "xpath=//div[@id='tools']";
    public String users = "xpath=//div[@id='rolesAndDepartments']";

    public void ClickProject(){
        clickElement(projects);
    }

    public navigateToProjects(Page page) {
        super(page);
    }
}
