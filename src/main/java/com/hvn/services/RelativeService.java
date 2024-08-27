/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.services;

import com.hvn.pojo.Relative;
import java.util.List;

/**
 *
 * @author hoang
 */
public interface RelativeService {
        List<Relative> getAllRelatives();
        List<Object[]> getAllRelativesOfObject();

    
}
