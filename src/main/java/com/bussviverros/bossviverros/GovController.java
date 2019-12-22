package com.bussviverros.bossviverros;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

@RestController
public class GovController {
    @RequestMapping("/gov")
    public String getGovData() throws Exception {
        URL oracle = new URL("https://przyjazdy.pl/api/przystanki/gop");
        URLConnection yc = oracle.openConnection();
        BufferedReader in = new BufferedReader(new InputStreamReader(
                yc.getInputStream()));
        String inputLine;
        StringBuilder stringBuilder = new StringBuilder();
        while ((inputLine = in.readLine()) != null)
            stringBuilder.append(inputLine);
        return stringBuilder.toString();
    }
}
