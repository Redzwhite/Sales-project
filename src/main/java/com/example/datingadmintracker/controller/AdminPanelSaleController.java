package com.example.datingadmintracker.controller;

import com.example.datingadmintracker.entity.AdminPanelSale;
import com.example.datingadmintracker.service.AdminPanelSaleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminPanelSaleController {

    @Autowired
    private AdminPanelSaleService service;

    @GetMapping("/admin-panel-sales")
    public String showAdminPanelSales(Model model) {
        model.addAttribute("sales", service.getAllSales());
        return "admin-panel-sales";
    }

    @PostMapping("/admin-panel-sales")
    public String createSale(@ModelAttribute AdminPanelSale sale) {
        service.saveSale(sale);
        return "redirect:/admin-panel-sales";
    }

    @PostMapping("/admin-panel-sales/update")
    public String updateSale(@ModelAttribute AdminPanelSale sale) {
        service.saveSale(sale);
        return "redirect:/admin-panel-sales";
    }

    @PostMapping("/admin-panel-sales/delete")
    public String deleteSale(@RequestParam Long id) {
        service.deleteSale(id);
        return "redirect:/admin-panel-sales";
    }


}

