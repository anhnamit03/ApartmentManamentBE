package com.hvn.controllers1;

import com.hvn.repositories.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Controller to handle invoice-related requests.
 */
@Controller
public class InvoiceController {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @GetMapping("/invoices")
    public String filterInvoices(@RequestParam Map<String, String> params, Model model) {
        String month = params.get("month");
         String year = params.get("year");
        if(month!=null&& !month.isEmpty()&& year!=null&& !year.isEmpty()){
                    // Call repository method to fetch invoices for the specified month and year
        List<Object[]> invoices = this.invoiceRepository.getInvoiceByPaymentMonthAndYear(params);

        // Add fetched data to the model
        model.addAttribute("invoices", invoices);

        // Return the view name to render (assuming "invoices" is the view name)
        }

        return "invoices";
    }
}
