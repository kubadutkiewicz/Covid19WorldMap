package com.example.springbootmapCovidConfirmed;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class MapController {

    @GetMapping(value = "/map")
    public String getMap(Model model) throws IOException {
        model.addAttribute("points", covidConfirmed.getCovidDate());
        return "map";
    }

    private CovidConfirmed covidConfirmed;

    public MapController(CovidConfirmed covidConfirmed) {
        this.covidConfirmed = covidConfirmed;
    }

}
