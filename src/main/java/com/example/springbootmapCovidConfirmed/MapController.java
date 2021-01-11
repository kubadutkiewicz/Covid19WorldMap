package com.example.springbootmapCovidConfirmed;

import com.example.springbootmapCovidConfirmed.CovidData.CovidConfirmed;
import com.example.springbootmapCovidConfirmed.CovidData.CovidDeaths;
import com.example.springbootmapCovidConfirmed.CovidData.CovidRecovery;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;

@Controller
public class MapController {

    private CovidConfirmed covidConfirmed;
    private CovidDeaths covidDeaths;
    private CovidRecovery covidRecovery;

    public MapController(CovidConfirmed covidConfirmed, CovidDeaths covidDeaths, CovidRecovery covidRecovery) {
        this.covidConfirmed = covidConfirmed;
        this.covidDeaths = covidDeaths;
        this.covidRecovery = covidRecovery;
    }

    @GetMapping(value = "/map")
    public String getMap(Model model, Model modelDeaths, Model modelRecovery) throws IOException {
        model.addAttribute("points", covidConfirmed.getCovidConfirmedData());
        modelDeaths.addAttribute("pointsDeaths", covidDeaths.getCovidDeathsData());
        modelRecovery.addAttribute("pointsRecovery", covidRecovery.getCovidRecoveryData());
        return "map";
    }

}
