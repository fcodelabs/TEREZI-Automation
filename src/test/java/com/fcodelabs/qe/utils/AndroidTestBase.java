package com.fcodelabs.qe.utils;

import com.fcodelabs.qe.appium.driverfactory.AndroidFactory;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class AndroidTestBase extends AndroidFactory {

    @BeforeTest()
    public void init() throws IOException {
        androidDeviceSetup();
    }
}
