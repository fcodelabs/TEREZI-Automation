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
//                {"testuser1@fcodelabs.com", "Tharu@1234"},
//                {"testuser2@fcodelabs.com", "Password123"},
//                {"invaliduser@fcodelabs.com", "WrongPassword"},
//                {"testuser3@fcodelabs.com", "Tharu@5678"}
        };
    }


    @Test(dataProvider = "loginDataProvider", groups = {"signInTest"})
    public void testSignIn(String email, String password) {
        sign.signIn(email, password);  // Only the password is needed here
    }

}
