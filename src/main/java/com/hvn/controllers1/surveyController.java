/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.controllers1;

import com.hvn.pojo.Surveyform;
import com.hvn.services.SurveyformService;
import com.hvn.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author hoang
 */
@Controller
public class surveyController {
    @Autowired
    private SurveyformService surveyformService;
    
    @Autowired
    private UserService userService;

    @GetMapping("/surveys")
    public String surveys(Model model) {
        model.addAttribute("surveys", this.surveyformService.getSurveyform());
        return "surveys";
    }
        @GetMapping("/surveys/survey_create")
    public String survey_create(Model model) {
        model.addAttribute("surveyform", new Surveyform());
        model.addAttribute("users", this.userService.getAllUser());
        return "survey_create";
    }

   

}
