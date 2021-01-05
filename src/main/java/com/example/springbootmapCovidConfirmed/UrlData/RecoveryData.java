package com.example.springbootmapCovidConfirmed.UrlData;

import org.springframework.stereotype.Service;

import java.io.StringReader;

@Service
public class RecoveryData extends GetValuesFromUrl {

    private static final String urlCovidRecovery = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_recovered_global.csv";

    private RestTemplateUrlReader restTemplateUrlReader;

    public RecoveryData(RestTemplateUrlReader restTemplateUrlReader) {
        this.restTemplateUrlReader = restTemplateUrlReader;
    }

    public StringReader getValuesFromUrlFiles() {
        String values = restTemplateUrlReader.readUrl(urlCovidRecovery);
        StringReader stringReader = new StringReader(values);
        return stringReader;
    }
}
