package com.example.springbootmapCovidConfirmed.UrlData;

import org.springframework.stereotype.Service;

import java.io.StringReader;

@Service
public class DeathsData implements ValuesFromUrl {

    private static final String urlCovidDeaths = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_deaths_global.csv";

    private RestTemplateUrlReader restTemplateUrlReader;

    public DeathsData(RestTemplateUrlReader restTemplateUrlReader) {
        this.restTemplateUrlReader = restTemplateUrlReader;
    }

    @Override
    public StringReader getValuesFromUrlFiles() {
        String values = restTemplateUrlReader.readUrl(urlCovidDeaths);
        StringReader stringReader = new StringReader(values);
        return stringReader;
    }
}
