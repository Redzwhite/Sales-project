package com.example.datingadmintracker.repository;

import com.example.datingadmintracker.entity.AdminPanelSale;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminPanelSaleRepository extends JpaRepository<AdminPanelSale, Long> {
    List<AdminPanelSale> findByStatus(String status);
}



