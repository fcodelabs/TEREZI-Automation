package com.fcodelabs.qe.common;

import com.fcodelabs.qe.utils.PropertyUtils;

public class Constants {
    Constants() {
    }

    public static final String PATH_TO_RESOURCE = System.getProperty("user.dir") + "/src/main/resources/";
    public static final String CONFIG_FILE_NAME = System.getProperty("config.file.name", "config.properties");
    public static final String BASE_HTTP_PROTOCOL = "https://";
    public static final String BASE_DOMAIN = PropertyUtils.getProperty("base.domain");
    public static final String BASE_VERSION = "/v1";
    public static final String BASE_PATH = "";
    public static final String URI = "api/users";
    public static final String TEST_RESOURCE_PATH = System.getProperty("user.dir") +"/src/test/resources";
    public static final String TEST_DATA_DIRECTORY = TEST_RESOURCE_PATH + "/testdata";
    public static final String SAMPLE_JSON = "/sample.json";
}
