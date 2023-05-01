package com.api.aggregation.service.impl;

import com.api.aggregation.service.TrackService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.naming.ServiceUnavailableException;
import java.util.HashMap;
import java.util.Map;

@Service
public class TrackServiceImpl implements TrackService {

    @Value("${api.tracking.url}")
    private String trackingAPI;

    @Override
    public Map<String, String> getTrack(String trackInout) throws ServiceUnavailableException {
        final String uri = trackingAPI + trackInout;
        RestTemplate restTemplate = new RestTemplate();
        Map<String, String> result = restTemplate.getForObject(uri, HashMap.class);
        return result;
    }
}
