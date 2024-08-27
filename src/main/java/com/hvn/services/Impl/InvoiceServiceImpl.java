/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.services.Impl;

import com.hvn.repositories.InvoiceRepository;
import com.hvn.services.InvoiceService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author hoang
 */
@Service
public class InvoiceServiceImpl implements InvoiceService{
    @Autowired
    private InvoiceRepository invoiceRepository;

    @Override
    public List<Object[]> getInvoiceByPaymentMonthAndYear(Map<String, String> params) {
        return this.invoiceRepository.getInvoiceByPaymentMonthAndYear( params);
    }
    
}
