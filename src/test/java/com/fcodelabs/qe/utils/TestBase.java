package com.fcodelabs.qe.utils;

import com.fcodelabs.qe.common.LoggerUtil;
import com.fcodelabs.qe.models.TestData;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;

import static com.fcodelabs.qe.common.Constants.SAMPLE_JSON;
import static com.fcodelabs.qe.common.Constants.TEST_DATA_DIRECTORY;

public class TestBase {

    public static SoftAssert softAssert;
    public static TestData postDataList;
    public static  TestData.TestDataInfo testDataInfoList;

    @BeforeSuite
    public static void loadTestDataInfo() {
        postDataList = (TestData) DataUtils.loadTestDataList(TEST_DATA_DIRECTORY + SAMPLE_JSON, TestData.class);
    }

    @BeforeMethod
    public void init(Method method) {
        softAssert = new SoftAssert();
        LoggerUtil.logINFO("Running test - " + method.getName());
    }

    @BeforeTest(alwaysRun = true)
    public void init() {
        LoggerUtil.logINFO("Test Running " + this.getClass().toString());
    }

}
