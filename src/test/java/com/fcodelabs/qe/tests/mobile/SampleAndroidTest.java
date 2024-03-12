package com.fcodelabs.qe.tests.mobile;

import com.fcodelabs.qe.appium.driverfactory.AndroidFactory;
import com.fcodelabs.qe.uipges.mobile.android.LoginPage;
import com.fcodelabs.qe.utils.AndroidTestBase;
import org.testng.annotations.Test;

public class SampleAndroidTest extends AndroidTestBase {

    LoginPage loginPage;

    @Test(description = "User registered successfully")
    public void userRegistration() {
        loginPage = new LoginPage(driver);

        loginPage.registerPatient("AK");


    }
}
