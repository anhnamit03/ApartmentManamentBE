/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.repositories;

import com.hvn.pojo.Reflective;
import java.util.List;

/**
 *
 * @author hoang
 */
public interface ReflectiveRepository {
    List<Reflective> getReflective();
    List<Object[]> getReflectiveWithUserFullname();
}
