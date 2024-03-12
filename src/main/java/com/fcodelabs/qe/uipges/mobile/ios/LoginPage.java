package com.fcodelabs.qe.uipges.mobile.ios;

import com.fcodelabs.qe.appium.pagebase.IOSPageBase;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class LoginPage extends IOSPageBase {
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Login / Register with QR Code\"`]")
    WebElement btnRegisterLogin;
    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeStaticText[`name == \"Login / Register with QR Code\"`]")
    WebElement txtPatientName;

    public LoginPage(AppiumDriver appiumDriver) {
        super(appiumDriver);
    }

    public void registerPatient(String patientName) {

        clickElement(btnRegisterLogin);
        typeText(txtPatientName, patientName);
    }
}
