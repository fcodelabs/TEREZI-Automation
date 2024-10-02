package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class projectCreateTest extends PlaywrightTestBase {
    project Projects;

    @BeforeMethod
    public void setUp() {
        Projects = new project(getPage());
    }

    @Test(description = "HRIS-TC-74")
    public void testCheckCreateProjectFormAvailability(){
        Projects.CheckCreateProjectFormAvailability();
    }

    @Test(description = "HRIS-TC-73")
    public void testCheckCreateProjectFormContent(){
        Projects.CheckCreateProjectFormContent();
    }

    @Test(description = "HRIS-TC-")
    public void testCheckCreateProjectFormMandatoryFields(){
        Projects.CheckCreateProjectFormMandatoryFields();
    }

    @DataProvider(name = "CreateProjectDataProviderSuccessful")
    public Object[][] createProjectCredsSuccessful() {
        return new Object[][]{
                {"Automation two", "", "10/01/2024", "10/31/2024", "2", "Dasun Hettiarachchi"}
        };
    }

    @Test(dependsOnMethods = {
            "com.fcodelabs.qe.tests.web.signInTest.testSignInSuccessful",
            "com.fcodelabs.qe.tests.web.navigationBarTest.testClickProject"
    }, dataProvider = "CreateProjectDataProviderSuccessful")
    public void testCreateProject(String projectName, String clientName, String TentativeStart, String TentativeEnd, String hypercarePeriod, String projectManager) {
        getPage().waitForTimeout(10000);
        Projects.CreateProject(projectName, clientName, TentativeStart, TentativeEnd, hypercarePeriod, projectManager);
    }
}
