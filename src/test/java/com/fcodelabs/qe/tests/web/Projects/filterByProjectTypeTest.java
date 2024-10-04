package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import com.microsoft.playwright.Page;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class filterByProjectTypeTest extends PlaywrightTestBase {
    project projects;

    @BeforeClass
    public void setup() {
        Page page = getPage();
        projects = new project(page);
    }

    @Test(dependsOnMethods = {
            "com.fcodelabs.qe.tests.web.signInTest.testSignInSuccessful",
            "com.fcodelabs.qe.tests.web.navigationBarTest.testClickProject",
    })
    public void testCheckFilterByProjectTypeOptionFTFC() {
        projects.CheckFilterByProjectTypeOptionFTFC();
    }

    @Test
    public void testCheckFilterByProjectTypeOptionTimeAndMaterial() {
        projects.CheckFilterByProjectTypeOptionTimeAndMaterial();
    }


    @Test
    public void testCheckFilterByProjectTypeOptionTimeAndMaterialWithBudgetCap() {
        projects.CheckFilterByProjectTypeOptionTimeAndMaterialWithBudgetCap();
    }
}
