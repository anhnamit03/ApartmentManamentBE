/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.controllers1;

import com.hvn.services.RelativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author hoang
 */
@Controller
public class relativeController {
    @Autowired
    private RelativeService relativeService;
    
    @RequestMapping("/relatives")
    public String getRelative(Model model){
        model.addAttribute("relatives", this.relativeService.getAllRelativesOfObject());
        return "relatives";
    }
    
}
