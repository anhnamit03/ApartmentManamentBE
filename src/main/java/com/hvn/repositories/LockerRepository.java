/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.repositories;

import com.hvn.pojo.Item;
import com.hvn.pojo.Locker;
import com.hvn.pojo.Reflective;
import com.hvn.pojo.User;
import java.util.List;
import java.util.Map;

/**
 *
 * @author hoang
 */
public interface LockerRepository {

    List<Object[]> getLocker();
    List<Item> getItemByIDLocker(int id);
    List<Item> getItemByIDLockerToStored(int lockerID);
    List<Object[]> getItemByIDLockerQueryAPI(int lockerID);
    void deleteItem(Item item);
    Item getItemByID(int id);
}
