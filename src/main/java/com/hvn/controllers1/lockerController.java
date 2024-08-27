/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.controllers1;

import com.hvn.pojo.User;
import com.hvn.services.LockerService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author hoang
 */
@Controller
public class lockerController {
    @Autowired
    private LockerService lockerService;

    @GetMapping("/lockers")
    public String getLocker(Model model) {
        List<Object[]> lockers = this.lockerService.getLocker();
        model.addAttribute("lockers",lockers);    
        return "lockers";
    }
    @GetMapping("/lockers/items/{lockerId}")
    public String item(@PathVariable Integer lockerId, Model model) {
        model.addAttribute("Item", this.lockerService.getItemByIDLockerQueryAPI(lockerId));
        return "item";
    }
    
    

}
