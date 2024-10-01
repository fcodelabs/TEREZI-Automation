package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import com.microsoft.playwright.Page;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class projectTest extends PlaywrightTestBase {

    project Projects;

    @BeforeClass
    public void setup() {
        Page page = getPage();
        Projects = new project(page);
    }

    @DataProvider(name = "searchDataProvider")
    public Object[][] loginCreds() {
        return new Object[][]{
                {"TEREZI Automation"}
        };
    }

    @Test(dependsOnMethods = {
            "com.fcodelabs.qe.tests.web.signInTest.testSignInSuccessful",
            "com.fcodelabs.qe.tests.web.navigationBarTest.testClickProject",
    }, description = "HRIS-TC-50")
    public void testCheckProjectSectionContent(){
        Projects.CheckProjectSectionContent();
    }

    @Test(description = "HRIS-TC-77")
    public void testCheckCreateProjectButton() {
        Projects.ClickCreateProject();
    }

    @Test(description = "HRIS-TC-74")
    public void testCheckCreateFormAvailability(){
        Projects.CheckCreateFormAvailability();
    }

    @Test(description = "HRIS-TC-73")
    public void testCheckCreateProjectFormContent(){
        Projects.CheckCreateProjectFormContent();
    }

}
