package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class editProjectTest extends PlaywrightTestBase {
    project Projects;

    @BeforeMethod
    public void setUp() {
        Projects = new project(getPage());
    }

    @DataProvider(name = "EditProjectDataProviderSuccessful")
    public Object[][] editProjectCredsSuccessful() {
        return new Object[][]{
                {"TEREZI Automation One", "Dasun", "10/01/2024", "10/31/2024", "2", "Test User 2", "10"}
        };
    }

    @Test(dependsOnMethods = {
            "com.fcodelabs.qe.tests.web.signInTest.testSignInSuccessful",
            "com.fcodelabs.qe.tests.web.navigationBarTest.testClickProject",
            "com.fcodelabs.qe.tests.web.Projects.projectSearchTest.testCheckSearchProject",
            "com.fcodelabs.qe.tests.web.Projects.projectSearchTest.testCheckSearchProjectResults"
    },dataProvider = "EditProjectDataProviderSuccessful")
    public void testCheckEditProject(String projectName, String clientName, String tentativeStart, String tentativeEnd,String hypercare,String projectManager, String allocation) {
        getPage().waitForTimeout(10000);
        Projects.CheckEditProject(projectName, clientName, tentativeStart, tentativeEnd, hypercare,projectManager, allocation);
    }

    @Test(description = "HRIS-TC-139")
    public void testCheckEditProjectFormContent(){
    }

    @Test(description = "")
    public void testCheckEditProjectFormMandatoryFields(){
        Projects.CheckEditProjectFormMandatoryFields();
    }
}
