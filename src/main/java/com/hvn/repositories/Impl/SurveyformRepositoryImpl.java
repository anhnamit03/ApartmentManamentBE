/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.repositories.Impl;

import com.hvn.pojo.Surveyform;
import com.hvn.repositories.SurveyformRepository;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author hoang
 */
@Repository
@Transactional
public class SurveyformRepositoryImpl implements SurveyformRepository {

    @Autowired
    private LocalSessionFactoryBean factory;

    public List<Object[]> getSurveyform() {
        Session session = factory.getObject().getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Object[]> query = cb.createQuery(Object[].class);
        Root<Surveyform> root = query.from(Surveyform.class);

        // Define what columns you want in the result array
        query.multiselect(
                root.get("id"), 
                root.get("innitiatedDate"), 
                root.get("description") ,
                root.get("idUser")
        );

        // Execute query
        Query<Object[]> typedQuery = session.createQuery(query);
        List<Object[]> results = typedQuery.getResultList();

        return results;
    }

}
