package com.fcodelabs.qe.uipges.mobile.android;

import com.fcodelabs.qe.appium.pagebase.AndroidPageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends AndroidPageBase {
    @AndroidFindBy(id = "com.moht.hopes.dev:id/login_or_register_b")
    WebElement btnRegisterLogin;
    @AndroidFindBy(id = "com.moht.hopes.dev:id/login_or_register_btn")
    WebElement txtPatientName;

    public LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void registerPatient(String patientName) {
        clickElement(btnRegisterLogin);

    }

}
