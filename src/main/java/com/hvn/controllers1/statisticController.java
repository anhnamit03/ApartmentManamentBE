/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.controllers1;

import com.hvn.services.StatisticService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author hoang
 */
@Controller
public class statisticController {

    @Autowired
    private StatisticService statisticService;

    @RequestMapping("/statistics/")
    public String getRelative(@RequestParam Map<String, String> params, Model model) {

        int month = 0;
        int year = 0;

        if (params.get("month") != null && !params.get("month").isEmpty()) {
            month = Integer.parseInt(params.get("month"));
        }
        if (params.get("year") != null && !params.get("year").isEmpty()) {
            year = Integer.parseInt(params.get("year"));
        }

        if (month > 0 && year > 0) {
            model.addAttribute("statistics", statisticService.getStatisticByMonthAndYear(month, year));
        } else {
            // Xử lý khi month hoặc year không hợp lệ
            model.addAttribute("error", "Vui lòng nhập tháng và năm hợp lệ.");
        }

        return "statistics";
    }
}
