/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.repositories.Impl;

import com.hvn.pojo.Item;
import com.hvn.pojo.Locker;
import com.hvn.pojo.Status;
import com.hvn.repositories.LockerRepository;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Root;

/**
 *
 * @author hoang
 */
@Repository
@Transactional
public class LockerRepositoryImpl implements LockerRepository {

    @Autowired
    private LocalSessionFactoryBean factory;
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Object[]> getLocker() {
        Session session = this.factory.getObject().getCurrentSession();

        // Sử dụng Criteria API để tạo truy vấn
        Query<Object[]> query = session.createQuery("SELECT l.id, u.id, u.fullname FROM User u JOIN u.idLocker l", Object[].class);

        // Thực thi truy vấn
        return query.getResultList();
    }

    @Override
    public List<Item> getItemByIDLocker(int id) {
        Session session = factory.getObject().getCurrentSession();
        Query<Item> query = session.createQuery("SELECT i FROM Item i LEFT JOIN FETCH i.idStatus WHERE i.idLocker.id = :lockerId", Item.class);
        query.setParameter("lockerId", id);
        return query.getResultList();
    }

    public List<Item> getItemByIDLockerToStored(int lockerId) {
         // Gọi stored procedure từ database
        StoredProcedureQuery query = entityManager.createStoredProcedureQuery("get_item_by_lockerID", Item.class);
        query.registerStoredProcedureParameter(1, Integer.class, javax.persistence.ParameterMode.IN);
        query.setParameter(1, lockerId);

        // Thực thi query và trả về kết quả
        return query.getResultList(); 
    }
     @Override
    public List<Object[]> getItemByIDLockerQueryAPI(int lockerID) {
        Session session = factory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> query = builder.createQuery(Object[].class);

        Root<Item> itemRoot = query.from(Item.class);
        Join<Item, Locker> lockerJoin = itemRoot.join("idLocker");
        Join<Item, Status> statusJoin = itemRoot.join("idStatus");

        // Xác định các trường cần lấy
        query.multiselect(
            itemRoot.get("id"),
            itemRoot.get("name"),
            itemRoot.get("description"),
            itemRoot.get("receivedTime"),
            itemRoot.get("returnedTime"),
            lockerJoin.get("id"),
            statusJoin.get("id")
        );

        // Thêm điều kiện cho id_locker
        query.where(builder.equal(lockerJoin.get("id"), lockerID));

        return session.createQuery(query).getResultList();
    }

    @Override
    public void deleteItem(Item item) {
        Session s = this.factory.getObject().getCurrentSession();
        s.delete(item);
    }
    @Override
    public Item getItemByID(int id ){
        Session s  = this.factory.getObject().getCurrentSession();
        return s.get(Item.class, id);
               
    }
}
