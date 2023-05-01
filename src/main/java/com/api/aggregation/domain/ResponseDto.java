package com.api.aggregation.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

@Data
@Getter
@Setter
public class ResponseDto implements Serializable {

    private Map<String,Double> pricing;
    private Map<String,String> track;
    private Map<String, List<String>> shipment;

}
