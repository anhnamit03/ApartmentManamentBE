package com.hvn.repositories.Impl;

import com.hvn.pojo.Reflective;
import com.hvn.pojo.User;
import com.hvn.repositories.ReflectiveRepository;
import java.util.List;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class ReflectiveRepositoryImpl implements ReflectiveRepository {

    @Autowired
    private LocalSessionFactoryBean factory;

    @Override
    public List<Reflective> getReflective() {
        Session s = this.factory.getObject().getCurrentSession();
        Query q = s.createNamedQuery("Reflective.findAll");
        return q.getResultList();
    }

    @Override
    public List<Object[]> getReflectiveWithUserFullname() {
        Session s = this.factory.getObject().getCurrentSession();
        
        // Sử dụng Criteria API để tạo truy vấn
        CriteriaBuilder builder = s.getCriteriaBuilder();
        CriteriaQuery<Object[]> query = builder.createQuery(Object[].class);
        Root<Reflective> reflectiveRoot = query.from(Reflective.class);
        Root<User> userRoot = query.from(User.class);
        
        // Xác định điều kiện join
        query.select(builder.array(reflectiveRoot.get("id"), reflectiveRoot.get("contents"), userRoot.get("fullname")))
             .where(builder.equal(reflectiveRoot.get("userId"), userRoot.get("id")));
        
        // Thực thi truy vấn
        return s.createQuery(query).getResultList();
    }
}
