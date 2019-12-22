package com.bussviverros.bossviverros.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class UrlLoaderUtil {
    public String loadDataFromUrl(String url) throws Exception {
        URL oracle = new URL(url);
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String inputLine;
        StringBuilder stringBuilder = new StringBuilder();
        while ((inputLine = in.readLine()) != null) {
            stringBuilder.append(inputLine);
        }
        return stringBuilder.toString();
    }
}
