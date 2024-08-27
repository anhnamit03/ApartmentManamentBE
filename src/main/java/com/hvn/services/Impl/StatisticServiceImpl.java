/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.services.Impl;

import com.hvn.repositories.StatisticRepository;
import com.hvn.services.StatisticService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hoang
 */
@Service
public class StatisticServiceImpl implements StatisticService{
    @Autowired
    private StatisticRepository  statisticRepository;

    @Override
    public List<Object[]> getStatisticByMonthAndYear(int month, int year) {
        return this.statisticRepository.getStatisticByMonthAndYear(month, year);
    }
     
}
