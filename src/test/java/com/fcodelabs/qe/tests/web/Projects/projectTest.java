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
                {"project c"}
        };
    }

    @Test(dependsOnMethods = {
            "com.fcodelabs.qe.tests.web.signInTest.testSignInSuccessful",
            "com.fcodelabs.qe.tests.web.navigationBarTest.testClickProject",
    })
    public void testCheckCreateProjectButton() {
        Projects.ClickCreateProject();
    }

    @Test
    public void testCheckCreateFormAvailability(){
        Projects.CheckCreateFormAvailability();
    }

    @Test
    public void testCheckCreateProjectFormContent(){
        Projects.CheckCreateProjectFormContent();
    }

}
