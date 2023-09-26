package com.shimamumu.information.controller;

import com.shimamumu.information.entity.Information;
import com.shimamumu.information.service.InformationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class InformationController {

    private final InformationService informationService;

    public InformationController(InformationService informationService) {
        this.informationService = informationService;
    }

    @GetMapping("/informations")
    public List<Information> getInformation(){
        List<Information> informations = informationService.getInformation();
        return informations;
    }
}
