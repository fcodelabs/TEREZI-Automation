package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import com.microsoft.playwright.Page;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class filterByProjectStatusTest extends PlaywrightTestBase {

    project projects;

    @BeforeClass
    public void setup() {
        Page page = getPage();
        projects = new project(page);
    }

//    (dependsOnMethods = {
//        "com.fcodelabs.qe.tests.web.signInTest.testSignInSuccessful",
//                "com.fcodelabs.qe.tests.web.navigationBarTest.testClickProject",
//    })

    @Test
    public void testCheckFilterByProjectStatusInitiate() {
        projects.CheckFilterByProjectStatusInitiate();
    }

    @Test
    public void testCheckFilterByProjectStatusExecuting() {
        projects.CheckFilterByProjectStatusExecuting();
    }

    @Test
    public void testCheckFilterByProjectStatusHypercare(){
        projects.CheckFilterByProjectStatusHypercare();
    }

    @Test
    public void testCheckFilterByProjectStatusCompleted(){
        projects.CheckFilterByProjectStatusCompleted();
    }

    @Test
    public void testCheckFilterByProjectStatusDiscontinued(){
        projects.CheckFilterByProjectStatusDiscontinued();
    }


}
