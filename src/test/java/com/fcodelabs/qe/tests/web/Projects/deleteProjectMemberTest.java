package com.fcodelabs.qe.tests.web.Projects;

import com.fcodelabs.qe.uipges.web.project;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class deleteProjectMemberTest extends PlaywrightTestBase {
    project Projects;

    @DataProvider(name = "SearchMemberDataProviderSuccessful")
    public Object[][] addMemberCredsSuccessful() {
        return new Object[][]{
                {"Test User 2"}
        };
    }

    @Test(dataProvider = "SearchMemberDataProviderSuccessful",description = "HRIS-TC-69")
    public void testCheckSearchProjectMember(String memberSearchInput) {
        getPage().waitForTimeout(10000);
        Projects.CheckSearchProjectMember(memberSearchInput);
    }

    @DataProvider(name = "DeleteMemberDataProviderSuccessful")
    public Object[][] deleteMemberCredsSuccessful() {
        return new Object[][]{
                {"Test User 2"}
        };
    }

    @Test(dataProvider = "deleteMemberCredsSuccessful",description = "HRIS-TC-, step-1")
    public void testCheckDeleteProjectMember(String name) {
        Projects.CheckDeleteProjectMember(name);
    }
}
