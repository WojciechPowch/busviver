package com.bussviverros.bossviverros.govfetch;

import com.bussviverros.bossviverros.util.UrlLoaderUtil;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class GovMainDataFetcher {
    private static volatile GovMainDataFetcher instance;
    private String mainGovData;

    private GovMainDataFetcher() {
        setMainGovData();
    }

    public static GovMainDataFetcher getInstance() {
        if (null == instance) {
            instance = new GovMainDataFetcher();
            return instance;
        } else {
            return instance;
        }
    }

    public String getMainGovData() {
        return mainGovData;
    }

    private void setMainGovData() {
        try {
            UrlLoaderUtil urlLoaderUtil = new UrlLoaderUtil();
            this.mainGovData = urlLoaderUtil.loadDataFromUrl("https://przyjazdy.pl/api/przystanki/gop");
        } catch (Exception ex) {
            this.mainGovData = "";
        }
    }
}
