package com.example.springbootjdbc.Controllers;
import com.example.springbootjdbc.model.Invoice;
import com.example.springbootjdbc.service.InvoiceService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
public class InvoiceController {
    private final InvoiceService invoiceService;

    @Autowired
    public InvoiceController(InvoiceService invoiceService) {
        this.invoiceService = invoiceService;
    }

    @GetMapping("invoice")
    public String switchToInvoicePage(HttpSession session, ModelMap model){
        model.addAttribute("invoiceList",invoiceService.displayInvoices((String) session.getAttribute("username")));
        return "invoice";
    }
    @PostMapping("payment")
    public String createInvoice(HttpSession session, @ModelAttribute Invoice invoice) {
        invoice.setId_coworker((String) session.getAttribute("username"));
        invoiceService.addInvoice(invoice);
        return "payment";
    }

    @PostMapping("invoice")
    public String updateInvoice(){
        return "redirect:/invoice";
    }
    
    @PostMapping("edit/delete*")
    public String deleteInvoice(@RequestParam int id){
        invoiceService.deleteInvoice(id);
        return "invoice";
    }

    @RequestMapping("edit/update")
    public String test(@RequestParam int id, ModelMap model){
        Invoice invoice = invoiceService.findById(id);
        model.addAttribute("invoice",invoice);
        return "edit";
    }

//    @PostMapping("edit/update*")
//    public String updateInvoice(){
//        return "redirect:/invoice";
//    }

//    @PostMapping("edit/update*")
//    public String test(@RequestParam int id, ModelMap model){
//        Invoice invoice = invoiceService.findById(id);
//        model.addAttribute("invoice",invoice);
//        return "edit";
//    }
}