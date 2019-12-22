package com.bussviverros.bossviverros.services;

import com.bussviverros.bossviverros.govfetch.GovBusStopFetcher;
import org.springframework.stereotype.Service;

@Service
public class GovTransService implements GovService {
    @Override
    public String loadBusStopData(String url) {
        GovBusStopFetcher govBusStopFetcher = new GovBusStopFetcher();
        return govBusStopFetcher.fetchBusStopData(url);
    }
}
