package com.Tanseeq.Tanseeq5.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "subsistences")
public class Subsistence extends BaseEntity {
    private String detail;
    public Subsistence() {}
    public String getDetail() { return detail; }
    public void setDetail(String detail) { this.detail = detail; }
}
