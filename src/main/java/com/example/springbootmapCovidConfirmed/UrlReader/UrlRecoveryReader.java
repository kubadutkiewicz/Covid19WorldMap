package com.example.springbootmapCovidConfirmed.UrlReader;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.io.StringReader;

@Service
public class UrlRecoveryReader {

    private static final String urlCovidRecovery = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_recovered_global.csv";

    public StringReader getValuesCovidRecovery() {
        RestTemplate restTemplate = new RestTemplate();
        String values = restTemplate.getForObject(urlCovidRecovery,String.class);
        StringReader stringReader = new StringReader(values);
        return stringReader;
    }
}
