/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.services.Impl;

import com.hvn.repositories.SurveyformRepository;
import com.hvn.services.SurveyformService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hoang
 */
@Service
public class SurveyformServiceImpl implements SurveyformService{
    @Autowired
    private SurveyformRepository  surveyformRepositori;

    @Override
    public List<Object[]> getSurveyform() {
        return this.surveyformRepositori.getSurveyform();
    }
    
}
