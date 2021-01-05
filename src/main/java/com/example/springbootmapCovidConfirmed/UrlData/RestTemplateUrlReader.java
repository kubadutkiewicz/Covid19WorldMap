package com.example.springbootmapCovidConfirmed.UrlData;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateUrlReader {

    RestTemplate restTemplate = new RestTemplate();

    public String readUrl(String url) {
        String values = restTemplate.getForObject(url,String.class);
        return values;
    }


}
