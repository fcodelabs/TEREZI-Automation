package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import com.microsoft.playwright.Page;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class projectTest extends PlaywrightTestBase {

    project Projects;

    @BeforeClass
    public void setup() {
        Page page = getPage();
        Projects = new project(page);
    }

//    (dependsOnMethods = {
//        "com.fcodelabs.qe.tests.web.signInTest.testSignInSuccessful",
//                "com.fcodelabs.qe.tests.web.navigationBarTest.testClickProject",
//    }, description = "HRIS-TC-50,58")


    @Test(description = "HRIS-TC-50,58")
    public void testCheckActiveProjectTabSectionContent(){
        Projects.CheckActiveProjectTabSectionContent();
    }

    @Test(description = "HRIS-TC-77")
    public void testCheckCompletedProjectTabSectionContent(){
        Projects.CheckCompletedProjectTabSectionContent();
    }

    @Test(description = "HRIS-TC-57")
    public void testCheckProjectMainTabs(){
        Projects.CheckProjectMainTabs();
    }



    @Test(description = "HRIS-TC-59")
    public void testCheckCreateProjectButton() {
        Projects.ClickCreateProject();
    }

}
