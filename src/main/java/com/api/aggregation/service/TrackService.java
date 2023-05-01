package com.api.aggregation.service;

import javax.naming.ServiceUnavailableException;
import java.util.Map;

public interface TrackService {
    Map<String,String> getTrack(String trackInout) throws ServiceUnavailableException;
}
