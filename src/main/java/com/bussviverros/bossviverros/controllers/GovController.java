package com.bussviverros.bossviverros.controllers;

import com.bussviverros.bossviverros.govfetch.GovMainDataFetcher;
import com.bussviverros.bossviverros.services.GovService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/gov")
public class GovController {
    @Autowired
    private GovService govService;

    @GetMapping(value = "/stops", produces = "application/json")
    public String getGovData() {
        GovMainDataFetcher govMainDataFetcher = GovMainDataFetcher.getInstance();
        return govMainDataFetcher.getMainGovData();
    }

    @GetMapping(value = "/stop-data", produces = "application/json")
    public String getGovStopData(@RequestParam(name = "url") String url) {
        return govService.loadBusStopData(url);
    }
}
