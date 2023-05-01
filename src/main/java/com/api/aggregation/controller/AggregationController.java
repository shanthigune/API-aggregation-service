package com.api.aggregation.controller;

import com.api.aggregation.domain.ResponseDto;
import com.api.aggregation.results.ResponseWrapper;
import com.api.aggregation.service.AggregationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(produces = "application/json")
public class AggregationController {

    @Autowired
    private AggregationService aggregationService;

    @GetMapping("/aggregation")
    ResponseWrapper<ResponseDto> aggregation(@RequestParam(required = false) final String pricing,
                                             @RequestParam(required = false) final String track,
                                             @RequestParam(required = false) final String shipments) {
        try {
            ResponseDto response = aggregationService.getResponse(pricing, track, shipments);
            return new ResponseWrapper<>(response, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseWrapper<>(HttpStatus.SERVICE_UNAVAILABLE);
        }

    }
}
