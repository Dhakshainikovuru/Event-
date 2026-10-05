package com.hackathon.decor.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;

@Entity
@Table(name = "decorators")
public class Decorator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String businessName;

    @NotBlank
    private String ownerName;

    @NotBlank
    private String city;

    @NotBlank
    private String serviceType;

    @NotBlank
    private String eventTypes;

    @Positive
    private Double startingPrice;

    @PositiveOrZero
    @Max(5)
    private Double rating;

    @NotBlank
    private String phone;

    @Email
    private String email;

    private String portfolioUrl;

    private boolean available;

    private String description;

    private String imageUrl;

    public Decorator() {}

    public Decorator(String businessName, String ownerName, String city,
                     String serviceType, String eventTypes, Double startingPrice,
                     Double rating, String phone, String email, String portfolioUrl,
                     boolean available, String description, String imageUrl) {
        this.businessName = businessName;
        this.ownerName = ownerName;
        this.city = city;
        this.serviceType = serviceType;
        this.eventTypes = eventTypes;
        this.startingPrice = startingPrice;
        this.rating = rating;
        this.phone = phone;
        this.email = email;
        this.portfolioUrl = portfolioUrl;
        this.available = available;
        this.description = description;
        this.imageUrl = imageUrl;
    }

    public Long getId() { return id; }
    public String getBusinessName() { return businessName; }
    public String getOwnerName() { return ownerName; }
    public String getCity() { return city; }
    public String getServiceType() { return serviceType; }
    public String getEventTypes() { return eventTypes; }
    public Double getStartingPrice() { return startingPrice; }
    public Double getRating() { return rating; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getPortfolioUrl() { return portfolioUrl; }
    public boolean isAvailable() { return available; }
    public String getDescription() { return description; }
    public String getImageUrl() { return imageUrl; }

    public void setId(Long id) { this.id = id; }
    public void setBusinessName(String businessName) { this.businessName = businessName; }
    public void setOwnerName(String ownerName) { this.ownerName = ownerName; }
    public void setCity(String city) { this.city = city; }
    public void setServiceType(String serviceType) { this.serviceType = serviceType; }
    public void setEventTypes(String eventTypes) { this.eventTypes = eventTypes; }
    public void setStartingPrice(Double startingPrice) { this.startingPrice = startingPrice; }
    public void setRating(Double rating) { this.rating = rating; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }
    public void setPortfolioUrl(String portfolioUrl) { this.portfolioUrl = portfolioUrl; }
    public void setAvailable(boolean available) { this.available = available; }
    public void setDescription(String description) { this.description = description; }
    public void setImageUrl(String imageUrl) { this.imageUrl = imageUrl; }
}
