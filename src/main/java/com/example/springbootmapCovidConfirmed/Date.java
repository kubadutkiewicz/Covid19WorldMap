package com.example.springbootmapCovidConfirmed;

import org.springframework.stereotype.Controller;

@Controller
public class Date {

    private static final String date = "1/13/21";

    public String getDate() {
        return date;
    }
}
