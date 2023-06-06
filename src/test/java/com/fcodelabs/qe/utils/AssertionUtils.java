package com.fcodelabs.qe.utils;

import com.fcodelabs.qe.models.response.ResponseModel;

public class AssertionUtils extends TestBase {

    public static void assertName(ResponseModel actualResponse, ResponseModel expectedResponse) {
        softAssert.assertEquals(actualResponse.getName(), expectedResponse.getName(), "Invalid name");
    }

}
