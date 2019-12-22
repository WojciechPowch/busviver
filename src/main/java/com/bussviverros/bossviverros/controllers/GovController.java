package com.bussviverros.bossviverros.controllers;

import com.bussviverros.bossviverros.govfetch.GovMainDataFetcher;
import com.bussviverros.bossviverros.services.GovService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GovController {
    @Autowired
    private GovService govService;

    @GetMapping("/gov-citys")
    public String getGovData() {
        GovMainDataFetcher govMainDataFetcher = GovMainDataFetcher.getInstance();
        return govMainDataFetcher.getMainGovData();
    }

    @GetMapping("/gov-stop-data")
    public String getGovStopData(@RequestParam(name = "url") String url) {
        return govService.loadBusStopData(url);
    }
}
