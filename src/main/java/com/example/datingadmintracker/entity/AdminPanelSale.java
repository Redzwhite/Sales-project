package com.example.datingadmintracker.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import java.util.Date;

@Entity
@Table(name = "admin_panel_sales")
public class AdminPanelSale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @CreationTimestamp
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    @Column(name = "application_date", nullable = false, updatable = false)
    private Date applicationDate;

    @Column(name = "client_contact", nullable = false)
    private String clientContact;

    @Column(name = "website_name", nullable = false)
    private String websiteName;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "notes")
    private String notes;

    @Column(name = "document_url")
    private String documentUrl;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public String getClientContact() {
        return clientContact;
    }

    public void setClientContact(String clientContact) {
        this.clientContact = clientContact;
    }

    public String getWebsiteName() {
        return websiteName;
    }

    public void setWebsiteName(String websiteName) {
        this.websiteName = websiteName;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getDocumentUrl() {
        return documentUrl;
    }

    public void setDocumentUrl(String documentUrl) {
        this.documentUrl = documentUrl;
    }

    public String getStatusCssClass() {
        switch (this.status) {
            case IN_PROGRESS:
                return "status-in-progress";
            case CLOSED:
                return "status-closed";
            case CANCELED:
                return "status-canceled";
            default:
                return "";
        }
    }
}

enum Status {
    IN_PROGRESS("синий"),
    CLOSED("зелёный"),
    CANCELED("красный");

    private final String color;

    Status(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }


}

