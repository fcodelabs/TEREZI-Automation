package com.fcodelabs.qe.models;

import com.fcodelabs.qe.models.request.RequestModel;
import com.fcodelabs.qe.models.response.ResponseModel;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;
import java.util.List;

@Getter
@Setter
public class TestData implements Serializable {
    private List<TestDataInfo> testDataInfoList;

    @Setter
    @Getter
    public static class TestDataInfo implements Serializable {
        private String testCaseReference;
        private RequestModel request;
        private ResponseModel response;
    }
}
