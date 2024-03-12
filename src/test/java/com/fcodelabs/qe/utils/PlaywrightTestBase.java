package com.fcodelabs.qe.utils;

import com.fcodelabs.qe.playwright.WebFactory;
import org.testng.IAnnotationTransformer;
import org.testng.IInvokedMethodListener;
import org.testng.ISuiteListener;
import org.testng.ITestListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class PlaywrightTestBase extends WebFactory implements ITestListener, IInvokedMethodListener, ISuiteListener, IAnnotationTransformer {


    @BeforeTest
    public void init() {
        initBrowser();

    }

    @AfterTest
    public void quit() {
        quitBrowser();
    }
}
