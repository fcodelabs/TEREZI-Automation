package com.fcodelabs.qe.uipges.web;

import com.fcodelabs.qe.playwright.WebPageBase;
import com.microsoft.playwright.Page;

public class navigationBar extends WebPageBase
{
    public String resourceAllocation = "xpath=//div[@id='resource_allocation']";
    public String projects = "xpath=//div[@id='project']";
    public String notification = "xpath=//div[@id='notification']";
    public String pendingAction = "xpath=//div[@id='pending_action']";
    public String toolsAndTech = "xpath=//div[@id='tools']";
    public String users = "xpath=//div[@id='rolesAndDepartments']";

    public void ClickResourceAllocation(){
        clickElement(resourceAllocation);
    }

    public void ClickProject(){
        clickElement(projects);
    }

    public void ClickNotification(){
        clickElement(notification);
    }

    public void ClickPendingAction(){
        clickElement(pendingAction);
    }

    public void ClickToolsAndTech(){
        clickElement(toolsAndTech);
    }

    public void ClickUsers(){
        clickElement(users);
    }

    public navigationBar(Page page) {
        super(page);
    }
}
