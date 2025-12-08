package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tents")
public class Tent extends BaseEntity {
    private String tentNumber;
    public Tent() {}
    public String getTentNumber() { return tentNumber; }
    public void setTentNumber(String tentNumber) { this.tentNumber = tentNumber; }
}
