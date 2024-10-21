package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import com.microsoft.playwright.Page;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class projectDetailsTest extends PlaywrightTestBase {
    project projects;

    @BeforeClass
    public void setup() {
        Page page = getPage();
        projects = new project(page);
    }

    @Test(description = "HRIS-TC-60,62,64,65,70")
    public void testCheckProjectDetailsPageContent() {
        projects.CheckProjectDetailsPageContentForOperationLead();
    }
}
