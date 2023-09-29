package com.example.datingadmintracker.service;

import com.example.datingadmintracker.entity.AdminPanelSale;
import com.example.datingadmintracker.repository.AdminPanelSaleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AdminPanelSaleService {

    @Autowired
    private AdminPanelSaleRepository repository;

    // Retrieve all sales
    public List<AdminPanelSale> getAllSales() {
        return repository.findAll();
    }

    // Retrieve a sale by ID
    public Optional<AdminPanelSale> getSaleById(Long id) {
        return repository.findById(id);
    }

    // Create or update a sale
    public AdminPanelSale saveSale(AdminPanelSale sale) {
        return repository.save(sale);
    }

    // Delete a sale by ID
    public void deleteSale(Long id) {
        repository.deleteById(id);
    }

    // Find sales by some criteria (e.g. status, clientContact, etc.)
    public List<AdminPanelSale> findSalesByStatus(String status) {
        // Example: create a method in the repository to find sales by status and call it here.
        // This is just a placeholder; you will need to define actual search criteria based on your needs.
        return repository.findByStatus(status);
    }

    // You can also add other methods here as needed, for example, to perform business logic, calculations, etc.
}

