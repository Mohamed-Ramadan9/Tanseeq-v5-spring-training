package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "center_people_details")
public class CenterPeopleDetails extends BaseEntity {
    private String details;
    public CenterPeopleDetails() {}
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
}
