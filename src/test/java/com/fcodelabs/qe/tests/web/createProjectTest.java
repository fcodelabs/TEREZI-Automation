package com.fcodelabs.qe.tests.web;

import com.fcodelabs.qe.uipges.web.createProject;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import com.microsoft.playwright.Page;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class createProjectTest extends PlaywrightTestBase {

    createProject CreateProjects;

    @BeforeClass
    public void setup() {
        Page page = getPage();
        CreateProjects = new createProject(page);
    }

    @Test(dependsOnMethods = {"com.fcodelabs.qe.tests.web.signInTest.enterEmail", "com.fcodelabs.qe.tests.web.signInTest.signIn",
    "com.fcodelabs.qe.tests.web.navigateToProjectTest.testClickProject"})
    public void testCreateProject() {
        CreateProjects.ClickCreateProject();
    }

    @Test
    public void testCheckCreateProjectForm(){
        CreateProjects.CheckTheCreateFormContent();
    }

}
