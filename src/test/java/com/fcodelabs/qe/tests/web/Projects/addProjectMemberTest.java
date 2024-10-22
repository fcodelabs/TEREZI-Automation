package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class addProjectMemberTest extends PlaywrightTestBase {
    project Projects;

    @BeforeMethod
    public void setUp() {
        Projects = new project(getPage());
    }

    @DataProvider(name = "AddMemberDataProviderSuccessful")
    public Object[][] addMemberCredsSuccessful() {
        return new Object[][]{
                {"Test User 2", "Full Stack Developer", "10"}
        };
    }

    @Test(description = "HRIS-TC-70")
    public void testCheckAddProjectMemberButtonAvailability(){
        Projects.CheckAddProjectMemberButtonAvailability();
    }

    @Test(description = "HRIS-TC-75")
    public void testCheckAddProjectMemberFormContent(){
        Projects.CheckAddProjectMemberFormContent();
    }

    @Test(dataProvider = "AddMemberDataProviderSuccessful",description = "HRIS-TC-312, step-1")
    public void testCheckAddProjectMember(String name, String role, String allocation) {
        Projects.CheckAddProjectMember(name, role, allocation);
    }

    @Test(description = "HRIS-TC-")
    public void testCheckAddProjectMemberFormMandatoryFields(){
        Projects.CheckAddProjectMemberFormMandatoryFields();
    }
}
