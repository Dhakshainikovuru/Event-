package com.hackathon.decor.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private Long decoratorId;

    @NotBlank
    private String customerName;

    @NotBlank
    @Pattern(regexp = "^[0-9]{10}$", message = "Phone must contain exactly 10 digits")
    private String phone;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private String eventType;

    @NotNull
    @FutureOrPresent
    private LocalDate eventDate;

    @NotBlank
    private String location;

    @NotNull
    @Positive
    private Double budget;

    private String message;

    private String status;

    public Booking() {}

    public Long getId() { return id; }
    public Long getDecoratorId() { return decoratorId; }
    public String getCustomerName() { return customerName; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public String getEventType() { return eventType; }
    public LocalDate getEventDate() { return eventDate; }
    public String getLocation() { return location; }
    public Double getBudget() { return budget; }
    public String getMessage() { return message; }
    public String getStatus() { return status; }

    public void setId(Long id) { this.id = id; }
    public void setDecoratorId(Long decoratorId) { this.decoratorId = decoratorId; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }
    public void setEventType(String eventType) { this.eventType = eventType; }
    public void setEventDate(LocalDate eventDate) { this.eventDate = eventDate; }
    public void setLocation(String location) { this.location = location; }
    public void setBudget(Double budget) { this.budget = budget; }
    public void setMessage(String message) { this.message = message; }
    public void setStatus(String status) { this.status = status; }
}
