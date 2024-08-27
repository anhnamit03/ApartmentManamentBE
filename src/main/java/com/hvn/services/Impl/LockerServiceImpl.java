/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.services.Impl;

import com.hvn.pojo.Item;
import com.hvn.pojo.Locker;
import com.hvn.repositories.LockerRepository;
import com.hvn.services.LockerService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hoang
 */
@Service
public class LockerServiceImpl implements LockerService{
    @Autowired
    private LockerRepository lockerRepository;

    @Override
    public List<Object[]> getLocker() {
        return this.lockerRepository.getLocker();
    }

    @Override
    public List<Item> getItemByIDLocker(int id) {
        return this.lockerRepository.getItemByIDLocker(id);
    }
    
    @Override
    public List<Item> getItemByIDLockerToStored(int lockerId){
        return this.lockerRepository.getItemByIDLockerToStored(lockerId);
    }
    @Override
    public List<Object[]> getItemByIDLockerQueryAPI(int lockerID){
        return this.lockerRepository.getItemByIDLockerQueryAPI(lockerID);
    }
    @Override
    public void deleteItem(Item item){
        this.lockerRepository.deleteItem(item);
    }
    @Override
    public Item getItemByID(int id ){
        return this.lockerRepository.getItemByID(id);
    }
}
