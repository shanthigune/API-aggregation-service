package com.api.aggregation.service.impl;

import com.api.aggregation.domain.ResponseDto;
import com.api.aggregation.service.AggregationService;
import com.api.aggregation.service.PricingService;
import com.api.aggregation.service.ShipmentService;
import com.api.aggregation.service.TrackService;
import io.micrometer.common.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.naming.ServiceUnavailableException;

@Service
public class AggregationServiceImpl implements AggregationService {

    @Autowired
    private PricingService pricingService;

    @Autowired
    private TrackService trackService;

    @Autowired
    private ShipmentService shipmentService;

    @Override
    public ResponseDto getResponse(String pricingInput, String trackInput, String shipmentsInput) throws ServiceUnavailableException {
        ResponseDto responseDto = new ResponseDto();

        if (StringUtils.isNotEmpty(pricingInput)) {
            responseDto.setPricing(pricingService.getPricing(pricingInput));
        }
        if (StringUtils.isNotEmpty(trackInput)) {
            responseDto.setTrack(trackService.getTrack(trackInput));
        }
        if (StringUtils.isNotEmpty(shipmentsInput)) {
            responseDto.setShipment(shipmentService.getShipments(shipmentsInput));
        }

        return responseDto;
    }

}
