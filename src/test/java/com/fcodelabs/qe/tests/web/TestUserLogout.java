package com.fcodelabs.qe.tests.web;

import com.fcodelabs.qe.uipges.web.LoginPage;
import com.fcodelabs.qe.uipges.web.SecureAreaPage;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestUserLogout extends PlaywrightTestBase {

    LoginPage loginPage;
    SecureAreaPage secureAreaPage;

    @Test()
    public void userLogout() {
        loginPage = new LoginPage(getPage());
        secureAreaPage = new SecureAreaPage(getPage());

        secureAreaPage.logoutUser();
        Assert.assertTrue(loginPage.isLoginPageVisible(), "User not logged out successfully");

    }
}
