package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class projectCardTest extends PlaywrightTestBase {
    project Projects;

    @BeforeMethod
    public void setUp() {
        Projects = new project(getPage());
    }

    @Test(dependsOnMethods = {
            "com.fcodelabs.qe.tests.web.signInTest.testSignInSuccessful",
            "com.fcodelabs.qe.tests.web.navigationBarTest.testClickProject",
            "com.fcodelabs.qe.tests.web.Projects.projectSearchTest.testCheckSearchProject",
            "com.fcodelabs.qe.tests.web.Projects.projectSearchTest.testCheckSearchProjectResults"
    },description = "")
    public void testCheckProjectCardContent() {
        Projects.CheckProjectCardContent();
    }
}
