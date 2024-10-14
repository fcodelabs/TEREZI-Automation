package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class editProjectMemberTest extends PlaywrightTestBase {
    project Projects;

    @BeforeMethod
    public void setUp() {
        Projects = new project(getPage());
    }

    @DataProvider(name = "EditMemberDataProviderSuccessful")
    public Object[][] editMemberCredsSuccessful() {
        return new Object[][]{
                {"10/01/2024", "10/31/2024", "10"}
        };
    }
    @Test(dependsOnMethods = {
            "com.fcodelabs.qe.tests.web.signInTest.testSignInSuccessful",
            "com.fcodelabs.qe.tests.web.navigationBarTest.testClickProject",
            "com.fcodelabs.qe.tests.web.Projects.projectSearchTest.testCheckSearchProject",
            "com.fcodelabs.qe.tests.web.Projects.projectSearchTest.testCheckSearchProjectResults",
            "com.fcodelabs.qe.tests.web.Projects.searchProjectTest.testCheckSearchProjectMember"
    },dataProvider = "EditMemberDataProviderSuccessful")
    public void testCheckEditProjectMember(String resourceStart, String resourceEnd, String allocation) {
        Projects.CheckEditProjectMember(resourceStart, resourceEnd, allocation);
    }
//    @Test(description = "HRIS-TC-")
//    public void testCheckEditProjectMemberFormMandatoryFields(){
//        Projects.CheckEditProjectMemberFormMandatoryFields();
//    }
}
