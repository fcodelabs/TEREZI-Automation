package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class searchProjectMemberTest extends PlaywrightTestBase {
    project Projects;

    @BeforeMethod
    public void setUp() {
        Projects = new project(getPage());
    }

    @DataProvider(name = "SearchMemberDataProviderSuccessful")
    public Object[][] addMemberCredsSuccessful() {
        return new Object[][]{
                {"Ramesh rathnayke"}
        };
    }

//    dependsOnMethods = {
//        "com.fcodelabs.qe.tests.web.signInTest.testSignInSuccessful",
//                "com.fcodelabs.qe.tests.web.navigationBarTest.testClickProject",
//                "com.fcodelabs.qe.tests.web.Projects.projectSearchTest.testCheckSearchProject",
//                "com.fcodelabs.qe.tests.web.Projects.projectSearchTest.testCheckSearchProjectResults"
//    },

    @Test(dataProvider = "SearchMemberDataProviderSuccessful",description = "HRIS-TC-69")
    public void testCheckSearchProjectMember(String memberSearchInput) {
        getPage().waitForTimeout(10000);
        Projects.CheckSearchProjectMember(memberSearchInput);
    }


}
