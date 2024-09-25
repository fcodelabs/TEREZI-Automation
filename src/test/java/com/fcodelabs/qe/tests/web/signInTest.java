package com.fcodelabs.qe.tests.web;

import com.fcodelabs.qe.uipges.web.signIn;
import com.fcodelabs.qe.utils.PlaywrightTestBase;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class signInTest extends PlaywrightTestBase {

    signIn sign;

    @BeforeMethod
    public void setUp() {
        sign = new signIn(getPage());
    }

    @DataProvider(name = "loginDataProvider")
    public Object[][] loginCreds() {
        return new Object[][]{
                {"testuser1@fcodelabs.com", "Tharu@1234"}
        };
    }

    @Test(dataProvider = "loginDataProvider", groups = {"signInTest"})
    public void enterEmail(String email, String password) {
        sign.enterEmail(email);  // Only the email is needed here
    }

    @Test(dataProvider = "loginDataProvider", groups = {"signInTest"})
    public void signIn(String email, String password) {
        sign.signIn(password);  // Only the password is needed here
    }

}
