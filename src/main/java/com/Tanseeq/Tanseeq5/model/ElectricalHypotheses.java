package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "electrical_hypotheses")
public class ElectricalHypotheses extends BaseEntity {
    private String details;
    public ElectricalHypotheses() {}
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
}
