package com.fcodelabs.qe.utils;

import com.fcodelabs.qe.appium.driverfactory.IOSFactory;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class IOSTestBase extends IOSFactory {

    @BeforeTest()
    public void init() throws IOException {
        iOSDeviceSetup();
    }
}
