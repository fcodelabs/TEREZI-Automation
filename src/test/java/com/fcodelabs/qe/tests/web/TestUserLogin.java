package com.fcodelabs.qe.tests.web;

import com.fcodelabs.qe.uipges.web.LoginPage;
import com.fcodelabs.qe.uipges.web.SecureAreaPage;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestUserLogin extends PlaywrightTestBase {

    LoginPage loginPage;
    SecureAreaPage secureAreaPage;

    @DataProvider(name = "loginDataProvider")
    public Object[][] loginCreds() {
        return new Object[][]{
                {"tomsmith", "SuperSecretPassword!"}
        };
    }

    @Test(dataProvider = "loginDataProvider")
    public void userLogin(String userName, String password) {
        loginPage = new LoginPage(getPage());
        secureAreaPage = new SecureAreaPage(getPage());

        loginPage.userLogin(userName, password);
        Assert.assertTrue(secureAreaPage.isSuccessfulLoginMsgDisplayed().contains("You logged into a secure area!"), "Text Does not match");

    }
}
