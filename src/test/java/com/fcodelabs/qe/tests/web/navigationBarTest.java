package com.fcodelabs.qe.tests.web;

import com.fcodelabs.qe.utils.PlaywrightTestBase;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.fcodelabs.qe.uipges.web.navigationBar;
import com.microsoft.playwright.Page;

public class navigationBarTest extends PlaywrightTestBase {

    navigationBar NavigationBar;

    @BeforeClass
    public void setup() {
        Page page = getPage(); // Ensure this method returns a valid Page instance
        NavigationBar = new navigationBar(page); // Initialize LandingPage with the Page instance
    }

    @Test(dependsOnMethods = {"com.fcodelabs.qe.tests.web.signInTest.enterEmail", "com.fcodelabs.qe.tests.web.signInTest.signIn"})
    public void testClickResourceAllocation() {
        NavigationBar.ClickResourceAllocation();
    }

    @Test
    public void testClickProject() {
        NavigationBar.ClickProject();
    }

    @Test
    public void testClickNotification(){
        NavigationBar.ClickNotification();
    }

    @Test
    public void testClickPendingAction(){
        NavigationBar.ClickPendingAction();
    }

    @Test
    public void testClickToolsAndTech(){
        NavigationBar.ClickToolsAndTech();
    }

    @Test
    public void testClickUsers(){
        NavigationBar.ClickUsers();
    }
}
