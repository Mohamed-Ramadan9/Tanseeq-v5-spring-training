package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "rejected_rental_applications")
public class RejectedRentalApplication extends BaseEntity {
    private String reason;
    public RejectedRentalApplication() {}
    public String getReason() { return reason; }
    public void setReason(String reason) { this.reason = reason; }
}
