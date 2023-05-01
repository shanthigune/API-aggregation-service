package com.api.aggregation.service;

import java.util.HashMap;

public interface PricingService {
    HashMap<String,Double> getPricing(String pricingInput);
}
