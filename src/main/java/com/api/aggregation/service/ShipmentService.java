package com.api.aggregation.service;

import javax.naming.ServiceUnavailableException;
import java.util.List;
import java.util.Map;

public interface ShipmentService {
    Map<String, List<String>> getShipments(String shipmentsInput) throws ServiceUnavailableException;
}
