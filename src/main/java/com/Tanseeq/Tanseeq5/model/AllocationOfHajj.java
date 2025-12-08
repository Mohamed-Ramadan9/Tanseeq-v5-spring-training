package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "allocation_of_hajj")
public class AllocationOfHajj extends BaseEntity {
    private String details;
    public AllocationOfHajj() {}
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
}
