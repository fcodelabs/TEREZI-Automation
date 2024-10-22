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


    @Test(description = "HRIS-TC-68")
    public void testCheckFilterProjectMemberByRole() {
        getPage().waitForTimeout(10000);
        Projects.CheckFilterProjectMemberByRole();
    }
}
