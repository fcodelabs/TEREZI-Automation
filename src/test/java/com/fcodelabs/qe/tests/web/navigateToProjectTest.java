package com.fcodelabs.qe.tests.web;

import com.fcodelabs.qe.utils.PlaywrightTestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.fcodelabs.qe.uipges.web.navigateToProjects;
import com.microsoft.playwright.Page;

public class navigateToProjectTest extends PlaywrightTestBase {

    navigateToProjects NavigateToProjects;

    @BeforeClass
    public void setup() {
        Page page = getPage(); // Ensure this method returns a valid Page instance
        NavigateToProjects = new navigateToProjects(page); // Initialize LandingPage with the Page instance
    }

    @Test(dependsOnMethods = {"com.fcodelabs.qe.tests.web.signInTest.enterEmail", "com.fcodelabs.qe.tests.web.signInTest.signIn"})
    public void testClickProject() {
        NavigateToProjects.ClickProject(); // This should now work as LandingPage is initialized
    }
}
