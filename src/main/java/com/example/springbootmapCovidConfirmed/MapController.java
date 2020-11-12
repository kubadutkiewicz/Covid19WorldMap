package com.example.springbootmapCovidConfirmed;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class MapController {

    private CovidConfirmed covidConfirmed;

    public MapController(CovidConfirmed covidConfirmed) {
        this.covidConfirmed = covidConfirmed;
    }

    //TODO !!!
    @GetMapping
    public String getDate(){
        return "ChooseDate";
    }

    //working link
    @GetMapping("/map")
    public String getMap(Model model) throws IOException {

        model.addAttribute("points", covidConfirmed.getCovidDate());
        return "map";
    }
}
