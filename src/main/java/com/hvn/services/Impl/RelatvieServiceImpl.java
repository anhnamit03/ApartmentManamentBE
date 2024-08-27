/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.services.Impl;

import com.hvn.pojo.Relative;
import com.hvn.repositories.RelativeRepository;
import com.hvn.services.RelativeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hoang
 */
@Service
public class RelatvieServiceImpl implements RelativeService{
    @Autowired
    private RelativeRepository relativeRepository;
    
    @Override
    public List<Relative> getAllRelatives(){
        return this.relativeRepository.getAllRelatives();
    }

    @Override
    public List<Object[]> getAllRelativesOfObject() {
        return this.relativeRepository.getAllRelativesOfObject();
    }

}
