package com.fcodelabs.qe.functions;

import com.fcodelabs.qe.api.jackson.JacksonUtil;
import com.fcodelabs.qe.api.restassured.RestUtil;
import com.fcodelabs.qe.data.RequestMethods;
import com.fcodelabs.qe.models.request.RequestModel;
import io.restassured.response.Response;
import com.fcodelabs.qe.models.response.ResponseModel;
import com.fcodelabs.qe.utils.json.JsonUtils;

import java.util.HashMap;
import java.util.Objects;

import static com.fcodelabs.qe.common.Constants.*;

public class APIRequestFunction {

    private APIRequestFunction() {
    }

    public static String setProtocolHostAndBasePath(String protocol, String host, String basePath) {
        RestUtil.API_HOST = protocol + host;
        RestUtil.BASE_PATH = basePath;
        return protocol;
    }

    public static ResponseModel getApiResponse(RequestModel requestModel) {
        setProtocolHostAndBasePath(BASE_HTTP_PROTOCOL,BASE_DOMAIN,BASE_PATH);
        String body = JacksonUtil.convertObjectToJsonString(requestModel);
        Response response = RestUtil.send(new HashMap<>(), body, URI, RequestMethods.POST.getRequestMethod());
        ResponseModel resp = (ResponseModel) JsonUtils.getResponseAsObject(response.asString(), ResponseModel.class);
        Objects.requireNonNull(resp).setResponseCode(response.getStatusCode());
        return resp;
    }
}
