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

    @DataProvider(name = "loginDataProviderSuccessful")
    public Object[][] loginCredsSuccessful() {
        return new Object[][]{
                {"testuser1@fcodelabs.com", "Tharu@1234"}
        };
    }

    @DataProvider(name = "loginDataProviderUnsuccessfulWrongEmail")
    public Object[][] loginCredsUnsuccessfulWrongEmail() {
        return new Object[][]{
                {"dasundhammasara9@gmail.com", "Tharu@1234"}
        };
    }

    @DataProvider(name = "loginDataProviderUnsuccessfulWrongPassword")
    public Object[][] loginCredsUnsuccessfulWrongPassword() {
        return new Object[][]{
                {"testuser1@fcodelabs.com", "Tharu1234"}
        };
    }


    @Test(dataProvider = "loginDataProviderSuccessful", groups = {"signInTest"})
    public void testSignInSuccessful(String email, String password) {
        sign.signInSuccessful(email, password);
    }

    @Test(dataProvider = "loginDataProviderUnsuccessfulWrongEmail", groups = {"signInTest"})
    public void testSignInUnsuccessfulWrongEmail(String email, String password) {
        sign.signInUnsuccessfulWrongEmail(email, password);
    }

    @Test(dataProvider = "loginDataProviderUnsuccessfulWrongPassword", groups = {"signInTest"})
    public void testSignInUnsuccessfulWrongPassword(String email, String password) {
        sign.signInUnsuccessfulWrongPassword(email, password);
    }

}
