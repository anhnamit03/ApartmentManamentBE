/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.services;

import com.hvn.pojo.User;
import java.util.List;
import java.util.Map;

/**
 *
 * @author hoang
 */
public interface UserService {

    List<User> getUser(Map<String, String> params);

    int CountUser();

    boolean checkUsernameExists(String username);

    void saveUser(User user);

    User getUserByUsername(String username);

    User getUserById(int id);

    void deleteUser(int id);

    void deactivateUser(int id);

    boolean checkUser(User user);

    List<User> getAllUser();

}
