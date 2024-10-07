package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import com.microsoft.playwright.Page;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class projectSearchTest extends PlaywrightTestBase {
    project projects;

    @BeforeClass
    public void setup() {
        Page page = getPage();
        projects = new project(page);
    }

    @DataProvider(name = "searchValidDataProvider")
    public Object[][] searchValidDataProvider() {
        return new Object[][]{
                {"TEREZI Automation One"}
        };
    }

    @Test(dependsOnMethods = {
            "com.fcodelabs.qe.tests.web.signInTest.testSignInSuccessful",
            "com.fcodelabs.qe.tests.web.navigationBarTest.testClickProject",
    },description = "HRIS-TC-376")
    public void testCheckSearchProject() {
        projects.CheckSearchProject();
    }

    @Test(dataProvider = "searchValidDataProvider",description = "HRIS-TC-376")
    public void testCheckSearchProjectResults(String searchItem) {
        projects.CheckSearchProjectResults(searchItem);
    }
}
