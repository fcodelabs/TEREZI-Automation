package com.fcodelabs.qe.tests.mobile;

import com.fcodelabs.qe.appium.driverfactory.IOSFactory;
import com.fcodelabs.qe.uipges.mobile.ios.LoginPage;
import com.fcodelabs.qe.utils.IOSTestBase;
import org.testng.annotations.Test;

public class SampleIOSTest extends IOSTestBase {

    LoginPage loginPage;

    @Test
    public void userRegistration() {
        loginPage = new LoginPage(driver);

        loginPage.registerPatient("AK");


    }
}
