package com.bussviverros.bossviverros.govfetch;

import com.bussviverros.bossviverros.util.UrlLoaderUtil;

public class GovBusStopFetcher {
    public String fetchBusStopData(String url) {
        try {
            UrlLoaderUtil urlLoaderUtil = new UrlLoaderUtil();
            return urlLoaderUtil.loadDataFromUrl(url);
        } catch (Exception ex) {
            return "{ \"success\" : false }";
        }
    }
}
