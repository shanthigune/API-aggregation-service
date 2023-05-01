package com.api.aggregation.service.impl;

import com.api.aggregation.service.ShipmentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.naming.ServiceUnavailableException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    @Value("${api.shipment.url}")
    private String shipmentAPI;

    @Override
    public Map<String, List<String>> getShipments(String shipmentsInput) throws ServiceUnavailableException {
        final String uri = shipmentAPI + shipmentsInput;
        RestTemplate restTemplate = new RestTemplate();
        Map<String, List<String>> result = restTemplate.getForObject(uri, HashMap.class);
        return result;
    }
}
