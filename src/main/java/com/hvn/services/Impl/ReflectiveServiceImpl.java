/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.services.Impl;

import com.hvn.pojo.Reflective;
import com.hvn.repositories.ReflectiveRepository;
import com.hvn.services.ReflectiveService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hoang
 */
@Service
public class ReflectiveServiceImpl implements ReflectiveService{
    @Autowired
    private  ReflectiveRepository reflectiveRepository;

    @Override
    public List<Reflective> getReflective() {
        return this.reflectiveRepository.getReflective();
    }
    @Override
    public List<Object[]> getReflectiveWithUserFullname() {
        return this.reflectiveRepository.getReflectiveWithUserFullname();
    }
    
}
