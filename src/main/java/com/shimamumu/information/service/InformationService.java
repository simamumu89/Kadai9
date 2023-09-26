package com.shimamumu.information.service;

import com.shimamumu.information.entity.Information;
import com.shimamumu.information.mapper.InformationMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InformationService {

    private final InformationMapper informationMapper;

    // constructor injection
    // dependancy injection DI
    public InformationService(InformationMapper informationMapper) {
        this.informationMapper = informationMapper;
    }

    public List<Information> getInformation(){
        List<Information> informations = informationMapper.findAll();

        return informations;
    }
}
