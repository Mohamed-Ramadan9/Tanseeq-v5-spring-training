package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "camp_addition_details")
public class CampAdditionDetail extends BaseEntity {
    private String addition;
    public CampAdditionDetail() {}
    public String getAddition() { return addition; }
    public void setAddition(String addition) { this.addition = addition; }
}
