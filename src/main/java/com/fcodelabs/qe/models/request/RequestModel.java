package com.fcodelabs.qe.models.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fcodelabs.qe.api.request.RequestBase;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;

@Getter
@Setter
public class RequestModel extends RequestBase implements Serializable {
    RequestModel() {
        super();
    }
    @JsonProperty("name")
    private String name;
    @JsonProperty("job")
    private String job;
}
