/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hvn.services;

import java.util.List;
import java.util.Map;

/**
 *
 * @author hoang
 */

public interface InvoiceService {
    List<Object[]> getInvoiceByPaymentMonthAndYear(Map<String, String> params);
}
