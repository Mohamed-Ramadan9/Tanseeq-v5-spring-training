package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "reinforcement_requests")
public class ReinforcementRequest extends BaseEntity {
    private String details;
    public ReinforcementRequest() {}
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
}
