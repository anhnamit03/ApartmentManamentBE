package com.hvn.repositories.Impl;

import com.hvn.pojo.Relative;
import com.hvn.repositories.RelativeRepository;
import java.util.List;
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
public class RelativeRepositoryImpl implements RelativeRepository {

    @Autowired
    private LocalSessionFactoryBean factory;

    @Override
    public List<Relative> getAllRelatives() {
        Session session = factory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Relative> query = builder.createQuery(Relative.class);
        Root<Relative> root = query.from(Relative.class);
        query.select(root);

        return session.createQuery(query).getResultList();
    }
    @Override
    public List<Object[]> getAllRelativesOfObject() {
        Session session = factory.getObject().getCurrentSession();
        CriteriaBuilder builder = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> query = builder.createQuery(Object[].class);
        Root<Relative> root = query.from(Relative.class);

        // Specify the fields you want to retrieve
        query.multiselect(
            root.get("id"),
            root.get("nameRelative"),
            root.get("cccd"),
            root.get("phone"),
            root.get("relationship"),
            root.get("idUser")
        );

        return session.createQuery(query).getResultList();
    }
}
