package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class filterProjectMemberByRole extends PlaywrightTestBase {
    project Projects;

    @BeforeMethod
    public void setUp() {
        Projects = new project(getPage());
    }

//    (dependsOnMethods = {
//        "com.fcodelabs.qe.tests.web.signInTest.testSignInSuccessful",
//                "com.fcodelabs.qe.tests.web.navigationBarTest.testClickProject",
//                "com.fcodelabs.qe.tests.web.Projects.projectSearchTest.testCheckSearchProject",
//                "com.fcodelabs.qe.tests.web.Projects.projectSearchTest.testCheckSearchProjectResults"
//    })

    @Test
    public void testCheckFilterProjectMemberByRole() {
        getPage().waitForTimeout(10000);
        Projects.CheckFilterProjectMemberByRole();
    }
}
