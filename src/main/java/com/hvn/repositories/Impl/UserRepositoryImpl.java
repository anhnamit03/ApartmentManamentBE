/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.repositories.Impl;

import com.hvn.pojo.User;
import com.hvn.repositories.UserRepository;
import java.util.List;
import java.util.Map;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author hoang
 */
@Repository
@Transactional
@PropertySource("classpath:configs.properties")
public class UserRepositoryImpl implements UserRepository {

    @Autowired
    private LocalSessionFactoryBean factory;
    @Autowired
    private Environment env;

    @Override
    public List<User> getUser(Map<String, String> params) {
        Session s = this.factory.getObject().getCurrentSession();
        CriteriaBuilder b = s.getCriteriaBuilder();
        CriteriaQuery<User> q = b.createQuery(User.class);
        Root r = q.from(User.class);
        q.select(r);

        Query query = s.createQuery(q);

        String p = params.get("page");
        if (p != null && !p.isEmpty()) {
            int pageSize = Integer.parseInt(env.getProperty("PAGE_SIZE").toString());
            int start = (Integer.parseInt(p) - 1) * pageSize;
            query.setFirstResult(start);
            query.setMaxResults(pageSize);
        }

        List<User> user = query.getResultList();

        return user;
    }

    @Override
    public int CountUser() {
        Session s = this.factory.getObject().getCurrentSession();
        Query q = s.createQuery("SELECT COUNT(u) FROM User u");
        Long count = (Long) q.getSingleResult();
        return count.intValue();
    }

    @Override
    public boolean checkUsernameExists(String username) {
        Session session = this.factory.getObject().getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Long> query = cb.createQuery(Long.class);
        Root<User> root = query.from(User.class);
        query.select(cb.count(root));
        query.where(cb.equal(root.get("username"), username));

        Long count = session.createQuery(query).getSingleResult();

        return count > 0; // return true if username exists (count > 0)
    }

    @Override
    public void saveUser(User user) {
        Session s = this.factory.getObject().getCurrentSession();
        s.save(user);

    }

    @Override
    public User getUserById(int id) {
        Session s = this.factory.getObject().getCurrentSession();
        return s.get(User.class, id);
    }

    @Override
    public void deleteUser(int id) {
        Session session = this.factory.getObject().getCurrentSession();
        User user = getUserById(id);
        if (user != null) {
            session.delete(user);
        } else {
            throw new IllegalArgumentException("User not found with id: " + id);
        }
    }

    @Override
    public void deactivateUser(int id) {
        Session session = this.factory.getObject().getCurrentSession();
        User user = getUserById(id);
        user.changeStatus((short) 0);
        session.update(user);
    }

    @Override
    public boolean checkUser(User user) {
        User existingUser = getUserByUsername(user.getUsername());

        if (existingUser != null && existingUser.getPassword().equals(user.getPassword())) {
            return true; // Matching username and password
        } else {
            return false; // Not matching or user not found
        }
    }

    @Override
    public User getUserByUsername(String username) {
        Session s = this.factory.getObject().getCurrentSession();
        CriteriaBuilder b = s.getCriteriaBuilder();
        CriteriaQuery<User> query = b.createQuery(User.class);
        Root r = query.from(User.class);
        query.select(r);

        query.where(b.equal(r.get("username"), username));

        Query q = s.createQuery(query);
        return (User) q.getSingleResult();
    }

    @Override
    public List<User> getAllUser() {
        Session session = this.factory.getObject().getCurrentSession();
        return session.createNamedQuery("User.findAll", User.class).getResultList();
    }
}
