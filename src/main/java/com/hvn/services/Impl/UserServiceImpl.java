/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.services.Impl;

import com.hvn.pojo.User;
import com.hvn.repositories.UserRepository;
import com.hvn.services.UserService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author hoang
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public int CountUser() {
        return this.userRepository.CountUser();

    }

    @Override
    public List<User> getUser(Map<String, String> params) {
        return this.userRepository.getUser(params);
    }

    @Override
    public boolean checkUsernameExists(String string) {
        return this.userRepository.checkUsernameExists(string);
    }

    @Override
    public void saveUser(User user) {
        this.userRepository.saveUser(user);
    }



    @Override
    public User getUserById(int id) {
        return  this.userRepository.getUserById(id);
    }
        @Override
    public void deleteUser(int id) {
        this.userRepository.deleteUser(id);
    }

    @Override
    public void deactivateUser(int id) {
        this.userRepository.deactivateUser(id);
    }

    @Override
    public List<User> getAllUser() {
        return this.userRepository.getAllUser();
    }

    @Override
    public User getUserByUsername(String string) {
        return this.userRepository.getUserByUsername(string);
    }

    @Override
    public boolean checkUser(User user) {
       return this.userRepository.checkUser(user);
    }
}
