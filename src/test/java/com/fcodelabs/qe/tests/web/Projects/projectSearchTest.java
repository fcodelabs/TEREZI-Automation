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

    @DataProvider(name = "searchDataProvider")
    public Object[][] searchDataProvider() {
        return new Object[][]{
                {"TEREZI Automation"}
        };
    }

    @Test(dependsOnMethods = {
            "com.fcodelabs.qe.tests.web.signInTest.testSignInSuccessful",
            "com.fcodelabs.qe.tests.web.navigationBarTest.testClickProject",
    })
    public void testCheckSearchProject() {
        projects.CheckSearchProject();
    }

    @Test(dataProvider = "searchDataProvider")
    public void testCheckSearchProjectResults(String searchItem) {
        projects.CheckSearchProjectResults(searchItem);
    }
}
