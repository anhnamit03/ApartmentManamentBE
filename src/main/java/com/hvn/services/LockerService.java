package com.hvn.services;

import com.hvn.pojo.Item;
import com.hvn.pojo.Locker;
import java.util.List;
import java.util.Map;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author hoang
 */
public interface LockerService {

    List<Object[]> getLocker();

    List<Item> getItemByIDLocker(int id);

    List<Item> getItemByIDLockerToStored(int lockerId);

    List<Object[]> getItemByIDLockerQueryAPI(int lockerID);

    void deleteItem(Item item);

    Item getItemByID(int id);
}
