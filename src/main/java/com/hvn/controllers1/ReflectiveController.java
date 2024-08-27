/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.controllers1;

import com.hvn.services.ReflectiveService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author hoang
 */
@Controller
public class ReflectiveController {
        @Autowired
    private ReflectiveService reflectiveService;
        
    @RequestMapping("/reflectives")
    public String reflective(Model model) {
        List<Object[]> feedbacks = reflectiveService.getReflectiveWithUserFullname();
        model.addAttribute("feedbacks", feedbacks);
        return "reflectives";
    }

}
