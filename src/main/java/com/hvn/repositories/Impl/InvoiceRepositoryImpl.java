/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.repositories.Impl;

import com.hvn.repositories.InvoiceRepository;
import java.util.List;
import java.util.Map;
import javax.persistence.ParameterMode;
import javax.persistence.StoredProcedureQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author hoang
 */
@Repository
@Transactional
public class InvoiceRepositoryImpl implements InvoiceRepository {

    @Autowired
    private LocalSessionFactoryBean factory;

    @Override
    public List<Object[]> getInvoiceByPaymentMonthAndYear(Map<String, String> params) {
        Session session = factory.getObject().getCurrentSession();
        
        StoredProcedureQuery query = session.createStoredProcedureQuery("search_payment_month_year");
        
        // Registering the parameters
        query.registerStoredProcedureParameter("thang", Integer.class, ParameterMode.IN);
        query.registerStoredProcedureParameter("nam", Integer.class, ParameterMode.IN);
        
        // Setting the parameter values
        int month = Integer.parseInt(params.get("month"));
        int year = Integer.parseInt(params.get("year"));
        query.setParameter("thang", month);
        query.setParameter("nam", year);
        
        // Executing the query
        return query.getResultList();
    }
}
