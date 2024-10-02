package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class addProjectMemberTest extends PlaywrightTestBase {
    project Projects;

    @BeforeMethod
    public void setUp() {
        Projects = new project(getPage());
    }

    @DataProvider(name = "AddMemberDataProviderSuccessful")
    public Object[][] addMemberCredsSuccessful() {
        return new Object[][]{
                {"Test User 2", "Full Stack Developer", "10/01/2024", "10/31/2024", "10"}
        };
    }

    @Test(dependsOnMethods = {
            "com.fcodelabs.qe.tests.web.signInTest.testSignInSuccessful",
            "com.fcodelabs.qe.tests.web.navigationBarTest.testClickProject",
            "com.fcodelabs.qe.tests.web.Projects.projectSearchTest.testCheckSearchProject",
            "com.fcodelabs.qe.tests.web.Projects.projectSearchTest.testCheckSearchProjectResults"
    },dataProvider = "AddMemberDataProviderSuccessful")
    public void testAddMember(String Name, String role, String resourceStart, String resourceEnd, String allocation) {
        getPage().waitForTimeout(10000);
        Projects.CheckAddProjectMember(Name, role, resourceStart, resourceEnd, allocation);
    }

    @Test(description = "HRIS-TC-")
    public void testCheckAddProjectMemberFormMandatoryFields(){
        Projects.CheckAddProjectMemberFormMandatoryFields();
    }


}
