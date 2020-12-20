package com.example.springbootmapCovidConfirmed;

import org.springframework.stereotype.Controller;

@Controller
public class Date {

    private static final String date = "12/19/20";

    public String getDate() {
        return date;
    }
}
