package com.example.springbootmapCovidConfirmed;

import org.springframework.stereotype.Controller;

@Controller
public class Date {

    private static final String date = "1/10/21";

    public String getDate() {
        return date;
    }
}
