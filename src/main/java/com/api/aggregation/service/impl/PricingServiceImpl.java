package com.api.aggregation.service.impl;

import com.api.aggregation.service.PricingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
public class PricingServiceImpl implements PricingService {

    @Value("${api.pricing.url}")
    private String pricingAPI;

    @Override
    public HashMap<String, Double> getPricing(String pricingInput) {
        final String uri = pricingAPI + pricingInput;

        RestTemplate restTemplate = new RestTemplate();
        HashMap<String, Double> result = restTemplate.getForObject(uri, HashMap.class);
        return result;
    }
}
