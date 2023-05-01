package com.api.aggregation.service;

import com.api.aggregation.domain.ResponseDto;

import javax.naming.ServiceUnavailableException;


public interface AggregationService {
    ResponseDto getResponse(String pricingInout, String trackInput, String shipmentsInput) throws ServiceUnavailableException;
}
