package com.fcodelabs.qe.tests;

import com.fcodelabs.qe.functions.APIRequestFunction;
import com.fcodelabs.qe.models.response.ResponseModel;
import com.fcodelabs.qe.utils.AssertionUtils;
import com.fcodelabs.qe.utils.DataUtils;
import com.fcodelabs.qe.utils.TestBase;
import org.testng.annotations.Test;


import static com.fcodelabs.qe.api.jackson.ApiStatusCodes.RESPONSE_CODE_201;

public class SampleTests extends TestBase {

    @Test(description = "test with the listed acceptance criteria")
    public static void testVerifyAcceptanceCriteria() {
        testDataInfoList = DataUtils.getTestDataInfo(postDataList, "TC-001");
        ResponseModel response = APIRequestFunction.getApiResponse(testDataInfoList.getRequest());
        softAssert.assertEquals(response.getResponseCode(),RESPONSE_CODE_201);
        AssertionUtils.assertName(response, testDataInfoList.getResponse());
        softAssert.assertAll();
    }
}
