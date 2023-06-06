package com.fcodelabs.qe.models.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fcodelabs.qe.api.response.ResponseBase;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;

@Getter
@Setter
public class ResponseModel extends ResponseBase implements Serializable {

    @JsonProperty("name")
    private String name;
    @JsonProperty("job")
    private String job;
    @JsonProperty("id")
    private String id;
    @JsonProperty("createdAt")
    private String createdAt;

}

